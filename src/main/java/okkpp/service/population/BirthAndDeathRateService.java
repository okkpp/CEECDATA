package okkpp.service.population;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import okkpp.dao.population.BirthAndDeathRateMapper;
import okkpp.model.population.BirthAndDeathRate;

import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BirthAndDeathRateService {

	@Autowired
	BirthAndDeathRateMapper mapper;
	
	public List<BirthAndDeathRate> selectAll(){
		return mapper.selectAll();
	}
	
	public List<BirthAndDeathRate> selectByExample(String country){
		return null;
	}
	
}
