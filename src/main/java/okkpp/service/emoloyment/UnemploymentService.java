package okkpp.service.emoloyment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.employment.UnemploymentMapper;
import okkpp.model.employment.Unemployment;

/**
* @author duck
* @date ����ʱ�䣺2018��3��6�� ����9:33:19
*/
@Service
@Transactional
public class UnemploymentService {

	@Autowired
	UnemploymentMapper mapper;
	public List<Unemployment> selectAll() {
		return mapper.selectAll();
	}
}
