package okkpp.service.poverty;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.poverty.SocialIndicatorsOfPovertyMapper;
import okkpp.model.poverty.SocialIndicatorsOfPoverty;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class SocialIndicatorsOfPovertyService {

	@Autowired
	SocialIndicatorsOfPovertyMapper mapper;
	
	public List<SocialIndicatorsOfPoverty> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn){		
		PageHelper.startPage(pn, 10);
		List<SocialIndicatorsOfPoverty> list = mapper.selectAll();
		return new PageInfo(list, 10);
	}
	
	public List<SocialIndicatorsOfPoverty> selectByExample(String column,String condition){
		Example example = new Example(SocialIndicatorsOfPoverty.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
	
}
