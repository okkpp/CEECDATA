package okkpp.service.emoloyment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.employment.EmploymentGDPMapper;
import okkpp.model.employment.EmploymentGDP;
import okkpp.utils.CountryCode;

/**
* @author duck
* @date ����ʱ�䣺2018��3��6�� ����9:29:36
*/
@Service
@Transactional
public class EmploymentGDPService {

	@Autowired
	EmploymentGDPMapper mapper;
	public List<EmploymentGDP> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
}
