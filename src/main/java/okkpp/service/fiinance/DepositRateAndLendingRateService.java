package okkpp.service.fiinance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.finance.DepositRateAndLendingRateMapper;
import okkpp.model.finance.Debt;
import okkpp.model.finance.DepositRateAndLendingRate;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date ����ʱ�䣺2018��3��7�� ����10:48:28
*/
@Service
@Transactional
public class DepositRateAndLendingRateService {

	@Autowired
	DepositRateAndLendingRateMapper mapper;
	public List<DepositRateAndLendingRate> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<DepositRateAndLendingRate> selectByExample(String column,String condition){
		Example example = new Example(DepositRateAndLendingRate.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
