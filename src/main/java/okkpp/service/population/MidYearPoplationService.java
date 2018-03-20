package okkpp.service.population;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import okkpp.dao.population.MidYearPoplationMapper;
import okkpp.model.population.MidYearPoplation;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class MidYearPoplationService {

	@Autowired
	MidYearPoplationMapper mapper;
	
	public List<MidYearPoplation> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn){		
		PageHelper.startPage(pn, 10);
		List<MidYearPoplation> list = mapper.selectAll();
		return new PageInfo(list, 10);
	}
	
	public List<MidYearPoplation> selectByExample(String column,String condition){
		Example example = new Example(MidYearPoplation.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
	
}
