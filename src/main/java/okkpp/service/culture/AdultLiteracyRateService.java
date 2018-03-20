package okkpp.service.culture;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.culture.AdultLiteracyRateMapper;
import okkpp.model.culture.AdultLiteracyRate;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月5日 下午3:51:48
*/
@Service
@Transactional
public class AdultLiteracyRateService {

	@Autowired
	AdultLiteracyRateMapper mapper;
	public List<AdultLiteracyRate> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn){		
		PageHelper.startPage(pn, 10);
		List<AdultLiteracyRate> list = mapper.selectAll();
		return new PageInfo(list, 10);
	}
	
	public List<AdultLiteracyRate> selectByExample(String column,String condition){
		Example example = new Example(AdultLiteracyRate.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
