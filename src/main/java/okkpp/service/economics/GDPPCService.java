package okkpp.service.economics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.economics.GDPPCMapper;
import okkpp.model.economics.GDPPC;

/**
* @author duck
* @date ����ʱ�䣺2018��3��6�� ����9:08:23
*/
@Service
@Transactional
public class GDPPCService {

	@Autowired
	GDPPCMapper mapper;
	public List<GDPPC> selectAll() {
		return mapper.selectAll();
	}
}
