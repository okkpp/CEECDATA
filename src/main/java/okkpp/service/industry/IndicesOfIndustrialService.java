package okkpp.service.industry;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.industry.IndicesOfIndustrialMapper;
import okkpp.model.industry.IndicesOfIndustrial;
import okkpp.utils.CountryCode;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午11:01:13
*/
@Service
@Transactional
public class IndicesOfIndustrialService {

	@Autowired
	IndicesOfIndustrialMapper mapper;
	public List<IndicesOfIndustrial> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
}
