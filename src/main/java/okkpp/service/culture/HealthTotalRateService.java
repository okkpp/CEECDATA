package okkpp.service.culture;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import okkpp.dao.culture.HealthTotalRateMapper;
import okkpp.model.culture.HealthTotalRate;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date ����ʱ�䣺2018��3��6�� ����8:47:40
*/
@Service
@Transactional
public class HealthTotalRateService {

	@Autowired
	HealthTotalRateMapper mapper;
	public List<HealthTotalRate> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<HealthTotalRate> selectByExample(String column,String condition){
		Example example = new Example(HealthTotalRate.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
