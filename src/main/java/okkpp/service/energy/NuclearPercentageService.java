package okkpp.service.energy;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.energy.NuclearPercentageMapper;
import okkpp.model.energy.NuclearPercentage;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午10:41:16
*/
@Service
@Transactional
public class NuclearPercentageService {

	@Autowired
	NuclearPercentageMapper mapper;
	public List<NuclearPercentage> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(NuclearPercentage.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<NuclearPercentage> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(NuclearPercentage.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<NuclearPercentage> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// NuclearPercentage更新
	public int updateNuclearPercentage(NuclearPercentage nuclearPercentage) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(nuclearPercentage);
	}

	// NuclearPercentage插入
	public int insertNuclearPercentage(NuclearPercentage nuclearPercentage) {
		return mapper.insertSelective(nuclearPercentage);
	}

	// NuclearPercentage删除
	public int deleteNuclearPercentage(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
