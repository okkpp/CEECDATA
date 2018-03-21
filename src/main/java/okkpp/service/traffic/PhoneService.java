package okkpp.service.traffic;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.traffic.PhoneMapper;
import okkpp.model.traffic.Phone;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class PhoneService {

	@Autowired
	PhoneMapper mapper;
	
	public List<Phone> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn){		
		Example example = new Example(Phone.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<Phone> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn,String column,String condition){
		Example example = new Example(Phone.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		PageHelper.startPage(pn, 10);
		List<Phone> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list,10);
	}

	//Phone¸üÐÂ
	public int updatePhone(Phone phone) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(phone);
	}
	
	//Phone²åÈë
	public int insertPhone(Phone phone) {
		return mapper.insertSelective(phone);
	}
	
	//PhoneÉ¾³ý
	public int deletePhone(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
