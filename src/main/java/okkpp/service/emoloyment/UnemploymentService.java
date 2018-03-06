package okkpp.service.emoloyment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.employment.UnemploymentMapper;
import okkpp.model.employment.Unemployment;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:33:19
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
