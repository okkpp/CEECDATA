package okkpp.service.overall;

import java.util.List;
import okkpp.dao.overall.CountryAreaMapper;
import okkpp.model.overall.CountryArea;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * @author DUCK  E-mail: okkpp@qq.com
 * @date 创建时间：2018年3月2日 上午10:05:25 
 * @version 1.0 
 */
@Service
@Transactional
public class CountryAreaService {

	@Autowired
	CountryAreaMapper mapper;
	public List<CountryArea> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(CountryArea.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<CountryArea> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(CountryArea.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<CountryArea> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// CountryArea更新
	public int updateCountryArea(CountryArea countryArea) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(countryArea);
	}

	// CountryArea插入
	public int insertCountryArea(CountryArea countryArea) {
		return mapper.insertSelective(countryArea);
	}

	// CountryArea删除
	public int deleteCountryArea(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
	
}
