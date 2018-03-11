package okkpp.service.payment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.payment.ForeignMapper;
import okkpp.model.payment.Foreign;
import okkpp.utils.CountryCode;

@Service
@Transactional
public class ForeignService {

	@Autowired
	ForeignMapper mapper;
	
	public List<Foreign> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<Foreign> selectByExample(String country){
		return null;
	}
}
