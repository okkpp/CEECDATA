package okkpp.service.traffic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.traffic.PhoneMapper;
import okkpp.model.traffic.Phone;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class PhoneService {

	@Autowired
	PhoneMapper mapper;
	
	public List<Phone> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<Phone> selectByExample(String column,String condition){
		Example example = new Example(Phone.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
	
}
