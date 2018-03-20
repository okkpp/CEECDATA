package okkpp.service.energy;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.energy.EnergyImportsMapper;
import okkpp.model.energy.EnergyImports;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午10:39:05
*/
@Service
@Transactional
public class EnergyImportsService {

	@Autowired
	EnergyImportsMapper mapper;
	public List<EnergyImports> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn){		
		PageHelper.startPage(pn, 10);
		List<EnergyImports> list = mapper.selectAll();
		return new PageInfo(list, 10);
	}
	
	public List<EnergyImports> selectByExample(String column,String condition){
		Example example = new Example(EnergyImports.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
