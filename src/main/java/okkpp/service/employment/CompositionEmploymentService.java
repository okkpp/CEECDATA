package okkpp.service.employment;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import okkpp.dao.employment.CompositionEmploymentMapper;
import okkpp.model.employment.CompositionEmployment;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date ����ʱ�䣺2018��3��6�� ����9:24:38
*/
@Service
@Transactional
public class CompositionEmploymentService {

	@Autowired
	CompositionEmploymentMapper mapper;
	public List<CompositionEmployment> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<CompositionEmployment> selectByExample(String column,String condition){
		Example example = new Example(CompositionEmployment.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
