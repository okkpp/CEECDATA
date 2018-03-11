package okkpp.service.culture;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.culture.AdultLiteracyRateMapper;
import okkpp.model.culture.AdultLiteracyRate;
import okkpp.utils.CountryCode;

/**
* @author duck
* @date 创建时间：2018年3月5日 下午3:51:48
*/
@Service
@Transactional
public class AdultLiteracyRateService {

	@Autowired
	AdultLiteracyRateMapper mapper;
	public List<AdultLiteracyRate> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
}
