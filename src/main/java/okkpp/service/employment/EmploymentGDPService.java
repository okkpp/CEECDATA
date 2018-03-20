package okkpp.service.employment;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import okkpp.dao.employment.EmploymentGDPMapper;
import okkpp.model.employment.EmploymentGDP;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:29:36
*/
@Service
@Transactional
public class EmploymentGDPService {

	@Autowired
	EmploymentGDPMapper mapper;
	public List<EmploymentGDP> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<EmploymentGDP> selectByExample(String column,String condition){
		Example example = new Example(EmploymentGDP.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
