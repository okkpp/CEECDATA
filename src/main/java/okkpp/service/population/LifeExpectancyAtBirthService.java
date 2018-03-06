package okkpp.service.population;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import okkpp.dao.population.LifeExpectancyAtBirthMapper;
import okkpp.model.population.LifeExpectancyAtBirth;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LifeExpectancyAtBirthService {

	@Autowired
	LifeExpectancyAtBirthMapper mapper;
	
	public List<LifeExpectancyAtBirth> selectAll(){
		return mapper.selectAll();
	}
	
	public List<LifeExpectancyAtBirth> selectByExample(String country){
		return null;
	}
	
}
