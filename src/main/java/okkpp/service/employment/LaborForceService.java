package okkpp.service.employment;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.employment.LaborForceMapper;
import okkpp.model.employment.LaborForce;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:30:42
*/
@Service
@Transactional
public class LaborForceService {

	@Autowired
	LaborForceMapper mapper;
	public List<LaborForce> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(LaborForce.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<LaborForce> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(LaborForce.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<LaborForce> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// LaborForce更新
	public int updateLaborForce(LaborForce laborForce) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(laborForce);
	}

	// LaborForce插入
	public int insertLaborForce(LaborForce laborForce) {
		return mapper.insertSelective(laborForce);
	}

	// LaborForce删除
	public int deleteLaborForce(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
