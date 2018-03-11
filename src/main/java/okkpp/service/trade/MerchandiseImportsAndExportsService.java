package okkpp.service.trade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.trade.MerchandiseImportsAndExportsMapper;
import okkpp.model.trade.MerchandiseImportsAndExports;
import okkpp.utils.CountryCode;

@Service
@Transactional
public class MerchandiseImportsAndExportsService {
  
	@Autowired
	MerchandiseImportsAndExportsMapper mapper;
	
	public List<MerchandiseImportsAndExports> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}

	public List<MerchandiseImportsAndExports> selectByExample(String country){
		return null;
	}
	 
}
