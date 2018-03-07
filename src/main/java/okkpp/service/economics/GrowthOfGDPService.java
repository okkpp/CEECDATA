package okkpp.service.economics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.economics.GrowthOfGDPPCMapper;
import okkpp.model.economics.GrowthOfGDPPC;
import okkpp.utils.CountryCode;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:10:48
*/
@Service
@Transactional
public class GrowthOfGDPService {

	@Autowired
	GrowthOfGDPPCMapper mapper;
	public List<GrowthOfGDPPC> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
}
