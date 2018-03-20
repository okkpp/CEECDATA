package okkpp.service.employment;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import okkpp.dao.employment.EducationalUnemploymentMapper;
import okkpp.model.employment.EducationalUnemployment;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:27:07
*/
@Service
@Transactional
public class EducationalUnemploymentService {

	@Autowired
	EducationalUnemploymentMapper mapper;
	public List<EducationalUnemployment> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<EducationalUnemployment> selectByExample(String column,String condition){
		Example example = new Example(EducationalUnemployment.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
