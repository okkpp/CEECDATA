package okkpp.service.energy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.energy.ElectricityGenerationMapper;
import okkpp.model.energy.ElectricityGeneration;
import okkpp.utils.CountryCode;

/**
* @author duck
* @date ����ʱ�䣺2018��3��7�� ����10:38:05
*/
@Service
@Transactional
public class ElectricityGenerationService {

	@Autowired
	ElectricityGenerationMapper mapper;
	public List<ElectricityGeneration> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
}
