package okkpp.service.traffic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.traffic.BroadbandMapper;
import okkpp.model.traffic.Broadband;
import okkpp.utils.CountryCode;

@Service
@Transactional
public class BroadbandService {

	@Autowired
	BroadbandMapper mapper;

	public List<Broadband> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<Broadband> selectByExample(String country){
		return null;
	}
	
}
