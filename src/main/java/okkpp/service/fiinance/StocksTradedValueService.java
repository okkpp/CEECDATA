package okkpp.service.fiinance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.finance.StocksTradedValueMapper;
import okkpp.model.finance.StocksTradedValue;
import okkpp.utils.CountryCode;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午10:57:05
*/
@Service
@Transactional
public class StocksTradedValueService {

	@Autowired
	StocksTradedValueMapper mapper;
	public List<StocksTradedValue> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
}
