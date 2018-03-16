package okkpp.service.fiinance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.finance.DebtMapper;
import okkpp.model.finance.CentralGovernmentRevenue;
import okkpp.model.finance.Debt;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date ����ʱ�䣺2018��3��7�� ����10:47:14
*/
@Service
@Transactional
public class DebtService {

	@Autowired
	DebtMapper mapper;
	public List<Debt> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<Debt> selectByExample(String column,String condition){
		Example example = new Example(Debt.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
