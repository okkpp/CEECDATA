package okkpp.service.traffic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.traffic.PhoneMapper;
import okkpp.model.traffic.Phone;
import okkpp.utils.CountryCode;

@Service
@Transactional
public class PhoneService {

	@Autowired
	PhoneMapper mapper;
	
	public List<Phone> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<Phone> selectByExample(String country){
		return null;
	}
	
}
