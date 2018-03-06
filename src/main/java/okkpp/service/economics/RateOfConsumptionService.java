package okkpp.service.economics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.economics.RateOfConsumptionMapper;
import okkpp.model.economics.RateOfConsumption;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:18:27
*/
@Service
@Transactional
public class RateOfConsumptionService {

	@Autowired
	RateOfConsumptionMapper mapper;
	public List<RateOfConsumption> selectAll() {
		return mapper.selectAll();
	}
}
