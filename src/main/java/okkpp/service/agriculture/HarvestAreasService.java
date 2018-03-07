package okkpp.service.agriculture;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.agriculture.HarvestAreasMapper;
import okkpp.model.agriculture.HarvestAreas;
import okkpp.utils.CountryCode;

/**
* @author duck
* @date ����ʱ�䣺2018��3��5�� ����3:41:39
*/
@Service
@Transactional
public class HarvestAreasService {

	@Autowired
	HarvestAreasMapper mapper;
	public List<HarvestAreas> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
}
