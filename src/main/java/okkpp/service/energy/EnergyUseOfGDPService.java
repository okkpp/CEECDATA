package okkpp.service.energy;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.energy.EnergyUseOfGDPMapper;
import okkpp.model.energy.EnergyUseOfGDP;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午10:40:15
*/
@Service
@Transactional
public class EnergyUseOfGDPService {

	@Autowired
	EnergyUseOfGDPMapper mapper;
	public List<EnergyUseOfGDP> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn){		
		PageHelper.startPage(pn, 10);
		List<EnergyUseOfGDP> list = mapper.selectAll();
		return new PageInfo(list, 10);
	}
	
	public List<EnergyUseOfGDP> selectByExample(String column,String condition){
		Example example = new Example(EnergyUseOfGDP.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
