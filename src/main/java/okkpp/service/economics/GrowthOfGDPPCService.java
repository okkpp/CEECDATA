package okkpp.service.economics;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import okkpp.dao.economics.GrowthOfGDPPCMapper;
import okkpp.model.economics.GrowthOfGDPPC;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:11:46
*/
@Service
@Transactional
public class GrowthOfGDPPCService {

	@Autowired
	GrowthOfGDPPCMapper mapper;
	public List<GrowthOfGDPPC> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<GrowthOfGDPPC> selectByExample(String column,String condition){
		Example example = new Example(GrowthOfGDPPC.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
