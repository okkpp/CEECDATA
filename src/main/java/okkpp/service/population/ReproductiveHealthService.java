package okkpp.service.population;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import okkpp.dao.population.ReproductiveHealthMapper;
import okkpp.model.population.ReproductiveHealth;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class ReproductiveHealthService {

	@Autowired
	ReproductiveHealthMapper mapper;
	
	public List<ReproductiveHealth> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(ReproductiveHealth.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<ReproductiveHealth> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(ReproductiveHealth.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<ReproductiveHealth> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// ReproductiveHealth¸üÐÂ
	public int updateReproductiveHealth(ReproductiveHealth reproductiveHealth) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(reproductiveHealth);
	}

	// ReproductiveHealth²åÈë
	public int insertReproductiveHealth(ReproductiveHealth reproductiveHealth) {
		return mapper.insertSelective(reproductiveHealth);
	}

	// ReproductiveHealthÉ¾³ý
	public int deleteReproductiveHealth(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
	
}
