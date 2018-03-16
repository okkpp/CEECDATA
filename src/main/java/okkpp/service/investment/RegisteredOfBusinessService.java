package okkpp.service.investment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import okkpp.dao.investment.RegisteredOfBusinessMapper;
import okkpp.model.investment.RegisteredOfBusiness;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class RegisteredOfBusinessService {

	@Autowired
	RegisteredOfBusinessMapper mapper;
	
	public List<RegisteredOfBusiness> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<RegisteredOfBusiness> selectByExample(String column,String condition){
		Example example = new Example(RegisteredOfBusiness.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
