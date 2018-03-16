package okkpp.service.fiinance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.finance.BankNonPerformingLoansMapper;
import okkpp.model.finance.BankCapital;
import okkpp.model.finance.BankNonPerformingLoans;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午10:43:36
*/
@Service
@Transactional
public class BankNonPerformingLoansService {

	@Autowired
	BankNonPerformingLoansMapper mapper;
	public List<BankNonPerformingLoans> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<BankNonPerformingLoans> selectByExample(String column,String condition){
		Example example = new Example(BankNonPerformingLoans.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
