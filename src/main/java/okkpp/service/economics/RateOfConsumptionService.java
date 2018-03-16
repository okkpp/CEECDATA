package okkpp.service.economics;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import okkpp.dao.economics.RateOfConsumptionMapper;
import okkpp.model.economics.RateOfConsumption;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date ����ʱ�䣺2018��3��6�� ����9:18:27
*/
@Service
@Transactional
public class RateOfConsumptionService {

	@Autowired
	RateOfConsumptionMapper mapper;
	public List<RateOfConsumption> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<RateOfConsumption> selectByExample(String column,String condition){
		Example example = new Example(RateOfConsumption.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
