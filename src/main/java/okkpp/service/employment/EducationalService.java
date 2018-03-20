package okkpp.service.employment;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import okkpp.dao.employment.EducationalMapper;
import okkpp.model.employment.Educational;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:25:50
*/
@Service
@Transactional
public class EducationalService {

	@Autowired
	EducationalMapper mapper;
	public List<Educational> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<Educational> selectByExample(String column,String condition){
		Example example = new Example(Educational.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
