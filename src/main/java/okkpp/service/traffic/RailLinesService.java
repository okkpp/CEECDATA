package okkpp.service.traffic;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.traffic.RailLinesMapper;
import okkpp.model.traffic.RailLines;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class RailLinesService {

	@Autowired
	RailLinesMapper mapper;
	
	public List<RailLines> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn){		
		Example example = new Example(RailLines.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<RailLines> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn,String column,String condition){
		Example example = new Example(RailLines.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		PageHelper.startPage(pn, 10);
		List<RailLines> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list,10);
	}

	//RailLines¸üÐÂ
	public int updateRailLines(RailLines railLines) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(railLines);
	}
	
	//RailLines²åÈë
	public int insertRailLines(RailLines railLines) {
		return mapper.insertSelective(railLines);
	}
	
	//RailLinesÉ¾³ý
	public int deleteRailLines(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
		
}
