package okkpp.service.economics;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import okkpp.dao.economics.GDPPCMapper;
import okkpp.model.economics.GDPPC;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:08:23
*/
@Service
@Transactional
public class GDPPCService {

	@Autowired
	GDPPCMapper mapper;
	public List<GDPPC> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<GDPPC> selectByExample(String column,String condition){
		Example example = new Example(GDPPC.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
