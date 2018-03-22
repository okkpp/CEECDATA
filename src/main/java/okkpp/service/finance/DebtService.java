package okkpp.service.finance;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.finance.DebtMapper;
import okkpp.model.finance.Debt;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午10:47:14
*/
@Service
@Transactional
public class DebtService {

	@Autowired
	DebtMapper mapper;
	public List<Debt> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(Debt.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<Debt> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(Debt.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<Debt> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// Debt更新
	public int updateDebt(Debt debt) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(debt);
	}

	// Debt插入
	public int insertDebt(Debt debt) {
		return mapper.insertSelective(debt);
	}

	// Debt删除
	public int deleteDebt(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
