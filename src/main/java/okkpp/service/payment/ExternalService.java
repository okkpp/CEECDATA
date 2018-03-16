package okkpp.service.payment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.payment.ExternalMapper;
import okkpp.model.payment.External;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class ExternalService {

	@Autowired
	ExternalMapper mapper;
	
	public List<External> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<External> selectByExample(String column,String condition){
		Example example = new Example(External.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
