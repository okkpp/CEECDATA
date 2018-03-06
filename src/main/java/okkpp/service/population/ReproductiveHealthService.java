package okkpp.service.population;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import okkpp.dao.population.ReproductiveHealthMapper;
import okkpp.model.population.ReproductiveHealth;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ReproductiveHealthService {

	@Autowired
	ReproductiveHealthMapper mapper;
	
	public List<ReproductiveHealth> selectAll(){
		return mapper.selectAll();
	}
	
	public List<ReproductiveHealth> selectByExample(String country){
		return null;
	}
	
}
