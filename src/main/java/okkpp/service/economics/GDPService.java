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
* @date 创建时间：2018年3月6日 上午9:06:15
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
