package okkpp.service.fiinance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.finance.MoneySupplyMapper;
import okkpp.model.finance.ListedDomesticCompanies;
import okkpp.model.finance.MoneySupply;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午10:53:53
*/
@Service
@Transactional
public class MoneySupplyService {

	@Autowired
	MoneySupplyMapper mapper;
	public List<MoneySupply> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<MoneySupply> selectByExample(String column,String condition){
		Example example = new Example(MoneySupply.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
