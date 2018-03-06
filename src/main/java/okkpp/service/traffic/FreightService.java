package okkpp.service.traffic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.traffic.FreightMapper;
import okkpp.model.traffic.Freight;

@Service
@Transactional
public class FreightService {

	@Autowired
	FreightMapper mapper;
	
	public List<Freight> selectAll(){
		return mapper.selectAll();
	}
	
	public List<Freight> selectByExample(String country){
		return null;
	}
}
