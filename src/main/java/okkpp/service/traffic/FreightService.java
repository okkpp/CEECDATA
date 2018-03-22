package okkpp.service.traffic;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.traffic.FreightMapper;
import okkpp.model.traffic.Freight;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class FreightService {

	@Autowired
	FreightMapper mapper;
	
	public List<Freight> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn){		
		Example example = new Example(Freight.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<Freight> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn,String column,String condition){
		Example example = new Example(Freight.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		PageHelper.startPage(pn, 10);
		List<Freight> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list,10);
	}

	//Freight¸üÐÂ
	public int updateFreight(Freight freight) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(freight);
	}
	
	//Freight²åÈë
	public int insertFreight(Freight freight) {
		return mapper.insertSelective(freight);
	}
	
	//FreightÉ¾³ý
	public int deleteFreight(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
