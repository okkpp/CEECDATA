package okkpp.service.fiinance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.finance.GlobalEquityIndicesMapper;
import okkpp.model.finance.DomesticCredit;
import okkpp.model.finance.GlobalEquityIndices;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

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
	
	public List<GlobalEquityIndices> selectByExample(String column,String condition){
		Example example = new Example(GlobalEquityIndices.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
