package okkpp.service.poverty;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import okkpp.dao.poverty.InternationalPovertyRatioMapper;
import okkpp.model.poverty.InternationalPovertyRatio;
import okkpp.utils.CountryCode;

import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class InternationalPovertyRatioService {

	@Autowired
	InternationalPovertyRatioMapper mapper;
	
	public List<InternationalPovertyRatio> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<InternationalPovertyRatio> selectByExample(String country){
		return null;
	}
	
}
