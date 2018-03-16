package okkpp.service.population;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import okkpp.dao.population.FemalePercentMapper;
import okkpp.model.population.FemalePercent;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FemalePercentService {

	@Autowired
	FemalePercentMapper mapper;
	
	public List<FemalePercent> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<FemalePercent> selectByExample(String column,String condition){
		Example example = new Example(FemalePercent.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
	
}
