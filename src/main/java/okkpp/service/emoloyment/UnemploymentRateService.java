package okkpp.service.emoloyment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.employment.UnemploymentRateMapper;
import okkpp.model.employment.UnemploymentRate;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:34:13
*/
@Service
@Transactional
public class UnemploymentRateService {

	@Autowired
	UnemploymentRateMapper mapper;
	public List<UnemploymentRate> selectAll() {
		return mapper.selectAll();
	}
}
