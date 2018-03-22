package okkpp.service.finance;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.finance.DomesticCreditMapper;
import okkpp.model.finance.DomesticCredit;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午10:49:35
*/
@Service
@Transactional
public class DomesticCreditService {

	@Autowired
	DomesticCreditMapper mapper;
	public List<DomesticCredit> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(DomesticCredit.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<DomesticCredit> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(DomesticCredit.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<DomesticCredit> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// DomesticCredit更新
	public int updateDomesticCredit(DomesticCredit domesticCredit) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(domesticCredit);
	}

	// DomesticCredit插入
	public int insertDomesticCredit(DomesticCredit domesticCredit) {
		return mapper.insertSelective(domesticCredit);
	}

	// DomesticCredit删除
	public int deleteDomesticCredit(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
