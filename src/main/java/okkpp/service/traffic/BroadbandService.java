package okkpp.service.traffic;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.traffic.BroadbandMapper;
import okkpp.model.traffic.Broadband;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class BroadbandService {

	@Autowired
	BroadbandMapper mapper;

	public List<Broadband> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn){		
		Example example = new Example(Broadband.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<Broadband> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn,String column,String condition){
		Example example = new Example(Broadband.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		PageHelper.startPage(pn, 10);
		List<Broadband> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list,10);
	}

	//Broadband¸üÐÂ
	public int updateBroadband(Broadband broadband) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(broadband);
	}
	
	//Broadband²åÈë
	public int insertAirFreight(Broadband broadband) {
		return mapper.insertSelective(broadband);
	}
	
	//BroadbandÉ¾³ý
	public int deleteAirFreight(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
