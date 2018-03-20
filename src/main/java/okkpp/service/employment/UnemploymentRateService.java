package okkpp.service.employment;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import okkpp.dao.employment.UnemploymentRateMapper;
import okkpp.model.employment.UnemploymentRate;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date ����ʱ�䣺2018��3��6�� ����9:34:13
*/
@Service
@Transactional
public class UnemploymentRateService {

	@Autowired
	UnemploymentRateMapper mapper;
	public List<UnemploymentRate> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<UnemploymentRate> selectByExample(String column,String condition){
		Example example = new Example(UnemploymentRate.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
