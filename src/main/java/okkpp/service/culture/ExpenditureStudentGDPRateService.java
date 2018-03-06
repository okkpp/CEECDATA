package okkpp.service.culture;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.culture.ExpenditureStudentGDPRateMapper;
import okkpp.model.culture.ExpenditureStudentGDPRate;

/**
* @author duck
* @date 创建时间：2018年3月5日 下午3:57:41
*/
@Service
@Transactional
public class ExpenditureStudentGDPRateService {

	@Autowired
	ExpenditureStudentGDPRateMapper mapper;
	public List<ExpenditureStudentGDPRate> selectAll(){
		return mapper.selectAll();
	}
}
