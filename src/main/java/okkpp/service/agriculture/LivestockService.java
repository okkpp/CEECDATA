package okkpp.service.agriculture;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.agriculture.LivestockMapper;
import okkpp.model.agriculture.Livestock;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月5日 下午3:43:09
*/
@Service
@Transactional
public class LivestockService {

	@Autowired
	LivestockMapper mapper;
	public List<Livestock> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(Livestock.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<Livestock> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(Livestock.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<Livestock> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// Livestock更新
	public int updateLivestock(Livestock livestock) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(livestock);
	}

	// Livestock插入
	public int insertLivestock(Livestock livestock) {
		return mapper.insertSelective(livestock);
	}

	// Livestock删除
	public int deleteLivestock(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
