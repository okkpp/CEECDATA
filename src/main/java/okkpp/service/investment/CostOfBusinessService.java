package okkpp.service.investment;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.investment.CostOfBusinessMapper;
import okkpp.model.investment.CostOfBusiness;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class CostOfBusinessService {

	@Autowired
	CostOfBusinessMapper mapper;
	
	public List<CostOfBusiness> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(CostOfBusiness.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<CostOfBusiness> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(CostOfBusiness.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<CostOfBusiness> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// CostOfBusiness¸üÐÂ
	public int updateCostOfBusiness(CostOfBusiness costOfBusiness) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(costOfBusiness);
	}

	// CostOfBusiness²åÈë
	public int insertCostOfBusiness(CostOfBusiness costOfBusiness) {
		return mapper.insertSelective(costOfBusiness);
	}

	// CostOfBusinessÉ¾³ý
	public int deleteCostOfBusiness(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
