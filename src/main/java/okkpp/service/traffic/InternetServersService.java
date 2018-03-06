package okkpp.service.traffic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.traffic.InternetServersMapper;
import okkpp.model.traffic.InternetServers;

@Service
@Transactional
public class InternetServersService {

	@Autowired
	InternetServersMapper mapper;
	
	public List<InternetServers> selectAll(){
		return mapper.selectAll();
	}
	
	public List<InternetServers> selectByExample(String country){
		return null;
	}
}
