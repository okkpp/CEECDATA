package okkpp.service.industry;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.industry.IndicesOfMiningMapper;
import okkpp.model.industry.IndicesOfManufacturing;
import okkpp.model.industry.IndicesOfMining;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date ����ʱ�䣺2018��3��7�� ����11:03:12
*/
@Service
@Transactional
public class IndicesOfMiningService {

	@Autowired
	IndicesOfMiningMapper mapper;
	public List<IndicesOfMining> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<IndicesOfMining> selectByExample(String column,String condition){
		Example example = new Example(IndicesOfMining.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
