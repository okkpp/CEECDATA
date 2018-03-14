package okkpp.service.population;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import okkpp.dao.population.CompositionDependencyRatioMapper;
import okkpp.model.population.CompositionDependencyRatio;
import okkpp.utils.CountryCode;

@Service
@Transactional
public class CompositionDependencyRatioService {

	@Autowired
	CompositionDependencyRatioMapper mapper;
	
	public List<CompositionDependencyRatio> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<CompositionDependencyRatio> selectByExample(String country){
		return null;
	}
	
}