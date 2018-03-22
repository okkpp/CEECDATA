package okkpp.service.employment;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.employment.UnemploymentRateMapper;
import okkpp.model.employment.UnemploymentRate;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:34:13
*/
@Service
@Transactional
public class UnemploymentRateService {

	@Autowired
	UnemploymentRateMapper mapper;
	public List<UnemploymentRate> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(UnemploymentRate.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<UnemploymentRate> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(UnemploymentRate.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<UnemploymentRate> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// UnemploymentRate更新
	public int updateUnemploymentRate(UnemploymentRate unemploymentRate) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(unemploymentRate);
	}

	// UnemploymentRate插入
	public int insertUnemploymentRate(UnemploymentRate unemploymentRate) {
		return mapper.insertSelective(unemploymentRate);
	}

	// UnemploymentRate删除
	public int deleteUnemploymentRate(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
