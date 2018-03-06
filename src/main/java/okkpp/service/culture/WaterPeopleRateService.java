package okkpp.service.culture;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.culture.WaterPeopleRateMapper;
import okkpp.model.culture.WaterPeopleRate;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:01:24
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
