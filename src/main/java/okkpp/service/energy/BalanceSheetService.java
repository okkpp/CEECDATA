package okkpp.service.energy;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.energy.BalanceSheetMapper;
import okkpp.model.energy.BalanceSheet;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午10:33:12
*/
@Service
@Transactional
public class BalanceSheetService {

	@Autowired
	BalanceSheetMapper mapper;
	public List<BalanceSheet> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(BalanceSheet.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<BalanceSheet> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(BalanceSheet.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<BalanceSheet> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// BalanceSheet更新
	public int updateBalanceSheet(BalanceSheet balanceSheet) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(balanceSheet);
	}

	// BalanceSheet插入
	public int insertBalanceSheet(BalanceSheet balanceSheet) {
		return mapper.insertSelective(balanceSheet);
	}

	// BalanceSheet删除
	public int deleteBalanceSheet(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
