package okkpp.service.emoloyment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.employment.EmploymentGDPMapper;
import okkpp.model.employment.EmploymentGDP;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:29:36
*/
@Service
@Transactional
public class EmploymentGDPService {

	@Autowired
	EmploymentGDPMapper mapper;
	public List<EmploymentGDP> selectAll() {
		return mapper.selectAll();
	}
}
