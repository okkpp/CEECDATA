package okkpp.service.traffic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.traffic.InternetUsersMapper;
import okkpp.model.traffic.InternetUsers;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class InternetUsersService {

	@Autowired
	InternetUsersMapper mapper;
	
	public List<InternetUsers> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<InternetUsers> selectByExample(String column,String condition){
		Example example = new Example(InternetUsers.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
