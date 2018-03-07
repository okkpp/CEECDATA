package okkpp.service.investment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.investment.CostOfBusinessMapper;
import okkpp.model.investment.CostOfBusiness;
import okkpp.utils.CountryCode;

@Service
@Transactional
public class CostOfBusinessService {

	@Autowired
	CostOfBusinessMapper mapper;
	
	public List<CostOfBusiness> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<CostOfBusiness> selectByExample(String country){
		return null;
	}
}
