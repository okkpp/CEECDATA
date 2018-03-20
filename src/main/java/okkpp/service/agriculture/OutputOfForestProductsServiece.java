package okkpp.service.agriculture;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.agriculture.OutputOfForestProductsMapper;
import okkpp.model.agriculture.OutputOfForestProducts;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date ����ʱ�䣺2018��3��5�� ����3:44:56
*/
@Service
@Transactional
public class OutputOfForestProductsServiece {

	@Autowired
	OutputOfForestProductsMapper mapper;
	public List<OutputOfForestProducts> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn){		
		PageHelper.startPage(pn, 10);
		List<OutputOfForestProducts> list = mapper.selectAll();
		return new PageInfo(list, 10);
	}
	
	public List<OutputOfForestProducts> selectByExample(String column,String condition){
		Example example = new Example(OutputOfForestProducts.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
