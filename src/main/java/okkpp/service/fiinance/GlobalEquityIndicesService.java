package okkpp.service.fiinance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.finance.GlobalEquityIndicesMapper;
import okkpp.model.finance.GlobalEquityIndices;
import okkpp.utils.CountryCode;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午10:50:34
*/
@Service
@Transactional
public class GlobalEquityIndicesService {

	@Autowired
	GlobalEquityIndicesMapper mapper;
	public List<GlobalEquityIndices> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
}
