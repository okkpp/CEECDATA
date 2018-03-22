package okkpp.service.finance;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.finance.StocksTradedValueMapper;
import okkpp.model.finance.StocksTradedValue;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午10:57:05
*/
@Service
@Transactional
public class StocksTradedValueService {

	@Autowired
	StocksTradedValueMapper mapper;
	public List<StocksTradedValue> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(StocksTradedValue.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<StocksTradedValue> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(StocksTradedValue.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<StocksTradedValue> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// StocksTradedValue更新
	public int updateStocksTradedValue(StocksTradedValue stocksTradedValue) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(stocksTradedValue);
	}

	// StocksTradedValue插入
	public int insertStocksTradedValue(StocksTradedValue stocksTradedValue) {
		return mapper.insertSelective(stocksTradedValue);
	}

	// StocksTradedValue删除
	public int deleteStocksTradedValue(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
