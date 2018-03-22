package okkpp.service.finance;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.finance.BankCapitalMapper;
import okkpp.model.finance.BankCapital;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午10:42:40
*/
@Service
@Transactional
public class BankCapitalService {

	@Autowired
	BankCapitalMapper mapper;
	public List<BankCapital> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(BankCapital.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<BankCapital> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(BankCapital.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<BankCapital> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// BankCapital更新
	public int updateBankCapital(BankCapital bankCapital) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(bankCapital);
	}

	// BankCapital插入
	public int insertBankCapital(BankCapital bankCapital) {
		return mapper.insertSelective(bankCapital);
	}

	// BankCapital删除
	public int deleteBankCapital(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
