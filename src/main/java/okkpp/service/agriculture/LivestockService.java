package okkpp.service.agriculture;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import okkpp.dao.agriculture.LivestockMapper;
import okkpp.model.agriculture.Livestock;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月5日 下午3:43:09
*/
@Service
@Transactional
public class LivestockService {

	@Autowired
	LivestockMapper mapper;
	public List<Livestock> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<Livestock> selectByExample(String column,String condition){
		Example example = new Example(Livestock.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
