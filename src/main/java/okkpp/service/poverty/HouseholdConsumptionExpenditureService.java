package okkpp.service.poverty;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.poverty.HouseholdConsumptionExpenditureMapper;
import okkpp.model.poverty.HouseholdConsumptionExpenditure;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class HouseholdConsumptionExpenditureService {

	@Autowired
	HouseholdConsumptionExpenditureMapper mapper;
	
	public List<HouseholdConsumptionExpenditure> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<HouseholdConsumptionExpenditure> selectByExample(String column,String condition){
		Example example = new Example(HouseholdConsumptionExpenditure.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
