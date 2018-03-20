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
	public <E> PageInfo<E> getPageInfo(int pn){		
		PageHelper.startPage(pn, 10);
		List<DepositRateAndLendingRate> list = mapper.selectAll();
		return new PageInfo(list, 10);
	}
	
	public List<DepositRateAndLendingRate> selectByExample(String column,String condition){
		Example example = new Example(DepositRateAndLendingRate.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
