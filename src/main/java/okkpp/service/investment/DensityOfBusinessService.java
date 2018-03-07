package okkpp.service.investment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import okkpp.dao.investment.DensityOfBusinessMapper;
import okkpp.model.investment.DensityOfBusiness;
import okkpp.utils.CountryCode;

@Service
@Transactional
public class DensityOfBusinessService {

	@Autowired
	DensityOfBusinessMapper mapper;
	
	public List<DensityOfBusiness> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<DensityOfBusiness> selectByExample(String country){
		return null;
	}
}
