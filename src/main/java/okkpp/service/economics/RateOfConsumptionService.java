package okkpp.service.economics;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.economics.RateOfConsumptionMapper;
import okkpp.model.economics.RateOfConsumption;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:18:27
*/
@Service
@Transactional
public class RateOfConsumptionService {

	@Autowired
	RateOfConsumptionMapper mapper;
	public List<RateOfConsumption> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(RateOfConsumption.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<RateOfConsumption> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(RateOfConsumption.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<RateOfConsumption> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// RateOfConsumption更新
	public int updateRateOfConsumption(RateOfConsumption rateOfConsumption) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(rateOfConsumption);
	}

	// RateOfConsumption插入
	public int insertRateOfConsumption(RateOfConsumption rateOfConsumption) {
		return mapper.insertSelective(rateOfConsumption);
	}

	// RateOfConsumption删除
	public int deleteRateOfConsumption(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
