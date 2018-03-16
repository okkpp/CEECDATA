package okkpp.service.population;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import okkpp.dao.population.ReproductiveHealthMapper;
import okkpp.model.population.ReproductiveHealth;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ReproductiveHealthService {

	@Autowired
	ReproductiveHealthMapper mapper;
	
	public List<ReproductiveHealth> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<ReproductiveHealth> selectByExample(String column,String condition){
		Example example = new Example(ReproductiveHealth.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
	
}
