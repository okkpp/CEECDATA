package okkpp.service.poverty;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.poverty.HouseholdConsumptionExpenditureMapper;
import okkpp.model.poverty.HouseholdConsumptionExpenditure;

@Service
@Transactional
public class HouseholdConsumptionExpenditureService {

	@Autowired
	HouseholdConsumptionExpenditureMapper mapper;
	
	public List<HouseholdConsumptionExpenditure> selectAll(){
		return mapper.selectAll();
	}
	
	public List<HouseholdConsumptionExpenditure> selectByExample(String country){
		return null;
	}
}
