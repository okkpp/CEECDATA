package okkpp.service.finance;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.finance.SocialContributionsMapper;
import okkpp.model.finance.SocialContributions;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date ����ʱ�䣺2018��3��7�� ����10:55:55
*/
@Service
@Transactional
public class SocialContributionsService {

	@Autowired
	SocialContributionsMapper mapper;
	public List<SocialContributions> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn){		
		PageHelper.startPage(pn, 10);
		List<SocialContributions> list = mapper.selectAll();
		return new PageInfo(list, 10);
	}
	
	public List<SocialContributions> selectByExample(String column,String condition){
		Example example = new Example(SocialContributions.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
