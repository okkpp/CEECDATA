package okkpp.service.energy;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.energy.ElectricityGenerationMapper;
import okkpp.model.energy.ElectricityGeneration;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午10:38:05
*/
@Service
@Transactional
public class ElectricityGenerationService {

	@Autowired
	ElectricityGenerationMapper mapper;
	public List<ElectricityGeneration> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(ElectricityGeneration.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<ElectricityGeneration> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(ElectricityGeneration.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<ElectricityGeneration> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// ElectricityGeneration更新
	public int updateElectricityGeneration(ElectricityGeneration electricityGeneration) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(electricityGeneration);
	}

	// ElectricityGeneration插入
	public int insertElectricityGeneration(ElectricityGeneration electricityGeneration) {
		return mapper.insertSelective(electricityGeneration);
	}

	// ElectricityGeneration删除
	public int deleteElectricityGeneration(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
