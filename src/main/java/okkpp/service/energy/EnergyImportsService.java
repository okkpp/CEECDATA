package okkpp.service.energy;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.energy.EnergyImportsMapper;
import okkpp.model.energy.EnergyImports;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午10:39:05
*/
@Service
@Transactional
public class EnergyImportsService {

	@Autowired
	EnergyImportsMapper mapper;
	public List<EnergyImports> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(EnergyImports.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<EnergyImports> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(EnergyImports.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<EnergyImports> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// EnergyImports更新
	public int updateEnergyImports(EnergyImports energyImports) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(energyImports);
	}

	// EnergyImports插入
	public int insertEnergyImports(EnergyImports energyImports) {
		return mapper.insertSelective(energyImports);
	}

	// EnergyImports删除
	public int deleteEnergyImports(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
