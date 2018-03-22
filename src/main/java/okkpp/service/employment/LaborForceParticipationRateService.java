package okkpp.service.employment;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.employment.LaborForceParticipationRateMapper;
import okkpp.model.employment.LaborForceParticipationRate;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:32:01
*/
@Service
@Transactional
public class LaborForceParticipationRateService {

	@Autowired
	LaborForceParticipationRateMapper mapper;
	public List<LaborForceParticipationRate> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(LaborForceParticipationRate.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<LaborForceParticipationRate> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(LaborForceParticipationRate.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<LaborForceParticipationRate> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// LaborForceParticipationRate更新
	public int updateLaborForceParticipationRate(LaborForceParticipationRate laborForceParticipationRate) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(laborForceParticipationRate);
	}

	// LaborForceParticipationRate插入
	public int insertLaborForceParticipationRate(LaborForceParticipationRate laborForceParticipationRate) {
		return mapper.insertSelective(laborForceParticipationRate);
	}

	// LaborForceParticipationRate删除
	public int deleteLaborForceParticipationRate(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
