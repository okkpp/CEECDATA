package okkpp.service.culture;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import okkpp.dao.culture.ResearchersAndTechniciansMapper;
import okkpp.model.culture.ResearchersAndTechnicians;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午8:54:42
*/
@Service
@Transactional
public class ResearchersAndTechniciansService {

	@Autowired
	ResearchersAndTechniciansMapper mapper;
	public List<ResearchersAndTechnicians> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<ResearchersAndTechnicians> selectByExample(String column,String condition){
		Example example = new Example(ResearchersAndTechnicians.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
