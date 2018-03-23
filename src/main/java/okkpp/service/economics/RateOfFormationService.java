package okkpp.service.economics;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.economics.RateOfFormationMapper;
import okkpp.model.economics.RateOfFormation;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:19:20
*/
@Service
@Transactional
public class RateOfFormationService {

	@Autowired
	RateOfFormationMapper mapper;
	public List<RateOfFormation> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(RateOfFormation.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<RateOfFormation> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(RateOfFormation.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<RateOfFormation> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// RateOfFormation更新
	public int updateRateOfFormation(RateOfFormation rateOfFormation) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(rateOfFormation);
	}

	// RateOfFormation插入
	public int insertRateOfFormation(RateOfFormation rateOfFormation) {
		return mapper.insertSelective(rateOfFormation);
	}

	// RateOfFormation删除
	public int deleteRateOfFormation(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
