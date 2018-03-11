package okkpp.service.traffic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.traffic.InternetUsersMapper;
import okkpp.model.traffic.InternetUsers;
import okkpp.utils.CountryCode;

@Service
@Transactional
public class InternetUsersService {

	@Autowired
	InternetUsersMapper mapper;
	
	public List<InternetUsers> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<InternetUsers> selectByExample(String country){
		return null;
	}
}
