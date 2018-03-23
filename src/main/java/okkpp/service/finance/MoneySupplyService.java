package okkpp.service.finance;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.finance.MoneySupplyMapper;
import okkpp.model.finance.MoneySupply;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午10:53:53
*/
@Service
@Transactional
public class MoneySupplyService {

	@Autowired
	MoneySupplyMapper mapper;
	public List<MoneySupply> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(MoneySupply.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<MoneySupply> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(MoneySupply.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<MoneySupply> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// MoneySupply更新
	public int updateMoneySupply(MoneySupply moneySupply) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(moneySupply);
	}

	// MoneySupply插入
	public int insertMoneySupply(MoneySupply moneySupply) {
		return mapper.insertSelective(moneySupply);
	}

	// MoneySupply删除
	public int deleteMoneySupply(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
