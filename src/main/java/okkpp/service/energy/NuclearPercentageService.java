package okkpp.service.energy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.energy.NuclearPercentageMapper;
import okkpp.model.energy.NuclearPercentage;
import okkpp.utils.CountryCode;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午10:41:16
*/
@Service
@Transactional
public class NuclearPercentageService {

	@Autowired
	NuclearPercentageMapper mapper;
	public List<NuclearPercentage> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
}
