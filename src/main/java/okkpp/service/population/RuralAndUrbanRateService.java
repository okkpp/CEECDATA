package okkpp.service.population;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import okkpp.dao.population.RuralAndUrbanRateMapper;
import okkpp.model.population.RuralAndUrbanRate;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RuralAndUrbanRateService {

	@Autowired
	RuralAndUrbanRateMapper mapper;
	
	public List<RuralAndUrbanRate> selectAll(){
		return mapper.selectAll();
	}
	
	public List<RuralAndUrbanRate> selectByExample(String country){
		return null;
	}
	
}
