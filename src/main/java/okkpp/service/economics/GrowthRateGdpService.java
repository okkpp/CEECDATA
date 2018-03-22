package okkpp.service.economics;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.economics.GrowthRateGdpMapper;
import okkpp.model.economics.GrowthRateGdp;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:10:48
*/
@Service
@Transactional
public class GrowthRateGdpService {

	@Autowired
	GrowthRateGdpMapper mapper;
	public List<GrowthRateGdp> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(GrowthRateGdp.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<GrowthRateGdp> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(GrowthRateGdp.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<GrowthRateGdp> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// GrowthRateGdp更新
	public int updateGrowthRateGdp(GrowthRateGdp growthRateGdp) {
		// TODO Auto-generated method 
		return mapper.updateByPrimaryKeySelective(growthRateGdp);
	}

	// GrowthRateGdp插入
	public int insertGrowthRateGdp(GrowthRateGdp growthRateGdp) {
		return mapper.insertSelective(growthRateGdp);
	}

	// GrowthRateGdp删除
	public int deleteGrowthRateGdp(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
