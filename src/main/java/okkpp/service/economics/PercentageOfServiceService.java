package okkpp.service.economics;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.economics.PercentageOfServiceMapper;
import okkpp.model.economics.PercentageOfService;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:17:29
*/
@Service
@Transactional
public class PercentageOfServiceService {

	@Autowired
	PercentageOfServiceMapper mapper;
	public List<PercentageOfService> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(PercentageOfService.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<PercentageOfService> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(PercentageOfService.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<PercentageOfService> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// PercentageOfService更新
	public int updatePercentageOfService(PercentageOfService percentageOfService) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(percentageOfService);
	}

	// PercentageOfService插入
	public int insertPercentageOfService(PercentageOfService percentageOfService) {
		return mapper.insertSelective(percentageOfService);
	}

	// PercentageOfService删除
	public int deletePercentageOfService(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
