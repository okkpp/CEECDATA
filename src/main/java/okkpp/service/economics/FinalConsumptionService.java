package okkpp.service.economics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.economics.FinalConsumptionMapper;
import okkpp.model.economics.FinalConsumption;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:03:45
*/
@Service
@Transactional
public class FinalConsumptionService {

	@Autowired
	FinalConsumptionMapper mapper;
	public List<FinalConsumption> selectAll() {
		return mapper.selectAll();
	}
}
