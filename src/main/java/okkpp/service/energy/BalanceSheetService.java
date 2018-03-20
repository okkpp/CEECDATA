package okkpp.service.energy;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.energy.BalanceSheetMapper;
import okkpp.model.energy.BalanceSheet;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午10:33:12
*/
@Service
@Transactional
public class BalanceSheetService {

	@Autowired
	BalanceSheetMapper mapper;
	public List<BalanceSheet> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn){		
		PageHelper.startPage(pn, 10);
		List<BalanceSheet> list = mapper.selectAll();
		return new PageInfo(list, 10);
	}
	
	public List<BalanceSheet> selectByExample(String column,String condition){
		Example example = new Example(BalanceSheet.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
