package okkpp.service.culture;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.culture.HightechnologyRateMapper;
import okkpp.model.culture.HightechnologyRate;
import okkpp.utils.CountryCode;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午8:50:00
*/
@Service
@Transactional
public class HightechnologyRateService {

	@Autowired
	HightechnologyRateMapper mapper;
	public List<HightechnologyRate> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
}
