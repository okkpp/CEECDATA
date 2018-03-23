package okkpp.service.population;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import okkpp.dao.population.InfantMortalityRateMapper;
import okkpp.model.population.InfantMortalityRate;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class InfantMortalityRateService {

	@Autowired
	InfantMortalityRateMapper mapper;
	
	public List<InfantMortalityRate> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(InfantMortalityRate.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<InfantMortalityRate> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(InfantMortalityRate.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<InfantMortalityRate> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// InfantMortalityRate¸üÐÂ
	public int updateInfantMortalityRate(InfantMortalityRate infantMortalityRate) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(infantMortalityRate);
	}

	// InfantMortalityRate²åÈë
	public int insertInfantMortalityRate(InfantMortalityRate infantMortalityRate) {
		return mapper.insertSelective(infantMortalityRate);
	}

	// InfantMortalityRateÉ¾³ý
	public int deleteInfantMortalityRate(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
