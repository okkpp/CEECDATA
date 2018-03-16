package okkpp.service.fiinance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.finance.BankCapitalMapper;
import okkpp.model.energy.NuclearPercentage;
import okkpp.model.finance.BankCapital;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午10:42:40
*/
@Service
@Transactional
public class BankCapitalService {

	@Autowired
	BankCapitalMapper mapper;
	public List<BankCapital> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<BankCapital> selectByExample(String column,String condition){
		Example example = new Example(BankCapital.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
