package okkpp.service.fiinance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.finance.CentralGovernmentRevenueMapper;
import okkpp.model.finance.BankNonPerformingLoans;
import okkpp.model.finance.CentralGovernmentRevenue;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午10:45:55
*/
@Service
@Transactional
public class CentralGovernmentRevenueService {

	@Autowired
	CentralGovernmentRevenueMapper mapper;
	public List<CentralGovernmentRevenue> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<CentralGovernmentRevenue> selectByExample(String column,String condition){
		Example example = new Example(CentralGovernmentRevenue.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
