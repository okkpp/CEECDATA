package okkpp.service.traffic;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.traffic.InternetServersMapper;
import okkpp.model.traffic.InternetServers;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class InternetServersService {

	@Autowired
	InternetServersMapper mapper;
	
	public List<InternetServers> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn){		
		Example example = new Example(InternetServers.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<InternetServers> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn,String column,String condition){
		Example example = new Example(InternetServers.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		PageHelper.startPage(pn, 10);
		List<InternetServers> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list,10);
	}

	//InternetServers¸üÐÂ
	public int updateInternetServers(InternetServers internetServers) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(internetServers);
	}
	
	//InternetServers²åÈë
	public int insertInternetServers(InternetServers internetServers) {
		return mapper.insertSelective(internetServers);
	}
	
	//InternetServersÉ¾³ý
	public int deleteInternetServers(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
