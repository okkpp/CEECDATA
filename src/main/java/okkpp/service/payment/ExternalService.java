package okkpp.service.payment;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.payment.ExternalMapper;
import okkpp.model.payment.External;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class ExternalService {

	@Autowired
	ExternalMapper mapper;
	
	public List<External> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(External.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<External> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(External.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<External> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// External¸üÐÂ
	public int updateExternal(External external) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(external);
	}

	// External²åÈë
	public int insertExternal(External external) {
		return mapper.insertSelective(external);
	}

	// ExternalÉ¾³ý
	public int deleteExternal(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
