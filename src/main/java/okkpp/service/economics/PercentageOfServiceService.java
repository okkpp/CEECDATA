package okkpp.service.economics;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import okkpp.dao.economics.PercentageOfServiceMapper;
import okkpp.model.economics.PercentageOfService;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:17:29
*/
@Service
@Transactional
public class PercentageOfServiceService {

	@Autowired
	PercentageOfServiceMapper mapper;
	public List<PercentageOfService> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<PercentageOfService> selectByExample(String column,String condition){
		Example example = new Example(PercentageOfService.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
