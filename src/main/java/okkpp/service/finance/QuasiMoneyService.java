package okkpp.service.finance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.finance.QuasiMoneyMapper;
import okkpp.model.finance.MoneySupply;
import okkpp.model.finance.QuasiMoney;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date ����ʱ�䣺2018��3��7�� ����10:54:48
*/
@Service
@Transactional
public class QuasiMoneyService {

	@Autowired
	QuasiMoneyMapper mapper;
	public List<QuasiMoney> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<QuasiMoney> selectByExample(String column,String condition){
		Example example = new Example(QuasiMoney.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
