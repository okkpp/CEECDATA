package okkpp.service.economics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.economics.PercentageOfAgricultureMapper;
import okkpp.model.economics.PercentageOfAgriculture;
import okkpp.utils.CountryCode;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:14:05
*/
@Service
@Transactional
public class PercentageOfAgricultureService {

	@Autowired
	PercentageOfAgricultureMapper mapper;
	public List<PercentageOfAgriculture> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
}
