package okkpp.service.employment;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.employment.EmploymentGDPMapper;
import okkpp.model.employment.EmploymentGDP;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:29:36
*/
@Service
@Transactional
public class EmploymentGDPService {

	@Autowired
	EmploymentGDPMapper mapper;
	public List<EmploymentGDP> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(EmploymentGDP.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<EmploymentGDP> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(EmploymentGDP.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<EmploymentGDP> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// EmploymentGDP更新
	public int updateEmploymentGDP(EmploymentGDP employmentGDP) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(employmentGDP);
	}

	// EmploymentGDP插入
	public int insertEmploymentGDP(EmploymentGDP employmentGDP) {
		return mapper.insertSelective(employmentGDP);
	}

	// EmploymentGDP删除
	public int deleteEmploymentGDP(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
