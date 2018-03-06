package okkpp.service.population;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import okkpp.dao.population.FemalePercentMapper;
import okkpp.model.population.FemalePercent;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FemalePercentService {

	@Autowired
	FemalePercentMapper mapper;
	
	public List<FemalePercent> selectAll(){
		return mapper.selectAll();
	}
	
	public List<FemalePercent> selectByExample(String country){
		return null;
	}
	
}
