package okkpp.service.trade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.trade.MerchandiseImportsAndExportsMapper;
import okkpp.model.trade.MerchandiseImportsAndExports;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class MerchandiseImportsAndExportsService {
  
	@Autowired
	MerchandiseImportsAndExportsMapper mapper;
	
	public List<MerchandiseImportsAndExports> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}

	public List<MerchandiseImportsAndExports> selectByExample(String column,String condition){
		Example example = new Example(MerchandiseImportsAndExports.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
	 
}
