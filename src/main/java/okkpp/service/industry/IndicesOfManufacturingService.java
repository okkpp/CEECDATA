package okkpp.service.industry;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.industry.IndicesOfManufacturingMapper;
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
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn){		
		PageHelper.startPage(pn, 10);
		List<IndicesOfManufacturing> list = mapper.selectAll();
		return new PageInfo(list, 10);
	}
	
	public List<IndicesOfManufacturing> selectByExample(String column,String condition){
		Example example = new Example(IndicesOfManufacturing.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
