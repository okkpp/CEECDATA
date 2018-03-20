package okkpp.service.economics;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.economics.IndicatorsOfNAMapper;
import okkpp.model.economics.IndicatorsOfNA;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date ����ʱ�䣺2018��3��6�� ����9:12:47
*/
@Service
@Transactional
public class IndicatorsOfNAService {

	@Autowired
	IndicatorsOfNAMapper mapper;
	public List<IndicatorsOfNA> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn){		
		PageHelper.startPage(pn, 10);
		List<IndicatorsOfNA> list = mapper.selectAll();
		return new PageInfo(list, 10);
	}
	
	public List<IndicatorsOfNA> selectByExample(String column,String condition){
		Example example = new Example(IndicatorsOfNA.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
