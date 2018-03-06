package okkpp.service.payment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.payment.ReservesMapper;
import okkpp.model.payment.Reserves;

@Service
@Transactional
public class ReservesService {

	@Autowired
	ReservesMapper mapper;
	
	public List<Reserves> selectAll(){
		return mapper.selectAll();
	}
	
	public List<Reserves> selectByExample(String country){
		return null;
	}
}
