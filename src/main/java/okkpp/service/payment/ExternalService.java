package okkpp.service.payment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.payment.ExternalMapper;
import okkpp.model.payment.External;

@Service
@Transactional
public class ExternalService {

	@Autowired
	ExternalMapper mapper;
	
	public List<External> selectAll(){
		return mapper.selectAll();
	}
	
	public List<External> selectByExample(String country){
		return null;
	}
}
