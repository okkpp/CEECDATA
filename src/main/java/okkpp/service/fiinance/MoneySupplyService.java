package okkpp.service.fiinance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.finance.MoneySupplyMapper;
import okkpp.model.finance.MoneySupply;
import okkpp.utils.CountryCode;

/**
* @author duck
* @date ����ʱ�䣺2018��3��7�� ����10:53:53
*/
@Service
@Transactional
public class MoneySupplyService {

	@Autowired
	MoneySupplyMapper mapper;
	public List<MoneySupply> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
}
