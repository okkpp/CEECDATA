package okkpp.service.agriculture;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.agriculture.HarvestAreasMapper;
import okkpp.model.agriculture.HarvestAreas;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月5日 下午3:41:39
*/
@Service
@Transactional
public class HarvestAreasService {

	@Autowired
	HarvestAreasMapper mapper;
	public List<HarvestAreas> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn){		
		PageHelper.startPage(pn, 10);
		List<HarvestAreas> list = mapper.selectAll();
		return new PageInfo(list, 10);
	}
	
	public List<HarvestAreas> selectByExample(String column,String condition){
		Example example = new Example(HarvestAreas.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
