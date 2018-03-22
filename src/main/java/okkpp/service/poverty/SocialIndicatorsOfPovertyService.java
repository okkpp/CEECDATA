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
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(SocialIndicatorsOfPoverty.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<SocialIndicatorsOfPoverty> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(SocialIndicatorsOfPoverty.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<SocialIndicatorsOfPoverty> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// SocialIndicatorsOfPoverty¸üÐÂ
	public int updateSocialIndicatorsOfPoverty(SocialIndicatorsOfPoverty socialIndicatorsOfPoverty) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(socialIndicatorsOfPoverty);
	}

	// SocialIndicatorsOfPoverty²åÈë
	public int insertSocialIndicatorsOfPoverty(SocialIndicatorsOfPoverty socialIndicatorsOfPoverty) {
		return mapper.insertSelective(socialIndicatorsOfPoverty);
	}

	// SocialIndicatorsOfPovertyÉ¾³ý
	public int deleteSocialIndicatorsOfPoverty(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
	
}
