package okkpp.service.emoloyment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.employment.EmploymentMapper;
import okkpp.model.employment.Employment;

/**
* @author duck
* @date ����ʱ�䣺2018��3��6�� ����9:28:29
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
