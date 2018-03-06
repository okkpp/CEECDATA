package okkpp.service.economics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.economics.RateOfFormationMapper;
import okkpp.model.economics.RateOfFormation;

/**
* @author duck
* @date ����ʱ�䣺2018��3��6�� ����9:19:20
*/
@Service
@Transactional
public class RateOfFormationService {

	@Autowired
	RateOfFormationMapper mapper;
	public List<RateOfFormation> selectAll() {
		return mapper.selectAll();
	}
}
