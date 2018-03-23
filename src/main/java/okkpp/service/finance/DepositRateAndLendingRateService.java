package okkpp.service.finance;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.finance.DepositRateAndLendingRateMapper;
import okkpp.model.finance.DepositRateAndLendingRate;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午10:48:28
*/
@Service
@Transactional
public class DepositRateAndLendingRateService {

	@Autowired
	DepositRateAndLendingRateMapper mapper;
	public List<DepositRateAndLendingRate> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(DepositRateAndLendingRate.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<DepositRateAndLendingRate> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(DepositRateAndLendingRate.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<DepositRateAndLendingRate> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// DepositRateAndLendingRate更新
	public int updateDepositRateAndLendingRate(DepositRateAndLendingRate depositRateAndLendingRate) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(depositRateAndLendingRate);
	}

	// DepositRateAndLendingRate插入
	public int insertDepositRateAndLendingRate(DepositRateAndLendingRate depositRateAndLendingRate) {
		return mapper.insertSelective(depositRateAndLendingRate);
	}

	// DepositRateAndLendingRate删除
	public int deleteDepositRateAndLendingRate(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
