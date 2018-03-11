package okkpp.service.economics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.economics.PercentageOfIndicesMapper;
import okkpp.model.economics.PercentageOfIndices;
import okkpp.utils.CountryCode;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:16:17
*/
@Service
@Transactional
public class PercentageOfIndicesService {

	@Autowired
	PercentageOfIndicesMapper mapper;
	public List<PercentageOfIndices> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
}
