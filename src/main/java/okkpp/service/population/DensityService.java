package okkpp.service.population;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import okkpp.dao.population.DensityMapper;
import okkpp.model.population.Density;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DensityService {

	@Autowired
	DensityMapper mapper;
	
	public List<Density> selectAll(){
		return mapper.selectAll();
	}
	
	public List<Density> selectByExample(String country){
		return null;
	}
	
}
