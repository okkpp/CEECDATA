package okkpp.service.overall;

import java.util.List;

import okkpp.dao.overall.FreshWaterMapper;
import okkpp.model.overall.FreshWater;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author DUCK  E-mail: okkpp@qq.com
 * @date 创建时间：2018年3月2日 上午10:58:33 
 * @version 1.0 
 */
@Service
@Transactional
public class FreshWaterService {

	@Autowired
	FreshWaterMapper mapper;
	public List<FreshWater> selectByExample(String country){
		return null;
	}
	public List<FreshWater> selectAll(){
		return mapper.selectAll();
	}
}
