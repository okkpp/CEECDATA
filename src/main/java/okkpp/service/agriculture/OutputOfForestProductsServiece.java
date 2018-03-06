package okkpp.service.agriculture;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.agriculture.OutputOfForestProductsMapper;
import okkpp.model.agriculture.OutputOfForestProducts;

/**
* @author duck
* @date ����ʱ�䣺2018��3��5�� ����3:44:56
*/
@Service
@Transactional
public class OutputOfForestProductsServiece {

	@Autowired
	OutputOfForestProductsMapper mapper;
	public List<OutputOfForestProducts> selectAll(){
		return mapper.selectAll();
	}
}
