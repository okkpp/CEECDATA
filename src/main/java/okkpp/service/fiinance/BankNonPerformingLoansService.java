package okkpp.service.fiinance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.finance.BankNonPerformingLoansMapper;
import okkpp.model.finance.BankNonPerformingLoans;
import okkpp.utils.CountryCode;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午10:43:36
*/
@Service
@Transactional
public class BankNonPerformingLoansService {

	@Autowired
	BankNonPerformingLoansMapper mapper;
	public List<BankNonPerformingLoans> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
}
