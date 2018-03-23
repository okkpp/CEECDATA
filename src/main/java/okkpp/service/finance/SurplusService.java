package okkpp.service.finance;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.finance.SurplusMapper;
import okkpp.model.finance.Surplus;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午10:58:17
*/
@Service
@Transactional
public class SurplusService {

	@Autowired
	SurplusMapper mapper;
	public List<Surplus> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(Surplus.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<Surplus> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(Surplus.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<Surplus> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// Surplus更新
	public int updateSurplus(Surplus surplus) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(surplus);
	}

	// Surplus插入
	public int insertSurplus(Surplus surplus) {
		return mapper.insertSelective(surplus);
	}

	// Surplus删除
	public int deleteSurplus(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
