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
		PageHelper.startPage(pn, 10);
		List<ImportsByCommodityGroups> list = mapper.selectAll();
		return new PageInfo(list, 10);
	}
	
	public List<ImportsByCommodityGroups> selectByExample(String column,String condition){
		Example example = new Example(ImportsByCommodityGroups.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
