package okkpp.service.emoloyment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.employment.EducationalMapper;
import okkpp.model.employment.Educational;
import okkpp.utils.CountryCode;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:25:50
*/
@Service
@Transactional
public class EducationalService {

	@Autowired
	EducationalMapper mapper;
	public List<Educational> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
}
