package okkpp.service.trade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.trade.MerchandiseImportsMapper;
import okkpp.model.trade.MerchandiseImports;

@Service
@Transactional
public class MerchandiseImportsService {

	@Autowired
	MerchandiseImportsMapper mapper;
	
	public List<MerchandiseImports> selectAll(){
		return mapper.selectAll();
	}
	
	public List<MerchandiseImports> selectByExample(String country){
		return null;
	}
}
