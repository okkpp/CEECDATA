package okkpp.service.traffic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.traffic.ContainerMapper;
import okkpp.model.traffic.Container;
import okkpp.utils.CountryCode;

@Service
@Transactional
public class ContainerService {

	@Autowired
	ContainerMapper mapper;
	
	public List<Container> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<Container> selectByExample(String country){
		return null;
	}
	
}
