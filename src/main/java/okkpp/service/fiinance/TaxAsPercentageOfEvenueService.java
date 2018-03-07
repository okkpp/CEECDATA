package okkpp.service.fiinance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.finance.TaxAsPercentageOfEvenueMapper;
import okkpp.model.finance.TaxAsPercentageOfEvenue;
import okkpp.utils.CountryCode;

/**
* @author duck
* @date ����ʱ�䣺2018��3��7�� ����10:59:31
*/
@Service
@Transactional
public class TaxAsPercentageOfEvenueService {

	@Autowired
	TaxAsPercentageOfEvenueMapper mapper;
	public List<TaxAsPercentageOfEvenue> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
}
