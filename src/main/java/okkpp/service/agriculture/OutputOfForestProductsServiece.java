package okkpp.service.agriculture;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.agriculture.OutputOfForestProductsMapper;
import okkpp.model.agriculture.OutputOfForestProducts;
import okkpp.utils.CountryCode;

/**
* @author duck
* @date 创建时间：2018年3月5日 下午3:44:56
*/
@Service
@Transactional
public class OutputOfForestProductsServiece {

	@Autowired
	OutputOfForestProductsMapper mapper;
	public List<OutputOfForestProducts> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
}
