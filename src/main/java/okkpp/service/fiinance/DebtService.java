package okkpp.service.fiinance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.finance.DebtMapper;
import okkpp.model.finance.Debt;
import okkpp.utils.CountryCode;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午10:47:14
*/
@Service
@Transactional
public class DebtService {

	@Autowired
	DebtMapper mapper;
	public List<Debt> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
}
