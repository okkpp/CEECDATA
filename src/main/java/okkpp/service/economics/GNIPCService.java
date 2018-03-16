package okkpp.service.economics;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import okkpp.dao.economics.GNIPCMapper;
import okkpp.model.economics.GNIPC;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:09:31
*/
@Service
@Transactional
public class GNIPCService {

	@Autowired
	GNIPCMapper mapper;
	public List<GNIPC> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<GNIPC> selectByExample(String column,String condition){
		Example example = new Example(GNIPC.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
