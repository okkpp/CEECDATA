package okkpp.service.trade;

import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.trade.CommercialServiceExportMapper;
import okkpp.model.trade.CommercialServiceExport;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CommercialServiceExportService {

	@Autowired
	CommercialServiceExportMapper mapper;
	
	public List<CommercialServiceExport> selectAll(){
		return mapper.selectAll();
	}
	
	public List<CommercialServiceExport> selectByExample(String country){
		return null;
	}
}
