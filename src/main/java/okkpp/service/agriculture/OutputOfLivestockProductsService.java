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
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(OutputOfLivestockProducts.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<OutputOfLivestockProducts> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(OutputOfLivestockProducts.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<OutputOfLivestockProducts> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// OutputOfLivestockProducts更新
	public int updateOutputOfLivestockProducts(OutputOfLivestockProducts outputOfLivestockProducts) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(outputOfLivestockProducts);
	}

	// OutputOfLivestockProducts插入
	public int insertOutputOfLivestockProducts(OutputOfLivestockProducts outputOfLivestockProducts) {
		return mapper.insertSelective(outputOfLivestockProducts);
	}

	// OutputOfLivestockProducts删除
	public int deleteOutputOfLivestockProducts(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
