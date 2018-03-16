package okkpp.service.population;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import okkpp.dao.population.BirthAndDeathRateMapper;
import okkpp.model.population.BirthAndDeathRate;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BirthAndDeathRateService {

	@Autowired
	BirthAndDeathRateMapper mapper;
	
	public List<BirthAndDeathRate> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}

	public List<BirthAndDeathRate> selectByExample(String column,String condition){
		Example example = new Example(BirthAndDeathRate.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
	
}
