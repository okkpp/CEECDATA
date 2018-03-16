package okkpp.service.overall;

import java.util.List;

import okkpp.dao.overall.CountryAreaMapper;
import okkpp.model.overall.CountryArea;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

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
	public List<CountryArea> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<CountryArea> selectByExample(String column,String condition){
		Example example = new Example(CountryArea.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
	
}
