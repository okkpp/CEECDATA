package okkpp.service.energy;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.energy.CombustibleRenewalsMapper;
import okkpp.model.energy.CombustibleRenewals;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午10:35:15
*/
@Service
@Transactional
public class CombustibleRenewalsService {

	@Autowired
	CombustibleRenewalsMapper mapper;
	public List<CombustibleRenewals> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(CombustibleRenewals.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<CombustibleRenewals> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(CombustibleRenewals.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<CombustibleRenewals> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// CombustibleRenewals更新
	public int updateCombustibleRenewals(CombustibleRenewals combustibleRenewals) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(combustibleRenewals);
	}

	// CombustibleRenewals插入
	public int insertCombustibleRenewals(CombustibleRenewals combustibleRenewals) {
		return mapper.insertSelective(combustibleRenewals);
	}

	// CombustibleRenewals删除
	public int deleteCombustibleRenewals(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
