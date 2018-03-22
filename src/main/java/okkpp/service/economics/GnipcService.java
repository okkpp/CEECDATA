package okkpp.service.economics;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.economics.GnipcMapper;
import okkpp.model.economics.Gnipc;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:09:31
*/
@Service
@Transactional
public class GnipcService {

	@Autowired
	GnipcMapper mapper;
	public List<Gnipc> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(Gnipc.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<Gnipc> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(Gnipc.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<Gnipc> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// Gnipc更新
	public int updateGnipc(Gnipc gnipc) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(gnipc);
	}

	// Gnipc插入
	public int insertGnipc(Gnipc gnipc) {
		return mapper.insertSelective(gnipc);
	}

	// Gnipc删除
	public int deleteGnipc(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
