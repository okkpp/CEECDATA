package okkpp.service.emoloyment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.employment.LaborForceMapper;
import okkpp.model.employment.LaborForce;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:30:42
*/
@Service
@Transactional
public class LaborForceService {

	@Autowired
	LaborForceMapper mapper;
	public List<LaborForce> selectAll() {
		return mapper.selectAll();
	}
}
