package okkpp.service.trade;

import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.trade.CommercialServiceExportMapper;
import okkpp.model.trade.CommercialServiceExport;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CommercialServiceExportService {

	@Autowired
	CommercialServiceExportMapper mapper;
	
	public List<CommercialServiceExport> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn){		
		Example example = new Example(CommercialServiceExport.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<CommercialServiceExport> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn,String column,String condition){
		Example example = new Example(CommercialServiceExport.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		PageHelper.startPage(pn, 10);
		List<CommercialServiceExport> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list,10);
	}

	//CommercialServiceExport¸üÐÂ
	public int updateCommercialServiceExport(CommercialServiceExport commercialServiceExport) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(commercialServiceExport);
	}
	
	//CommercialServiceExport²åÈë
	public int insertCommercialServiceExport(CommercialServiceExport commercialServiceExport) {
		return mapper.insertSelective(commercialServiceExport);
	}
	
	//CommercialServiceExportÉ¾³ý
	public int deleteCommercialServiceExport(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
