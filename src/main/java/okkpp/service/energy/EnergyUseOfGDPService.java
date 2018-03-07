package okkpp.service.energy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.energy.EnergyUseOfGDPMapper;
import okkpp.model.energy.EnergyUseOfGDP;
import okkpp.utils.CountryCode;

/**
* @author duck
* @date ����ʱ�䣺2018��3��7�� ����10:40:15
*/
@Service
@Transactional
public class EnergyUseOfGDPService {

	@Autowired
	EnergyUseOfGDPMapper mapper;
	public List<EnergyUseOfGDP> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
}
