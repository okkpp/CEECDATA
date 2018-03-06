package okkpp.service.culture;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.culture.HospitalMapper;
import okkpp.model.culture.Hospital;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午8:51:56
*/
@Service
@Transactional
public class HospitalService {

	@Autowired
	HospitalMapper mapper;
	public List<Hospital> selectAll(){
		return mapper.selectAll();
	}
}
