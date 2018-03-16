package okkpp.service.culture;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import okkpp.dao.culture.ExpenditureStudentGDPRateMapper;
import okkpp.model.culture.ExpenditureStudentGDPRate;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月5日 下午3:57:41
*/
@Service
@Transactional
public class ExpenditureStudentGDPRateService {

	@Autowired
	ExpenditureStudentGDPRateMapper mapper;
	public List<ExpenditureStudentGDPRate> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<ExpenditureStudentGDPRate> selectByExample(String column,String condition){
		Example example = new Example(ExpenditureStudentGDPRate.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
