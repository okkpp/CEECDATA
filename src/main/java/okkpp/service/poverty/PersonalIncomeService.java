package okkpp.service.poverty;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.poverty.PersonalIncomeMapper;
import okkpp.model.poverty.PersonalIncome;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class PersonalIncomeService {

	@Autowired
	PersonalIncomeMapper mapper;
	
	public List<PersonalIncome> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<PersonalIncome> selectByExample(String column,String condition){
		Example example = new Example(PersonalIncome.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
	
}
