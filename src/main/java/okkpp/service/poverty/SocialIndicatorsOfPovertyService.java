package okkpp.service.poverty;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.poverty.SocialIndicatorsOfPovertyMapper;
import okkpp.model.poverty.SocialIndicatorsOfPoverty;
import okkpp.utils.CountryCode;

@Service
@Transactional
public class SocialIndicatorsOfPovertyService {

	@Autowired
	SocialIndicatorsOfPovertyMapper mapper;
	
	public List<SocialIndicatorsOfPoverty> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<SocialIndicatorsOfPoverty> selectByExample(String country){
		return null;
	}
	
}