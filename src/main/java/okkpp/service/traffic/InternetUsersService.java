package okkpp.service.traffic;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.traffic.InternetUsersMapper;
import okkpp.model.traffic.InternetUsers;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class InternetUsersService {

	@Autowired
	InternetUsersMapper mapper;
	
	public List<InternetUsers> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn){		
		Example example = new Example(InternetUsers.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<InternetUsers> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn,String column,String condition){
		Example example = new Example(InternetUsers.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		PageHelper.startPage(pn, 10);
		List<InternetUsers> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list,10);
	}

	//InternetUsers¸üÐÂ
	public int updateInternetUsers(InternetUsers internetUsers) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(internetUsers);
	}
	
	//InternetUsers²åÈë
	public int insertInternetUsers(InternetUsers internetUsers) {
		return mapper.insertSelective(internetUsers);
	}
	
	//InternetUsersÉ¾³ý
	public int deleteInternetUsers(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
