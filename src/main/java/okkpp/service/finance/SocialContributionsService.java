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
* @date 创建时间：2018年3月7日 上午10:55:55
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
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(SocialContributions.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<SocialContributions> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(SocialContributions.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<SocialContributions> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// SocialContributions更新
	public int updateSocialContributions(SocialContributions socialContributions) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(socialContributions);
	}

	// SocialContributions插入
	public int insertSocialContributions(SocialContributions socialContributions) {
		return mapper.insertSelective(socialContributions);
	}

	// SocialContributions删除
	public int deleteSocialContributions(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
