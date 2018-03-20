package okkpp.service.agriculture;
/**
* @author duck
* @date 创建时间：2018年3月5日 下午3:46:15
*/

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.agriculture.OutputOfLivestockProductsMapper;
import okkpp.model.agriculture.OutputOfLivestockProducts;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class OutputOfLivestockProductsService {

	@Autowired
	OutputOfLivestockProductsMapper mapper;
	public List<OutputOfLivestockProducts> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn){		
		PageHelper.startPage(pn, 10);
		List<OutputOfLivestockProducts> list = mapper.selectAll();
		return new PageInfo(list, 10);
	}
	
	public List<OutputOfLivestockProducts> selectByExample(String column,String condition){
		Example example = new Example(OutputOfLivestockProducts.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
