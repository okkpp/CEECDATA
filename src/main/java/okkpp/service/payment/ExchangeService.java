package okkpp.service.payment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.payment.ExchangeMapper;
import okkpp.model.payment.Exchange;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class ExchangeService {

	@Autowired
	ExchangeMapper mapper;
	
	public List<Exchange> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<Exchange> selectByExample(String column,String condition){
		Example example = new Example(Exchange.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
