package okkpp.service.payment;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.payment.PaymentMapper;
import okkpp.model.payment.Payment;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class PaymentService {

	@Autowired
	PaymentMapper mapper;
	
	public List<Payment> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(Payment.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<Payment> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(Payment.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<Payment> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// Payment¸üÐÂ
	public int updatePayment(Payment payment) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(payment);
	}

	// Payment²åÈë
	public int insertPayment(Payment payment) {
		return mapper.insertSelective(payment);
	}

	// PaymentÉ¾³ý
	public int deletePayment(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
	
}
