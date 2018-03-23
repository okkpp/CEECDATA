package okkpp.service.investment;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.investment.DensityOfBusinessMapper;
import okkpp.model.investment.DensityOfBusiness;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class DensityOfBusinessService {

	@Autowired
	DensityOfBusinessMapper mapper;
	
	public List<DensityOfBusiness> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(DensityOfBusiness.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<DensityOfBusiness> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(DensityOfBusiness.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<DensityOfBusiness> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// DensityOfBusiness¸üÐÂ
	public int updateDensityOfBusiness(DensityOfBusiness densityOfBusiness) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(densityOfBusiness);
	}

	// DensityOfBusiness²åÈë
	public int insertDensityOfBusiness(DensityOfBusiness densityOfBusiness) {
		return mapper.insertSelective(densityOfBusiness);
	}

	// DensityOfBusinessÉ¾³ý
	public int deleteDensityOfBusiness(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
