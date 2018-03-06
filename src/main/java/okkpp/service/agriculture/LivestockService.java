package okkpp.service.agriculture;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.agriculture.LivestockMapper;
import okkpp.model.agriculture.Livestock;

/**
* @author duck
* @date 创建时间：2018年3月5日 下午3:43:09
*/
@Service
@Transactional
public class LivestockService {

	@Autowired
	LivestockMapper mapper;
	public List<Livestock> selectAll(){
		return mapper.selectAll();
	}
}
