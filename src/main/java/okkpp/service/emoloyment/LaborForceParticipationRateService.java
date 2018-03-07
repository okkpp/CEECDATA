package okkpp.service.emoloyment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.employment.LaborForceParticipationRateMapper;
import okkpp.model.employment.LaborForceParticipationRate;
import okkpp.utils.CountryCode;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:32:01
*/
@Service
@Transactional
public class LaborForceParticipationRateService {

	@Autowired
	LaborForceParticipationRateMapper mapper;
	public List<LaborForceParticipationRate> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
}
