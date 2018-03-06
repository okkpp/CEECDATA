package okkpp.service.emoloyment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.employment.EducationalUnemploymentMapper;
import okkpp.model.employment.EducationalUnemployment;

/**
* @author duck
* @date ����ʱ�䣺2018��3��6�� ����9:27:07
*/
@Service
@Transactional
public class EducationalUnemploymentService {

	@Autowired
	EducationalUnemploymentMapper mapper;
	public List<EducationalUnemployment> selectAll() {
		return mapper.selectAll();
	}
}
