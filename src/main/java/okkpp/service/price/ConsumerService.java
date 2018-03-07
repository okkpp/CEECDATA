package okkpp.service.price;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.price.ConsumerMapper;
import okkpp.model.price.Consumer;

@Service
@Transactional
public class ConsumerService {

	@Autowired
	ConsumerMapper mapper;
	
	public List<Consumer> selectAll(){
		return mapper.selectAll();
	}
	
	public List<Consumer> selectByExample(String country){
		return null;
	}
	
}
