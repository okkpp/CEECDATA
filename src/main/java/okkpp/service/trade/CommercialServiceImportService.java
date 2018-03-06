package okkpp.service.trade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.trade.CommercialServiceImportMapper;
import okkpp.model.trade.CommercialServiceImport;

@Service
@Transactional
public class CommercialServiceImportService {

	@Autowired
	CommercialServiceImportMapper mapper;
	
	public List<CommercialServiceImport> selectAll(){
		return mapper.selectAll();
	}
	
	public List<CommercialServiceImport> selectByExample(String country){
		return null;
	}
	
}
