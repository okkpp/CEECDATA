package okkpp.service.finance;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.finance.GrowthRateOfMoneyMapper;
import okkpp.model.finance.GrowthRateOfMoney;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午10:51:43
*/
@Service
@Transactional
public class GrowthRateOfMoneyService {

	@Autowired
	GrowthRateOfMoneyMapper mapper;
	public List<GrowthRateOfMoney> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(GrowthRateOfMoney.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<GrowthRateOfMoney> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(GrowthRateOfMoney.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<GrowthRateOfMoney> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// GrowthRateOfMoney更新
	public int updateGrowthRateOfMoney(GrowthRateOfMoney growthRateOfMoney) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(growthRateOfMoney);
	}

	// GrowthRateOfMoney插入
	public int insertGrowthRateOfMoney(GrowthRateOfMoney growthRateOfMoney) {
		return mapper.insertSelective(growthRateOfMoney);
	}

	// GrowthRateOfMoney删除
	public int deleteGrowthRateOfMoney(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
