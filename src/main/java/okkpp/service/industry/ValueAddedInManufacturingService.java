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
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(ValueAddedInManufacturing.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<ValueAddedInManufacturing> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(ValueAddedInManufacturing.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<ValueAddedInManufacturing> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// ValueAddedInManufacturing更新
	public int updateValueAddedInManufacturing(ValueAddedInManufacturing valueAddedInManufacturing) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(valueAddedInManufacturing);
	}

	// ValueAddedInManufacturing插入
	public int insertValueAddedInManufacturing(ValueAddedInManufacturing valueAddedInManufacturing) {
		return mapper.insertSelective(valueAddedInManufacturing);
	}

	// ValueAddedInManufacturing删除
	public int deleteValueAddedInManufacturing(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
