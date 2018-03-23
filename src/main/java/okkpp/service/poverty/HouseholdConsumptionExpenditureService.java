package okkpp.service.poverty;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.poverty.HouseholdConsumptionExpenditureMapper;
import okkpp.model.poverty.HouseholdConsumptionExpenditure;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class HouseholdConsumptionExpenditureService {

	@Autowired
	HouseholdConsumptionExpenditureMapper mapper;
	
	public List<HouseholdConsumptionExpenditure> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(HouseholdConsumptionExpenditure.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<HouseholdConsumptionExpenditure> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(HouseholdConsumptionExpenditure.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<HouseholdConsumptionExpenditure> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// HouseholdConsumptionExpenditure¸üÐÂ
	public int updateHouseholdConsumptionExpenditure(HouseholdConsumptionExpenditure householdConsumptionExpenditure) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(householdConsumptionExpenditure);
	}

	// HouseholdConsumptionExpenditure²åÈë
	public int insertHouseholdConsumptionExpenditure(HouseholdConsumptionExpenditure householdConsumptionExpenditure) {
		return mapper.insertSelective(householdConsumptionExpenditure);
	}

	// HouseholdConsumptionExpenditureÉ¾³ý
	public int deleteHouseholdConsumptionExpenditure(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
