package okkpp.service.agriculture;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import okkpp.dao.agriculture.OutputOfForestProductsMapper;
import okkpp.model.agriculture.OutputOfForestProducts;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月5日 下午3:44:56
*/
@Service
@Transactional
public class OutputOfForestProductsServiece {

	@Autowired
	OutputOfForestProductsMapper mapper;
	public List<OutputOfForestProducts> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<OutputOfForestProducts> selectByExample(String column,String condition){
		Example example = new Example(OutputOfForestProducts.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
