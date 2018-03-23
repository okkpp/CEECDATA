package okkpp.service.economics;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.economics.GdpMapper;
import okkpp.model.economics.Gdp;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:06:15
*/
@Service
@Transactional
public class GdpService {

	@Autowired
	GdpMapper mapper;
	public List<Gdp> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(Gdp.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<Gdp> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(Gdp.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<Gdp> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// Gdp更新
	public int updateGdp(Gdp gdp) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(gdp);
	}

	// Gdp插入
	public int insertGdp(Gdp gdp) {
		return mapper.insertSelective(gdp);
	}

	// Gdp删除
	public int deleteGdp(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
