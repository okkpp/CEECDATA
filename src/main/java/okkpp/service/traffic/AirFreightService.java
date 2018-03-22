package okkpp.service.traffic;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.traffic.AirFreightMapper;
import okkpp.model.traffic.AirFreight;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class AirFreightService {

	@Autowired
	AirFreightMapper mapper;
	
	public List<AirFreight> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn){		
		Example example = new Example(AirFreight.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<AirFreight> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn,String column,String condition){
		Example example = new Example(AirFreight.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		PageHelper.startPage(pn, 10);
		List<AirFreight> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list,10);
	}

	//AirFreight¸üÐÂ
	public int updateAirFreight(AirFreight airFreight) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(airFreight);
	}
	
	//AirFreight²åÈë
	public int insertAirFreight(AirFreight airFreight) {
		return mapper.insertSelective(airFreight);
	}
	
	//AirFreightÉ¾³ý
	public int deleteAirFreight(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
