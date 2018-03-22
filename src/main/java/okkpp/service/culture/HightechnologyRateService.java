package okkpp.service.culture;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.culture.HightechnologyRateMapper;
import okkpp.model.culture.HightechnologyRate;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date ����ʱ�䣺2018��3��6�� ����8:50:00
*/
@Service
@Transactional
public class HightechnologyRateService {

	@Autowired
	HightechnologyRateMapper mapper;
	public List<HightechnologyRate> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(HightechnologyRate.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<HightechnologyRate> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(HightechnologyRate.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<HightechnologyRate> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// HightechnologyRate����
	public int updateHightechnologyRate(HightechnologyRate hightechnologyRate) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(hightechnologyRate);
	}

	// HightechnologyRate����
	public int insertHightechnologyRate(HightechnologyRate hightechnologyRate) {
		return mapper.insertSelective(hightechnologyRate);
	}

	// HightechnologyRateɾ��
	public int deleteHightechnologyRate(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
