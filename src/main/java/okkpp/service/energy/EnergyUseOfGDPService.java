package okkpp.service.energy;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.energy.EnergyUseOfGDPMapper;
import okkpp.model.energy.EnergyUseOfGDP;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午10:40:15
*/
@Service
@Transactional
public class EnergyUseOfGDPService {

	@Autowired
	EnergyUseOfGDPMapper mapper;
	public List<EnergyUseOfGDP> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(EnergyUseOfGDP.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<EnergyUseOfGDP> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(EnergyUseOfGDP.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<EnergyUseOfGDP> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// EnergyUseOfGDP更新
	public int updateEnergyUseOfGDP(EnergyUseOfGDP energyUseOfGDP) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(energyUseOfGDP);
	}

	// EnergyUseOfGDP插入
	public int insertEnergyUseOfGDP(EnergyUseOfGDP energyUseOfGDP) {
		return mapper.insertSelective(energyUseOfGDP);
	}

	// EnergyUseOfGDP删除
	public int deleteEnergyUseOfGDP(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
