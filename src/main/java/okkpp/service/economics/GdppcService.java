package okkpp.service.economics;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.economics.GdppcMapper;
import okkpp.model.economics.Gdppc;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:08:23
*/
@Service
@Transactional
public class GdppcService {

	@Autowired
	GdppcMapper mapper;
	public List<Gdppc> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(Gdppc.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<Gdppc> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(Gdppc.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<Gdppc> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// Gdppc更新
	public int updateGdppc(Gdppc gdppc) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(gdppc);
	}

	// Gdppc插入
	public int insertGdppc(Gdppc gdppc) {
		return mapper.insertSelective(gdppc);
	}

	// Gdppc删除
	public int deleteGdppc(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
