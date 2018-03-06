package okkpp.service.culture;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.culture.PatentApplicationsMapper;
import okkpp.model.culture.PatentApplications;

/**
* @author duck
* @date ����ʱ�䣺2018��3��6�� ����8:53:22
*/
@Service
@Transactional
public class PatentApplicationsService {

	@Autowired
	PatentApplicationsMapper mapper;
	public List<PatentApplications> selectAll(){
		return mapper.selectAll();
	}
}
