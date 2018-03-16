package okkpp.service.payment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.payment.PaymentMapper;
import okkpp.model.payment.Payment;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class PaymentService {

	@Autowired
	PaymentMapper mapper;
	
	public List<Payment> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<Payment> selectByExample(String column,String condition){
		Example example = new Example(Payment.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
	
}
