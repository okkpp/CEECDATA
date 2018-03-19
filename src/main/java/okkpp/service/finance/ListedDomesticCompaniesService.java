package okkpp.service.finance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.finance.ListedDomesticCompaniesMapper;
import okkpp.model.finance.GrowthRateOfMoney;
import okkpp.model.finance.ListedDomesticCompanies;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date ����ʱ�䣺2018��3��7�� ����10:52:55
*/
@Service
@Transactional
public class ListedDomesticCompaniesService {

	@Autowired
	ListedDomesticCompaniesMapper mapper;
	public List<ListedDomesticCompanies> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<ListedDomesticCompanies> selectByExample(String column,String condition){
		Example example = new Example(ListedDomesticCompanies.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
