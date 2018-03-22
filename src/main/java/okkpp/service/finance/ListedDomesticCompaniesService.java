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
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(ListedDomesticCompanies.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<ListedDomesticCompanies> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(ListedDomesticCompanies.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<ListedDomesticCompanies> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// ListedDomesticCompanies更新
	public int updateListedDomesticCompanies(ListedDomesticCompanies listedDomesticCompanies) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(listedDomesticCompanies);
	}

	// ListedDomesticCompanies插入
	public int insertListedDomesticCompanies(ListedDomesticCompanies listedDomesticCompanies) {
		return mapper.insertSelective(listedDomesticCompanies);
	}

	// ListedDomesticCompanies删除
	public int deleteListedDomesticCompanies(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
