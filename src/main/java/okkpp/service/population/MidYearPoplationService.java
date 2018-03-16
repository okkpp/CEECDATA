package okkpp.service.population;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import okkpp.dao.population.MidYearPoplationMapper;
import okkpp.model.population.MidYearPoplation;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MidYearPoplationService {

	@Autowired
	MidYearPoplationMapper mapper;
	
	public List<MidYearPoplation> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<MidYearPoplation> selectByExample(String column,String condition){
		Example example = new Example(MidYearPoplation.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
	
}
