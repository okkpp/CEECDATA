package okkpp.service;

import java.util.List;

import okkpp.dao.GTMJMapper;
import okkpp.dao.SHHJMapper;
import okkpp.model.GTMJ;
import okkpp.model.SHHJ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author DUCK  E-mail: okkpp@qq.com
 * @date 创建时间：2018年1月18日 下午4:03:48 
 * @version 1.0 
 */
@Service
@Transactional
public class SHHJService {

	@Autowired
	private SHHJMapper Smapper;
	@Autowired
	private GTMJMapper Gmapper;
	
	public List<SHHJ> getSHHJ(String GJDM){
		return Smapper.getSHHJ(GJDM);
	}
	
	public List<GTMJ> getGTMJ(String GJDM){
		return Gmapper.getGTMJ(GJDM);
	}
}
