package okkpp.service.industry;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.industry.IndicesOfMiningMapper;
import okkpp.model.industry.IndicesOfMining;
import okkpp.utils.CountryCode;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午11:03:12
*/
@Service
@Transactional
public class IndicesOfMiningService {

	@Autowired
	IndicesOfMiningMapper mapper;
	public List<IndicesOfMining> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
}
