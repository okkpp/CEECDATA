package okkpp.service.population;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.population.CompositionDependencyRatioMapper;
import okkpp.model.population.CompositionDependencyRatio;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class CompositionDependencyRatioService {

	@Autowired
	CompositionDependencyRatioMapper mapper;
	
	public List<CompositionDependencyRatio> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn){		
		PageHelper.startPage(pn, 10);
		List<CompositionDependencyRatio> list = mapper.selectAll();
		return new PageInfo(list, 10);
	}
	
	public List<CompositionDependencyRatio> selectByExample(String column,String condition){
		Example example = new Example(CompositionDependencyRatio.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
