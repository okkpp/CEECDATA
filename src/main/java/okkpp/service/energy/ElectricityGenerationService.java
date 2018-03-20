package okkpp.service.energy;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.energy.ElectricityGenerationMapper;
import okkpp.model.energy.ElectricityGeneration;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午10:38:05
*/
@Service
@Transactional
public class ElectricityGenerationService {

	@Autowired
	ElectricityGenerationMapper mapper;
	public List<ElectricityGeneration> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn){		
		PageHelper.startPage(pn, 10);
		List<ElectricityGeneration> list = mapper.selectAll();
		return new PageInfo(list, 10);
	}
	
	public List<ElectricityGeneration> selectByExample(String column,String condition){
		Example example = new Example(ElectricityGeneration.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
