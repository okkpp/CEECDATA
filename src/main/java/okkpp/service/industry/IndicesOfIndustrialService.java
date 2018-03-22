package okkpp.service.industry;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.industry.IndicesOfIndustrialMapper;
import okkpp.model.industry.IndicesOfIndustrial;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午11:01:13
*/
@Service
@Transactional
public class IndicesOfIndustrialService {

	@Autowired
	IndicesOfIndustrialMapper mapper;
	public List<IndicesOfIndustrial> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(IndicesOfIndustrial.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<IndicesOfIndustrial> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(IndicesOfIndustrial.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<IndicesOfIndustrial> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// IndicesOfIndustrial更新
	public int updateIndicesOfIndustrial(IndicesOfIndustrial indicesOfIndustrial) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(indicesOfIndustrial);
	}

	// IndicesOfIndustrial插入
	public int insertIndicesOfIndustrial(IndicesOfIndustrial indicesOfIndustrial) {
		return mapper.insertSelective(indicesOfIndustrial);
	}

	// IndicesOfIndustrial删除
	public int deleteIndicesOfIndustrial(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
