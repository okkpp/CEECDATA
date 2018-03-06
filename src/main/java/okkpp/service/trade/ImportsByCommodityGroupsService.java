package okkpp.service.trade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.trade.ImportsByCommodityGroupsMapper;
import okkpp.model.trade.ImportsByCommodityGroups;

@Service
@Transactional
public class ImportsByCommodityGroupsService {

	@Autowired
	ImportsByCommodityGroupsMapper mapper;
	
	public List<ImportsByCommodityGroups> selectAll(){
		return mapper.selectAll();
	}
	
	public List<ImportsByCommodityGroups> selectByExample(String country){
		return null;
	}
}
