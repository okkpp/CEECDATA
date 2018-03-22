package okkpp.service.finance;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.finance.GlobalEquityIndicesMapper;
import okkpp.model.finance.GlobalEquityIndices;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午10:50:34
*/
@Service
@Transactional
public class GlobalEquityIndicesService {

	@Autowired
	GlobalEquityIndicesMapper mapper;
	public List<GlobalEquityIndices> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(GlobalEquityIndices.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<GlobalEquityIndices> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(GlobalEquityIndices.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<GlobalEquityIndices> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// GlobalEquityIndices更新
	public int updateGlobalEquityIndices(GlobalEquityIndices globalEquityIndices) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(globalEquityIndices);
	}

	// GlobalEquityIndices插入
	public int insertGlobalEquityIndices(GlobalEquityIndices globalEquityIndices) {
		return mapper.insertSelective(globalEquityIndices);
	}

	// GlobalEquityIndices删除
	public int deleteGlobalEquityIndices(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
