package okkpp.service.trade;

import org.springframework.transaction.annotation.Transactional;

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
	
	public List<CommercialServiceExport> selectByExample(String column,String condition){
		Example example = new Example(CommercialServiceExport.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
