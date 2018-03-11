package okkpp.service.industry;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.industry.ValueAddedInManufacturingMapper;
import okkpp.model.industry.ValueAddedInManufacturing;
import okkpp.utils.CountryCode;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午11:04:09
*/
@Service
@Transactional
public class ValueAddedInManufacturingService {

	@Autowired
	ValueAddedInManufacturingMapper mapper;
	public List<ValueAddedInManufacturing> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
}
