package okkpp.service.economics;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import okkpp.dao.economics.IndicatorsOfNAMapper;
import okkpp.model.economics.IndicatorsOfNA;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:12:47
*/
@Service
@Transactional
public class IndicatorsOfNAService {

	@Autowired
	IndicatorsOfNAMapper mapper;
	public List<IndicatorsOfNA> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<IndicatorsOfNA> selectByExample(String column,String condition){
		Example example = new Example(IndicatorsOfNA.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
