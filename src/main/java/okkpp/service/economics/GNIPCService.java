package okkpp.service.economics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.economics.GNIPCMapper;
import okkpp.model.economics.GNIPC;
import okkpp.utils.CountryCode;

/**
* @author duck
* @date ����ʱ�䣺2018��3��6�� ����9:09:31
*/
@Service
@Transactional
public class GNIPCService {

	@Autowired
	GNIPCMapper mapper;
	public List<GNIPC> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
}
