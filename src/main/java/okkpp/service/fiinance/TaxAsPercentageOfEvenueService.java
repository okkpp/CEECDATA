package okkpp.service.fiinance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.finance.TaxAsPercentageOfEvenueMapper;
import okkpp.model.finance.Surplus;
import okkpp.model.finance.TaxAsPercentageOfEvenue;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午10:59:31
*/
@Service
@Transactional
public class TaxAsPercentageOfEvenueService {

	@Autowired
	TaxAsPercentageOfEvenueMapper mapper;
	public List<TaxAsPercentageOfEvenue> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<TaxAsPercentageOfEvenue> selectByExample(String column,String condition){
		Example example = new Example(TaxAsPercentageOfEvenue.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
