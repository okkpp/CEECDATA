package okkpp.service.traffic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.traffic.RailLinesMapper;
import okkpp.model.traffic.RailLines;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class RailLinesService {

	@Autowired
	RailLinesMapper mapper;
	
	public List<RailLines> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<RailLines> selectByExample(String column,String condition){
		Example example = new Example(RailLines.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
