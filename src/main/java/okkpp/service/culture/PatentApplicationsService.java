package okkpp.service.culture;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import okkpp.dao.culture.PatentApplicationsMapper;
import okkpp.model.culture.PatentApplications;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午8:53:22
*/
@Service
@Transactional
public class PatentApplicationsService {

	@Autowired
	PatentApplicationsMapper mapper;
	public List<PatentApplications> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<PatentApplications> selectByExample(String column,String condition){
		Example example = new Example(PatentApplications.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
