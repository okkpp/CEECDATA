package okkpp.service.emoloyment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.employment.EmploymentMapper;
import okkpp.model.employment.Employment;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:28:29
*/
@Service
@Transactional
public class EmploymentService {

	@Autowired
	EmploymentMapper mapper;
	public List<Employment> selectAll() {
		return mapper.selectAll();
	}
}
