package okkpp.service.employment;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.employment.EducationalUnemploymentMapper;
import okkpp.model.employment.EducationalUnemployment;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:27:07
*/
@Service
@Transactional
public class EducationalUnemploymentService {

	@Autowired
	EducationalUnemploymentMapper mapper;
	public List<EducationalUnemployment> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(EducationalUnemployment.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<EducationalUnemployment> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(EducationalUnemployment.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<EducationalUnemployment> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// EducationalUnemployment更新
	public int updateEducationalUnemployment(EducationalUnemployment educationalUnemployment) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(educationalUnemployment);
	}

	// EducationalUnemployment插入
	public int insertEducationalUnemployment(EducationalUnemployment educationalUnemployment) {
		return mapper.insertSelective(educationalUnemployment);
	}

	// EducationalUnemployment删除
	public int deleteEducationalUnemployment(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
