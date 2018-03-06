package okkpp.service.trade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.trade.MerchandiseImportsAndExportsMapper;
import okkpp.model.trade.MerchandiseImportsAndExports;

@Service
@Transactional
public class MerchandiseImportsAndExportsService {
  
	@Autowired
	MerchandiseImportsAndExportsMapper mapper;
	
	public List<MerchandiseImportsAndExports> selectAll(){
		return mapper.selectAll();
	}

	public List<MerchandiseImportsAndExports> selectByExample(String country){
		return null;
	}
	 
}
