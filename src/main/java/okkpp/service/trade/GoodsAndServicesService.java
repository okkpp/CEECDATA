package okkpp.service.trade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.trade.GoodsAndServicesMapper;
import okkpp.model.trade.GoodsAndServices;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class GoodsAndServicesService {

	@Autowired
	GoodsAndServicesMapper mapper;
	
	public List<GoodsAndServices> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<GoodsAndServices> selectByExample(String column,String condition){
		Example example = new Example(GoodsAndServices.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
	
}
