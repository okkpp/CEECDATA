package okkpp.service.overall;

import java.util.List;

import okkpp.dao.overall.CountryAreaMapper;
import okkpp.model.overall.CountryArea;
import okkpp.model.overall.CountryAreaExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author DUCK  E-mail: okkpp@qq.com
 * @date 创建时间：2018年3月2日 上午10:05:25 
 * @version 1.0 
 */
@Service
@Transactional
public class CountryAreaService {

	@Autowired
	CountryAreaMapper mapper;
	
	public List<CountryArea> selectByExample(String country){
		CountryAreaExample example = new CountryAreaExample();
		okkpp.model.overall.CountryAreaExample.Criteria criteria = example.createCriteria();
		criteria.andCountryEqualTo(country);
		return mapper.selectByExample(example);
	}
}
