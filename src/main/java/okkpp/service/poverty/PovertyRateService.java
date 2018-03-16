package okkpp.service.poverty;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.poverty.PovertyRateMapper;
import okkpp.model.poverty.PovertyRate;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class PovertyRateService {

	@Autowired
	PovertyRateMapper mapper;
	
	public List<PovertyRate> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<PovertyRate> selectByExample(String column,String condition){
		Example example = new Example(PovertyRate.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
