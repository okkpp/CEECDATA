package okkpp.service.trade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.trade.ExportsByCommodityGroupsMapper;
import okkpp.model.trade.ExportsByCommodityGroups;
import okkpp.utils.CountryCode;

@Service
@Transactional
public class ExportsByCommodityGroupsService {

	@Autowired
	ExportsByCommodityGroupsMapper mapper;
	
	public List<ExportsByCommodityGroups> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<ExportsByCommodityGroups> selectByExample(String country){
		return null;
	}
}
