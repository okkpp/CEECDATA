package okkpp.service.culture;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.culture.HealthTotalRateMapper;
import okkpp.model.culture.HealthTotalRate;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date ����ʱ�䣺2018��3��6�� ����8:47:40
*/
@Service
@Transactional
public class HealthTotalRateService {

	@Autowired
	HealthTotalRateMapper mapper;
	public List<HealthTotalRate> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(HealthTotalRate.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<HealthTotalRate> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(HealthTotalRate.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<HealthTotalRate> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// HealthTotalRate����
	public int updateHealthTotalRate(HealthTotalRate healthTotalRate) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(healthTotalRate);
	}

	// HealthTotalRate����
	public int insertHealthTotalRate(HealthTotalRate healthTotalRate) {
		return mapper.insertSelective(healthTotalRate);
	}

	// HealthTotalRateɾ��
	public int deleteHealthTotalRate(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
