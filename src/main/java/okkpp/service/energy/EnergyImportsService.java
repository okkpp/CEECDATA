package okkpp.service.energy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.energy.EnergyImportsMapper;
import okkpp.model.energy.EnergyImports;
import okkpp.utils.CountryCode;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午10:39:05
*/
@Service
@Transactional
public class EnergyImportsService {

	@Autowired
	EnergyImportsMapper mapper;
	public List<EnergyImports> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
}
