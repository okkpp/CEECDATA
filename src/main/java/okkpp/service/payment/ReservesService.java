package okkpp.service.payment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.payment.ReservesMapper;
import okkpp.model.payment.Reserves;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class ReservesService {

	@Autowired
	ReservesMapper mapper;
	
	public List<Reserves> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<Reserves> selectByExample(String column,String condition){
		Example example = new Example(Reserves.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
