package okkpp.service.population;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
<<<<<<< HEAD:src/main/java/okkpp/service/population/BirthAndDeathRateService.java
import okkpp.dao.population.BirthAndDeathRateMapper;
import okkpp.model.population.BirthAndDeathRate;
=======

import okkpp.dao.population.BirthRateDeathRateMapper;
import okkpp.model.population.BirthRateDeathRate;
>>>>>>> d0139bd9fc30a7b604936054ad68ca936ce451a1:src/main/java/okkpp/service/population/BirthRateDeathRateService.java
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BirthRateDeathRateService {

	@Autowired
	BirthRateDeathRateMapper mapper;
	
	public List<BirthRateDeathRate> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
<<<<<<< HEAD:src/main/java/okkpp/service/population/BirthAndDeathRateService.java

	public List<BirthAndDeathRate> selectByExample(String column,String condition){
		Example example = new Example(BirthAndDeathRate.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
=======
	
	public List<BirthRateDeathRate> selectByExample(String country){
		return null;
>>>>>>> d0139bd9fc30a7b604936054ad68ca936ce451a1:src/main/java/okkpp/service/population/BirthRateDeathRateService.java
	}
	
}
