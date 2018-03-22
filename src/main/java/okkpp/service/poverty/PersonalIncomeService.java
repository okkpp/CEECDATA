package okkpp.service.poverty;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.poverty.PersonalIncomeMapper;
import okkpp.model.poverty.PersonalIncome;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class PersonalIncomeService {

	@Autowired
	PersonalIncomeMapper mapper;
	
	public List<PersonalIncome> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(PersonalIncome.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<PersonalIncome> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(PersonalIncome.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<PersonalIncome> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// PersonalIncome¸üÐÂ
	public int updatePersonalIncome(PersonalIncome personalIncome) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(personalIncome);
	}

	// PersonalIncome²åÈë
	public int insertPersonalIncome(PersonalIncome personalIncome) {
		return mapper.insertSelective(personalIncome);
	}

	// PersonalIncomeÉ¾³ý
	public int deletePersonalIncome(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
	
}
