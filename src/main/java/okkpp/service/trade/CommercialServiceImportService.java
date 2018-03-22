package okkpp.service.trade;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.trade.CommercialServiceImportMapper;
import okkpp.model.trade.CommercialServiceImport;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class CommercialServiceImportService {

	@Autowired
	CommercialServiceImportMapper mapper;
	
	public List<CommercialServiceImport> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn){		
		Example example = new Example(CommercialServiceImport.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<CommercialServiceImport> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn,String column,String condition){
		Example example = new Example(CommercialServiceImport.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		PageHelper.startPage(pn, 10);
		List<CommercialServiceImport> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list,10);
	}

	//CommercialServiceImport¸üÐÂ
	public int updateCommercialServiceImport(CommercialServiceImport commercialServiceImport) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(commercialServiceImport);
	}
	
	//CommercialServiceImport²åÈë
	public int insertCommercialServiceImport(CommercialServiceImport commercialServiceImport) {
		return mapper.insertSelective(commercialServiceImport);
	}
	
	//CommercialServiceImportÉ¾³ý
	public int deleteCommercialServiceImport(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
	
}
