package okkpp.service.traffic;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.traffic.ContainerMapper;
import okkpp.model.traffic.Container;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class ContainerService {

	@Autowired
	ContainerMapper mapper;
	
	public List<Container> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn){		
		Example example = new Example(Container.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<Container> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn,String column,String condition){
		Example example = new Example(Container.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		PageHelper.startPage(pn, 10);
		List<Container> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list,10);
	}

	//Container¸üÐÂ
	public int updateContainer(Container container) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(container);
	}
	
	//Container²åÈë
	public int insertContainer(Container container) {
		return mapper.insertSelective(container);
	}
	
	//ContainerÉ¾³ý
	public int deleteContainer(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
		
}
