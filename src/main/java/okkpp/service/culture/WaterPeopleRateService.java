package okkpp.service.culture;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.culture.WaterPeopleRateMapper;
import okkpp.model.culture.WaterPeopleRate;

/**
* @author duck
* @date ����ʱ�䣺2018��3��6�� ����9:01:24
*/
@Service
@Transactional
public class WaterPeopleRateService {

	@Autowired
	WaterPeopleRateMapper mapper;
	public List<WaterPeopleRate> selectAll() {
		return mapper.selectAll();
	}
}
