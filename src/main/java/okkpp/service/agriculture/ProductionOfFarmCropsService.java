package okkpp.service.agriculture;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import okkpp.dao.agriculture.ProductionOfFarmCropsMapper;
import okkpp.model.agriculture.ProductionOfFarmCrops;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date ����ʱ�䣺2018��3��5�� ����3:47:49
*/
@Service
@Transactional
public class ProductionOfFarmCropsService {

	@Autowired
	ProductionOfFarmCropsMapper mapper;
	public List<ProductionOfFarmCrops> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<ProductionOfFarmCrops> selectByExample(String column,String condition){
		Example example = new Example(ProductionOfFarmCrops.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
