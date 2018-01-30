package okkpp.service;

import java.util.List;

import okkpp.dao.JJZYDZSMapper;
import okkpp.dao.YSHJMapper;
import okkpp.model.JJZYDZS;
import okkpp.model.YSHJ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author DUCK  E-mail: okkpp@qq.com
 * @date 创建时间：2018年1月22日 下午1:55:02 
 * @version 1.0 
 */
@Service
@Transactional
public class TZYSService {

	@Autowired
	private JJZYDZSMapper Jmapper;
	@Autowired
	private YSHJMapper Ymapper;
	
	public List<JJZYDZS> getJJZYDZS(String GJDM){
		return Jmapper.getJJZYDZS(GJDM);
	}
	public List<YSHJ> getYSHJ(String GJDM){
		return Ymapper.getYSHJ(GJDM);
	}
}
