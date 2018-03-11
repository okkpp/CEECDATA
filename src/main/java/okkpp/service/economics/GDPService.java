package okkpp.service.economics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.economics.GDPMapper;
import okkpp.model.economics.GDP;
import okkpp.utils.CountryCode;

/**
* @author duck
* @date ����ʱ�䣺2018��3��6�� ����9:06:15
*/
@Service
@Transactional
public class GDPService {

	@Autowired
	GDPMapper mapper;
	public List<GDP> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
}
