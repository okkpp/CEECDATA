package okkpp.service.energy;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.energy.NuclearPercentageMapper;
import okkpp.model.energy.NuclearPercentage;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午10:41:16
*/
@Service
@Transactional
public class NuclearPercentageService {

	@Autowired
	NuclearPercentageMapper mapper;
	public List<NuclearPercentage> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn){		
		PageHelper.startPage(pn, 10);
		List<NuclearPercentage> list = mapper.selectAll();
		return new PageInfo(list, 10);
	}
	
	public List<NuclearPercentage> selectByExample(String column,String condition){
		Example example = new Example(NuclearPercentage.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
