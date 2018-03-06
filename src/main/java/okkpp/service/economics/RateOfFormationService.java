package okkpp.service.economics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.economics.RateOfFormationMapper;
import okkpp.model.economics.RateOfFormation;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:19:20
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
