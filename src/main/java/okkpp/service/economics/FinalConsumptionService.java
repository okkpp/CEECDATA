package okkpp.service.economics;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.economics.FinalConsumptionMapper;
import okkpp.model.economics.FinalConsumption;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:03:45
*/
@Service
@Transactional
public class FinalConsumptionService {

	@Autowired
	FinalConsumptionMapper mapper;
	public List<FinalConsumption> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(FinalConsumption.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<FinalConsumption> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(FinalConsumption.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<FinalConsumption> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// FinalConsumption更新
	public int updateFinalConsumption(FinalConsumption finalConsumption) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(finalConsumption);
	}

	// FinalConsumption插入
	public int insertFinalConsumption(FinalConsumption finalConsumption) {
		return mapper.insertSelective(finalConsumption);
	}

	// FinalConsumption删除
	public int deleteFinalConsumption(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
