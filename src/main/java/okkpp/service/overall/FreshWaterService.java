package okkpp.service.overall;

import java.util.List;
import okkpp.dao.overall.FreshWaterMapper;
import okkpp.model.overall.FreshWater;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * @author DUCK  E-mail: okkpp@qq.com
 * @date 创建时间：2018年3月2日 上午10:58:33 
 * @version 1.0 
 */
@Service
@Transactional
public class FreshWaterService {

	@Autowired
	FreshWaterMapper mapper;
	public List<FreshWater> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(FreshWater.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<FreshWater> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(FreshWater.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<FreshWater> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// FreshWater更新
	public int updateFreshWater(FreshWater freshWaterf) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(freshWaterf);
	}

	// FreshWater插入
	public int insertFreshWater(FreshWater freshWater) {
		return mapper.insertSelective(freshWater);
	}

	// FreshWater删除
	public int deleteFreshWater(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
