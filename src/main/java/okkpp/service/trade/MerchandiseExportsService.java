package okkpp.service.trade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.trade.MerchandiseExportsMapper;
import okkpp.model.trade.MerchandiseExports;

@Service
@Transactional
public class MerchandiseExportsService {

	@Autowired
	MerchandiseExportsMapper mapper;
	
	public List<MerchandiseExports> selectAll(){
		return mapper.selectAll();
	}
	
	public List<MerchandiseExports> selectByExample(String country){
		return null;
	}
}
