package okkpp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.HGJJMapper;
import okkpp.model.HGJJ;

/**
 * @author DUCK  E-mail: okkpp@qq.com
 * @date 创建时间：2018年1月17日 下午2:56:04 
 * @version 1.0 
 */
@Service
@Transactional
public class HGJJService {

	@Autowired
	HGJJMapper mapper;
	
	public List<HGJJ> getHGJJ(String GJDM){
		return mapper.getHGJJ(GJDM);
	}
}
