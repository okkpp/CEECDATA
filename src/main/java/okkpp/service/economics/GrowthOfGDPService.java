package okkpp.service.economics;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import okkpp.dao.economics.GrowthOfGDPMapper;
import okkpp.model.economics.GrowthOfGDP;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:10:48
*/
@Service
@Transactional
public class GrowthOfGDPService {

	@Autowired
	GrowthOfGDPMapper mapper;
	public List<GrowthOfGDP> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<GrowthOfGDP> selectByExample(String column,String condition){
		Example example = new Example(GrowthOfGDP.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
