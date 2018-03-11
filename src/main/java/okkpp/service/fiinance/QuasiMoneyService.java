package okkpp.service.fiinance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.finance.QuasiMoneyMapper;
import okkpp.model.finance.QuasiMoney;
import okkpp.utils.CountryCode;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午10:54:48
*/
@Service
@Transactional
public class QuasiMoneyService {

	@Autowired
	QuasiMoneyMapper mapper;
	public List<QuasiMoney> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
}
