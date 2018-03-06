package okkpp.service.economics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.economics.ShareOfFormationMapper;
import okkpp.model.economics.ShareOfFormation;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:22:29
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
