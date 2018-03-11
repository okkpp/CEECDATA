package okkpp.service.fiinance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.finance.DepositRateAndLendingRateMapper;
import okkpp.model.finance.DepositRateAndLendingRate;
import okkpp.utils.CountryCode;

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
}
