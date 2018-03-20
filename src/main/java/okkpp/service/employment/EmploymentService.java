package okkpp.service.employment;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import okkpp.dao.employment.EmploymentMapper;
import okkpp.model.employment.Employment;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:28:29
*/
@Service
@Transactional
public class EmploymentService {

	@Autowired
	EmploymentMapper mapper;
	public List<Employment> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<Employment> selectByExample(String column,String condition){
		Example example = new Example(Employment.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
