package okkpp.service.industry;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.industry.ValueAddedInManufacturingMapper;
import okkpp.model.industry.ValueAddedInManufacturing;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午11:04:09
*/
@Service
@Transactional
public class ValueAddedInManufacturingService {

	@Autowired
	ValueAddedInManufacturingMapper mapper;
	public List<ValueAddedInManufacturing> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn){		
		PageHelper.startPage(pn, 10);
		List<ValueAddedInManufacturing> list = mapper.selectAll();
		return new PageInfo(list, 10);
	}
	
	public List<ValueAddedInManufacturing> selectByExample(String column,String condition){
		Example example = new Example(ValueAddedInManufacturing.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
