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
* @date ����ʱ�䣺2018��3��6�� ����9:27:07
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
	public <E> PageInfo<E> getPageInfo(int pn){		
		PageHelper.startPage(pn, 10);
		List<EducationalUnemployment> list = mapper.selectAll();
		return new PageInfo(list, 10);
	}
	
	public List<EducationalUnemployment> selectByExample(String column,String condition){
		Example example = new Example(EducationalUnemployment.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}