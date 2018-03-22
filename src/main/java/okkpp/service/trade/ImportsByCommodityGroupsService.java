package okkpp.service.trade;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.trade.ImportsByCommodityGroupsMapper;
import okkpp.model.trade.ImportsByCommodityGroups;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class ImportsByCommodityGroupsService {

	@Autowired
	ImportsByCommodityGroupsMapper mapper;
	
	public List<ImportsByCommodityGroups> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn){		
		Example example = new Example(ImportsByCommodityGroups.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<ImportsByCommodityGroups> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn,String column,String condition){
		Example example = new Example(ImportsByCommodityGroups.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		PageHelper.startPage(pn, 10);
		List<ImportsByCommodityGroups> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list,10);
	}

	//ImportsByCommodityGroups¸üÐÂ
	public int updateImportsByCommodityGroups(ImportsByCommodityGroups importsByCommodityGroups) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(importsByCommodityGroups);
	}
	
	//ImportsByCommodityGroups²åÈë
	public int insertImportsByCommodityGroups(ImportsByCommodityGroups importsByCommodityGroups) {
		return mapper.insertSelective(importsByCommodityGroups);
	}
	
	//ImportsByCommodityGroupsÉ¾³ý
	public int deleteImportsByCommodityGroups(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
