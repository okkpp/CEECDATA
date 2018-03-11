package okkpp.service.poverty;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.poverty.PersonalIncomeMapper;
import okkpp.model.poverty.PersonalIncome;
import okkpp.utils.CountryCode;

@Service
@Transactional
public class PersonalIncomeService {

	@Autowired
	PersonalIncomeMapper mapper;
	
	public List<PersonalIncome> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<PersonalIncome> selectByExample(String country){
		return null;
	}
	
}
