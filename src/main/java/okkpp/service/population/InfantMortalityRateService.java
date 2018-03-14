package okkpp.service.population;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import okkpp.dao.population.InfantMortalityRateMapper;
import okkpp.model.population.InfantMortalityRate;
import okkpp.utils.CountryCode;

import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class InfantMortalityRateService {

	@Autowired
	InfantMortalityRateMapper mapper;
	
	public List<InfantMortalityRate> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<InfantMortalityRate> selectByExample(String country){
		return null;
	}
	
}