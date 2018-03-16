package okkpp.service.trade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.trade.MerchandiseImportsMapper;
import okkpp.model.trade.MerchandiseImports;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class MerchandiseImportsService {

	@Autowired
	MerchandiseImportsMapper mapper;
	
	public List<MerchandiseImports> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<MerchandiseImports> selectByExample(String column,String condition){
		Example example = new Example(MerchandiseImports.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
