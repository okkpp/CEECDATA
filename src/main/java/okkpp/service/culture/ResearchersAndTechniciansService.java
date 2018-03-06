package okkpp.service.culture;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.culture.ResearchersAndTechniciansMapper;
import okkpp.model.culture.ResearchersAndTechnicians;

/**
* @author duck
* @date ����ʱ�䣺2018��3��6�� ����8:54:42
*/
@Service
@Transactional
public class ResearchersAndTechniciansService {

	@Autowired
	ResearchersAndTechniciansMapper mapper;
	public List<ResearchersAndTechnicians> selectAll(){
		return mapper.selectAll();
	}
}
