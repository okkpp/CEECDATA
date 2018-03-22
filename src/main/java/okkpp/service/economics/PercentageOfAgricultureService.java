package okkpp.service.economics;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.economics.PercentageOfAgricultureMapper;
import okkpp.model.economics.PercentageOfAgriculture;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:14:05
*/
@Service
@Transactional
public class PercentageOfAgricultureService {

	@Autowired
	PercentageOfAgricultureMapper mapper;
	public List<PercentageOfAgriculture> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(PercentageOfAgriculture.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<PercentageOfAgriculture> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(PercentageOfAgriculture.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<PercentageOfAgriculture> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// PercentageOfAgriculture更新
	public int updatePercentageOfAgriculture(PercentageOfAgriculture percentageOfAgriculture) {
		// TODO Auto-generated method 
		return mapper.updateByPrimaryKeySelective(percentageOfAgriculture);
	}

	// PercentageOfAgriculture插入
	public int inserttPercentageOfAgriculture(PercentageOfAgriculture percentageOfAgriculture) {
		return mapper.insertSelective(percentageOfAgriculture);
	}

	// PercentageOfAgriculture删除
	public int deletePercentageOfAgriculture(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
