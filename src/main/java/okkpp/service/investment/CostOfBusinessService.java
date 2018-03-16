package okkpp.service.investment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.investment.CostOfBusinessMapper;
import okkpp.model.industry.ValueAddedInManufacturing;
import okkpp.model.investment.CostOfBusiness;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class CostOfBusinessService {

	@Autowired
	CostOfBusinessMapper mapper;
	
	public List<CostOfBusiness> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<CostOfBusiness> selectByExample(String column,String condition){
		Example example = new Example(CostOfBusiness.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
