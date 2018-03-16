package okkpp.service.population;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import okkpp.dao.population.BirthRateDeathRateMapper;
import okkpp.model.population.BirthRateDeathRate;
import okkpp.utils.CountryCode;

import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BirthRateDeathRateService {

	@Autowired
	BirthRateDeathRateMapper mapper;
	
	public List<BirthRateDeathRate> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<BirthRateDeathRate> selectByExample(String country){
		return null;
	}
	
}
