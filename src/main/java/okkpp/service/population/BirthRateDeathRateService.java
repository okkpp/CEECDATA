package okkpp.service.population;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import okkpp.dao.population.BirthRateDeathRateMapper;
import okkpp.model.population.BirthRateDeathRate;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class BirthRateDeathRateService {

	@Autowired
	BirthRateDeathRateMapper mapper;
	
	public List<BirthRateDeathRate> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(BirthRateDeathRate.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<BirthRateDeathRate> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(BirthRateDeathRate.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<BirthRateDeathRate> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// BirthRateDeathRate¸üÐÂ
	public int updateBirthRateDeathRate(BirthRateDeathRate birthRateDeathRate) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(birthRateDeathRate);
	}

	// BirthRateDeathRate²åÈë
	public int insertBirthRateDeathRate(BirthRateDeathRate birthRateDeathRate) {
		return mapper.insertSelective(birthRateDeathRate);
	}

	// BirthRateDeathRateÉ¾³ý
	public int deleteBirthRateDeathRate(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
