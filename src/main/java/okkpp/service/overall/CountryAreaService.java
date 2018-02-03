package okkpp.service.overall;

import java.util.List;

import okkpp.dao.overall.CountryAreaMapper;
import okkpp.model.overall.CountryArea;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author DUCK  E-mail: okkpp@qq.com
 * @date 创建时间：2018年2月2日 下午1:30:02 
 * @version 1.0 
 */
@Service
@Transactional
public class CountryAreaService {

	@Autowired
	CountryAreaMapper mapper;
	
	public List<CountryArea> getAll(){
		return mapper.selectAll();
	}
}
