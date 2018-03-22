package okkpp.service.culture;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.culture.SchoolEnrollmentRatioMapper;
import okkpp.model.culture.SchoolEnrollmentRatio;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:00:24
*/
@Service
@Transactional
public class SchoolEnrollmentRatioService {

	@Autowired
	SchoolEnrollmentRatioMapper mapper;
	public List<SchoolEnrollmentRatio> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(SchoolEnrollmentRatio.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<SchoolEnrollmentRatio> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(SchoolEnrollmentRatio.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<SchoolEnrollmentRatio> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// SchoolEnrollmentRatio更新
	public int updateSchoolEnrollmentRatio(SchoolEnrollmentRatio schoolEnrollmentRatio) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(schoolEnrollmentRatio);
	}

	// SchoolEnrollmentRatio插入
	public int insertSchoolEnrollmentRatio(SchoolEnrollmentRatio schoolEnrollmentRatio) {
		return mapper.insertSelective(schoolEnrollmentRatio);
	}

	// SchoolEnrollmentRatio删除
	public int deleteSchoolEnrollmentRatio(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
