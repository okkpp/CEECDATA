package okkpp.service.overall;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.overall.LandUtilizationMapper;
import okkpp.model.overall.LandUtilization;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月5日 下午3:38:11
*/
@Service
@Transactional
public class LandUtilizationService {

	@Autowired
	LandUtilizationMapper mapper;
	public List<LandUtilization> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn){		
		PageHelper.startPage(pn, 10);
		List<LandUtilization> list = mapper.selectAll();
		return new PageInfo(list, 10);
	}
	
	public List<LandUtilization> selectByExample(String column,String condition){
		Example example = new Example(LandUtilization.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
