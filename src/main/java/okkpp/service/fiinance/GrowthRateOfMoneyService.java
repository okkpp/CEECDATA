package okkpp.service.fiinance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.finance.GrowthRateOfMoneyMapper;
import okkpp.model.finance.GrowthRateOfMoney;
import okkpp.utils.CountryCode;

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
}
