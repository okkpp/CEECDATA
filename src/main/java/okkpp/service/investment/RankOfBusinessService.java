package okkpp.service.investment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.investment.RankOfBusinessMapper;
import okkpp.model.investment.RankOfBusiness;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class RankOfBusinessService {

	@Autowired
	RankOfBusinessMapper mapper;
	
	public List<RankOfBusiness> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(RankOfBusiness.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<RankOfBusiness> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(RankOfBusiness.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<RankOfBusiness> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// RankOfBusiness¸üÐÂ
	public int updateRankOfBusiness(RankOfBusiness rankOfBusiness) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(rankOfBusiness);
	}

	// RankOfBusiness²åÈë
	public int insertRankOfBusiness(RankOfBusiness rankOfBusiness) {
		return mapper.insertSelective(rankOfBusiness);
	}

	// RankOfBusinessÉ¾³ý
	public int deleteRankOfBusiness(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
