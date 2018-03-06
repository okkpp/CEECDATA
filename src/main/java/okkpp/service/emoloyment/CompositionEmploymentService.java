package okkpp.service.emoloyment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.employment.CompositionEmploymentMapper;
import okkpp.model.employment.CompositionEmployment;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:24:38
*/
@Service
@Transactional
public class CompositionEmploymentService {

	@Autowired
	CompositionEmploymentMapper mapper;
	public List<CompositionEmployment> selectAll() {
		return mapper.selectAll();
	}
}
