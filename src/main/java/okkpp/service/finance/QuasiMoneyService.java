package okkpp.service.finance;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.finance.QuasiMoneyMapper;
import okkpp.model.finance.QuasiMoney;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午10:54:48
*/
@Service
@Transactional
public class QuasiMoneyService {

	@Autowired
	QuasiMoneyMapper mapper;
	public List<QuasiMoney> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn){		
		PageHelper.startPage(pn, 10);
		List<QuasiMoney> list = mapper.selectAll();
		return new PageInfo(list, 10);
	}
	
	public List<QuasiMoney> selectByExample(String column,String condition){
		Example example = new Example(QuasiMoney.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
