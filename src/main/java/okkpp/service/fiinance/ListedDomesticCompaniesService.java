package okkpp.service.fiinance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.finance.ListedDomesticCompaniesMapper;
import okkpp.model.finance.ListedDomesticCompanies;
import okkpp.utils.CountryCode;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午10:52:55
*/
@Service
@Transactional
public class ListedDomesticCompaniesService {

	@Autowired
	ListedDomesticCompaniesMapper mapper;
	public List<ListedDomesticCompanies> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
}
