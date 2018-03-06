package okkpp.service.overall;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.overall.LandUtilizationMapper;
import okkpp.model.overall.LandUtilization;

/**
* @author duck
* @date 创建时间：2018年3月5日 下午3:38:11
*/
@Service
@Transactional
public class LandUtilizationService {

	@Autowired
	LandUtilizationMapper mapper;
	public List<LandUtilization> selectAll(){
		return mapper.selectAll();
	}
}
