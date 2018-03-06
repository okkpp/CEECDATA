package okkpp.service.traffic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.traffic.AirFreightMapper;
import okkpp.model.traffic.AirFreight;

@Service
@Transactional
public class AirFreightService {

	@Autowired
	AirFreightMapper mapper;
	
	public List<AirFreight> selectAll(){
		return mapper.selectAll();
	}
	
	public List<AirFreight> selectByExample(String country){
		return null;
	}
}
