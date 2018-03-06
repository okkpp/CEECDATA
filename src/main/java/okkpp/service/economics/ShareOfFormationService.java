package okkpp.service.economics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.economics.ShareOfFormationMapper;
import okkpp.model.economics.ShareOfFormation;

/**
* @author duck
* @date ����ʱ�䣺2018��3��6�� ����9:22:29
*/
@Service
@Transactional
public class ShareOfFormationService {

	@Autowired
	ShareOfFormationMapper mapper;
	public List<ShareOfFormation> selectAll() {
		return mapper.selectAll();
	}
}
