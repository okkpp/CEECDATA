package okkpp.service.agriculture;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.agriculture.ProductionOfFarmCropsMapper;
import okkpp.model.agriculture.ProductionOfFarmCrops;

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
		return mapper.selectAll();
	}
}
