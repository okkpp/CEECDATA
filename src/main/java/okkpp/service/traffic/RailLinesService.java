package okkpp.service.traffic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.traffic.RailLinesMapper;
import okkpp.model.traffic.RailLines;

@Service
@Transactional
public class RailLinesService {

	@Autowired
	RailLinesMapper mapper;
	
	public List<RailLines> selectAll(){
		return mapper.selectAll();
	}
	
	public List<RailLines> selectByExample(String country){
		return null;
	}
}
