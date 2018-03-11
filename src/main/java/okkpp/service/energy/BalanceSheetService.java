package okkpp.service.energy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.energy.BalanceSheetMapper;
import okkpp.model.energy.BalanceSheet;
import okkpp.utils.CountryCode;

/**
* @author duck
* @date ����ʱ�䣺2018��3��7�� ����10:33:12
*/
@Service
@Transactional
public class BalanceSheetService {

	@Autowired
	BalanceSheetMapper mapper;
	public List<BalanceSheet> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
}
