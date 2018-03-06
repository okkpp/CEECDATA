package okkpp.service.economics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.economics.FinalConsumptionMapper;
import okkpp.model.economics.FinalConsumption;

/**
* @author duck
* @date ����ʱ�䣺2018��3��6�� ����9:03:45
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
