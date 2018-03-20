package okkpp.service.finance;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.finance.ListedDomesticCompaniesMapper;
import okkpp.model.finance.ListedDomesticCompanies;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

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
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn){		
		PageHelper.startPage(pn, 10);
		List<ListedDomesticCompanies> list = mapper.selectAll();
		return new PageInfo(list, 10);
	}
	
	public List<ListedDomesticCompanies> selectByExample(String column,String condition){
		Example example = new Example(ListedDomesticCompanies.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
