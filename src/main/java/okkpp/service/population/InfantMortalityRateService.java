package okkpp.service.population;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import okkpp.dao.population.InfantMortalityRateMapper;
import okkpp.model.population.InfantMortalityRate;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class InfantMortalityRateService {

	@Autowired
	InfantMortalityRateMapper mapper;
	
	public List<InfantMortalityRate> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn){		
		PageHelper.startPage(pn, 10);
		List<InfantMortalityRate> list = mapper.selectAll();
		return new PageInfo(list, 10);
	}
	
	public List<InfantMortalityRate> selectByExample(String column,String condition){
		Example example = new Example(InfantMortalityRate.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
	
}
