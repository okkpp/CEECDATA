package okkpp.service.culture;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.culture.HospitalMapper;
import okkpp.model.culture.Hospital;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午8:51:56
*/
@Service
@Transactional
public class HospitalService {

	@Autowired
	HospitalMapper mapper;
	public List<Hospital> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(Hospital.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<Hospital> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(Hospital.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<Hospital> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// Hospital更新
	public int updateHospital(Hospital hospital) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(hospital);
	}

	// Hospital插入
	public int insertHospital(Hospital hospital) {
		return mapper.insertSelective(hospital);
	}

	// Hospital删除
	public int deleteHospital(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
