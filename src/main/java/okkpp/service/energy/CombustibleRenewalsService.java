package okkpp.service.energy;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.energy.CombustibleRenewalsMapper;
import okkpp.model.energy.CombustibleRenewals;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午10:35:15
*/
@Service
@Transactional
public class CombustibleRenewalsService {

	@Autowired
	CombustibleRenewalsMapper mapper;
	public List<CombustibleRenewals> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn){		
		PageHelper.startPage(pn, 10);
		List<CombustibleRenewals> list = mapper.selectAll();
		return new PageInfo(list, 10);
	}
	
	public List<CombustibleRenewals> selectByExample(String column,String condition){
		Example example = new Example(CombustibleRenewals.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
