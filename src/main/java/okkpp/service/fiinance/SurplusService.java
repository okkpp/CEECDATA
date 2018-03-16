package okkpp.service.fiinance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.finance.SurplusMapper;
import okkpp.model.finance.StocksTradedValue;
import okkpp.model.finance.Surplus;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午10:58:17
*/
@Service
@Transactional
public class SurplusService {

	@Autowired
	SurplusMapper mapper;
	public List<Surplus> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<Surplus> selectByExample(String column,String condition){
		Example example = new Example(Surplus.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
