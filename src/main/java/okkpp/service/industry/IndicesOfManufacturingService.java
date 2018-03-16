package okkpp.service.industry;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.industry.IndicesOfManufacturingMapper;
import okkpp.model.industry.IndicesOfIndustrial;
import okkpp.model.industry.IndicesOfManufacturing;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午11:02:09
*/
@Service
@Transactional
public class IndicesOfManufacturingService {

	@Autowired
	IndicesOfManufacturingMapper mapper;
	public List<IndicesOfManufacturing> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<IndicesOfManufacturing> selectByExample(String column,String condition){
		Example example = new Example(IndicesOfManufacturing.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
