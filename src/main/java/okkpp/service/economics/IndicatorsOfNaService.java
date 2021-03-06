package okkpp.service.economics;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.economics.IndicatorsOfNaMapper;
import okkpp.model.economics.IndicatorsOfNa;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:12:47
*/
@Service
@Transactional
public class IndicatorsOfNaService {

	@Autowired
	IndicatorsOfNaMapper mapper;
	public List<IndicatorsOfNa> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(IndicatorsOfNa.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<IndicatorsOfNa> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(IndicatorsOfNa.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<IndicatorsOfNa> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// IndicatorsOfNa更新
	public int updateIndicatorsOfNa(IndicatorsOfNa indicatorsOfNa) {
		// TODO Auto-generated method 
		return mapper.updateByPrimaryKeySelective(indicatorsOfNa);
	}

	// IndicatorsOfNa插入
	public int insertIndicatorsOfNa(IndicatorsOfNa indicatorsOfNa) {
		return mapper.insertSelective(indicatorsOfNa);
	}

	// IndicatorsOfNa删除
	public int deleteIndicatorsOfNa(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
