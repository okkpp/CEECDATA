package okkpp.service.employment;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import okkpp.dao.employment.WagesMapper;
import okkpp.model.employment.Wages;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:35:03
*/
@Service
@Transactional
public class WagesService {

	@Autowired
	WagesMapper mapper;
	public List<Wages> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<Wages> selectByExample(String column,String condition){
		Example example = new Example(Wages.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
