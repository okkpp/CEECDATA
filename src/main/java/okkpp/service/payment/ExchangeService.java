package okkpp.service.payment;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.payment.ExchangeMapper;
import okkpp.model.payment.Exchange;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class ExchangeService {

	@Autowired
	ExchangeMapper mapper;
	
	public List<Exchange> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(Exchange.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<Exchange> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(Exchange.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<Exchange> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// Exchange¸üÐÂ
	public int updateExchange(Exchange exchange) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(exchange);
	}

	// Exchange²åÈë
	public int insertExchange(Exchange exchange) {
		return mapper.insertSelective(exchange);
	}

	// ExchangeÉ¾³ý
	public int deleteExchange(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
