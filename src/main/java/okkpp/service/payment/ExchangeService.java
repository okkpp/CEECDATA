package okkpp.service.payment;

import java.util.List;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.payment.ExchangeMapper;
import okkpp.model.payment.Exchange;
import okkpp.utils.CountryCode;

@Service
@Transactional
public class ExchangeService {

	@Autowired
	ExchangeMapper mapper;
	
	public List<Exchange> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<Exchange> selectByExample(String country){
		return null;
	}
}
