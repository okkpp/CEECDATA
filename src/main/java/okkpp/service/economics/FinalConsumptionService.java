package okkpp.service.economics;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.economics.FinalConsumptionMapper;
import okkpp.model.economics.FinalConsumption;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:03:45
*/
@Service
@Transactional
public class FinalConsumptionService {

	@Autowired
	FinalConsumptionMapper mapper;
	public List<FinalConsumption> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn){		
		PageHelper.startPage(pn, 10);
		List<FinalConsumption> list = mapper.selectAll();
		return new PageInfo(list, 10);
	}
	
	public List<FinalConsumption> selectByExample(String column,String condition){
		Example example = new Example(FinalConsumption.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
