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
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(OutputOfForestProducts.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<OutputOfForestProducts> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(OutputOfForestProducts.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<OutputOfForestProducts> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// OutputOfForestProducts����
	public int updateOutputOfForestProducts(OutputOfForestProducts outputOfForestProducts) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(outputOfForestProducts);
	}

	// OutputOfForestProducts����
	public int insertOutputOfForestProducts(OutputOfForestProducts outputOfForestProducts) {
		return mapper.insertSelective(outputOfForestProducts);
	}

	// OutputOfForestProductsɾ��
	public int deleteOutputOfForestProducts(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
