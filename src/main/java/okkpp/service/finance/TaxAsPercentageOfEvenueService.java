package okkpp.service.finance;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.finance.TaxAsPercentageOfEvenueMapper;
import okkpp.model.finance.TaxAsPercentageOfEvenue;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午10:59:31
*/
@Service
@Transactional
public class TaxAsPercentageOfEvenueService {

	@Autowired
	TaxAsPercentageOfEvenueMapper mapper;
	public List<TaxAsPercentageOfEvenue> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(TaxAsPercentageOfEvenue.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<TaxAsPercentageOfEvenue> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(TaxAsPercentageOfEvenue.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<TaxAsPercentageOfEvenue> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// TaxAsPercentageOfEvenue更新
	public int updateTaxAsPercentageOfEvenue(TaxAsPercentageOfEvenue taxAsPercentageOfEvenue) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(taxAsPercentageOfEvenue);
	}

	// TaxAsPercentageOfEvenue插入
	public int insertTaxAsPercentageOfEvenue(TaxAsPercentageOfEvenue taxAsPercentageOfEvenue) {
		return mapper.insertSelective(taxAsPercentageOfEvenue);
	}

	// TaxAsPercentageOfEvenue删除
	public int deleteTaxAsPercentageOfEvenue(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
