package okkpp.service.population;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import okkpp.dao.population.BirthRateDeathRateMapper;
import okkpp.model.population.BirthRateDeathRate;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class BirthRateDeathRateService {

	@Autowired
	BirthRateDeathRateMapper mapper;
	
	public List<BirthRateDeathRate> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn){		
		PageHelper.startPage(pn, 10);
		List<BirthRateDeathRate> list = mapper.selectAll();
		return new PageInfo(list, 10);
	}
	
	public List<BirthRateDeathRate> selectByExample(String column,String condition){
		Example example = new Example(BirthRateDeathRate.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));

	}
}
