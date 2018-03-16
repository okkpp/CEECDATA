package okkpp.service.traffic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.traffic.InternetServersMapper;
import okkpp.model.traffic.InternetServers;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class InternetServersService {

	@Autowired
	InternetServersMapper mapper;
	
	public List<InternetServers> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<InternetServers> selectByExample(String column,String condition){
		Example example = new Example(InternetServers.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
