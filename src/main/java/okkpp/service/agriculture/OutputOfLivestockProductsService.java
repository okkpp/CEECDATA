package okkpp.service.agriculture;
/**
* @author duck
* @date ����ʱ�䣺2018��3��5�� ����3:46:15
*/

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.agriculture.OutputOfLivestockProductsMapper;
import okkpp.model.agriculture.OutputOfLivestockProducts;
import okkpp.utils.CountryCode;

@Service
@Transactional
public class OutputOfLivestockProductsService {

	@Autowired
	OutputOfLivestockProductsMapper mapper;
	public List<OutputOfLivestockProducts> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
}
