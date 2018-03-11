package okkpp.service.industry;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.industry.IndicesOfManufacturingMapper;
import okkpp.model.industry.IndicesOfManufacturing;
import okkpp.utils.CountryCode;

/**
* @author duck
* @date ����ʱ�䣺2018��3��7�� ����11:02:09
*/
@Service
@Transactional
public class IndicesOfManufacturingService {

	@Autowired
	IndicesOfManufacturingMapper mapper;
	public List<IndicesOfManufacturing> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
}
