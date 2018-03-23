package okkpp.service.employment;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.employment.EducationalMapper;
import okkpp.model.employment.Educational;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date ����ʱ�䣺2018��3��6�� ����9:25:50
*/
@Service
@Transactional
public class EducationalService {

	@Autowired
	EducationalMapper mapper;
	public List<Educational> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(Educational.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<Educational> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(Educational.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<Educational> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// Educational����
	public int updateEducational(Educational educational) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(educational);
	}

	// Educational����
	public int insertEducational(Educational educational) {
		return mapper.insertSelective(educational);
	}

	// Educationalɾ��
	public int deleteEducational(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
