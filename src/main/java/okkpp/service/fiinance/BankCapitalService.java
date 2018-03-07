package okkpp.service.fiinance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.finance.BankCapitalMapper;
import okkpp.model.finance.BankCapital;
import okkpp.utils.CountryCode;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午10:42:40
*/
@Service
@Transactional
public class BankCapitalService {

	@Autowired
	BankCapitalMapper mapper;
	public List<BankCapital> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
}
