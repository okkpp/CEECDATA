package okkpp.service.employment;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.employment.UnemploymentMapper;
import okkpp.model.employment.Unemployment;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date ����ʱ�䣺2018��3��6�� ����9:33:19
*/
@Service
@Transactional
public class UnemploymentService {

	@Autowired
	UnemploymentMapper mapper;
	public List<Unemployment> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(Unemployment.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<Unemployment> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(Unemployment.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<Unemployment> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// Unemployment����
	public int updateUnemployment(Unemployment unemployment) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(unemployment);
	}

	// Unemployment����
	public int insertUnemployment(Unemployment unemployment) {
		return mapper.insertSelective(unemployment);
	}

	// Unemploymentɾ��
	public int deleteUnemployment(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
