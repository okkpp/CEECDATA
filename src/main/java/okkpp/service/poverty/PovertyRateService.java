package okkpp.service.poverty;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.poverty.PovertyRateMapper;
import okkpp.model.poverty.PovertyRate;
import okkpp.utils.CountryCode;

@Service
@Transactional
public class PovertyRateService {

	@Autowired
	PovertyRateMapper mapper;
	
	public List<PovertyRate> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<PovertyRate> selectByExample(String country){
		return null;
	}
}
