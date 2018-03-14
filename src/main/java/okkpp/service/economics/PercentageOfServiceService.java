package okkpp.service.economics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.economics.PercentageOfServiceMapper;
import okkpp.model.economics.PercentageOfService;
import okkpp.utils.CountryCode;

/**
* @author duck
* @date ����ʱ�䣺2018��3��6�� ����9:17:29
*/
@Service
@Transactional
public class PercentageOfServiceService {

	@Autowired
	PercentageOfServiceMapper mapper;
	public List<PercentageOfService> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
}