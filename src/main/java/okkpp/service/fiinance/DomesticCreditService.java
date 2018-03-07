package okkpp.service.fiinance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.finance.DomesticCreditMapper;
import okkpp.model.finance.DomesticCredit;
import okkpp.utils.CountryCode;

/**
* @author duck
* @date ����ʱ�䣺2018��3��7�� ����10:49:35
*/
@Service
@Transactional
public class DomesticCreditService {

	@Autowired
	DomesticCreditMapper mapper;
	public List<DomesticCredit> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
}
