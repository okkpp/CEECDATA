package okkpp.service.culture;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.culture.SchoolEnrollmentRatioMapper;
import okkpp.model.culture.SchoolEnrollmentRatio;
import okkpp.utils.CountryCode;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:00:24
*/
@Service
@Transactional
public class SchoolEnrollmentRatioService {

	@Autowired
	SchoolEnrollmentRatioMapper mapper;
	public List<SchoolEnrollmentRatio> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
}
