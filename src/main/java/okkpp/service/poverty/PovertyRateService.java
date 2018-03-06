package okkpp.service.poverty;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.poverty.PovertyRateMapper;
import okkpp.model.poverty.PovertyRate;

@Service
@Transactional
public class PovertyRateService {

	@Autowired
	PovertyRateMapper mapper;
	
	public List<PovertyRate> selectAll(){
		return mapper.selectAll();
	}
	
	public List<PovertyRate> selectByExample(String country){
		return null;
	}
}
