package okkpp.service.price;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.price.ProducerMapper;
import okkpp.model.price.Producer;
import okkpp.utils.CountryCode;

@Service
@Transactional
public class ProducerService {
	
	@Autowired
	ProducerMapper mapper;
	
	public List<Producer> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<Producer> selectByExample(String country){
		return null;
	}
}
