package okkpp.service.investment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import okkpp.dao.investment.RegisteredOfBusinessMapper;
import okkpp.model.investment.RegisteredOfBusiness;

@Service
@Transactional
public class RegisteredOfBusinessService {

	@Autowired
	RegisteredOfBusinessMapper mapper;
	
	public List<RegisteredOfBusiness> selectAll(){
		return mapper.selectAll();
	}
	
	public List<RegisteredOfBusiness> selectByExample(String country){
		return null;
	}
}
