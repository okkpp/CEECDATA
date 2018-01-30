package okkpp.service;

import java.util.List;

import okkpp.dao.IMANDEXMapper;
import okkpp.dao.MYQKMapper;
import okkpp.dao.WLJXZSMapper;
import okkpp.model.IMANDEX;
import okkpp.model.MYQK;
import okkpp.model.WLJXZS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author DUCK  E-mail: okkpp@qq.com
 * @date 创建时间：2018年1月22日 下午2:54:17 
 * @version 1.0 
 */
@Service
@Transactional
public class MYHZService {

	@Autowired
	private IMANDEXMapper Imapper;
	public List<IMANDEX> getIMANDEX(String GJDM){
		return Imapper.getIMANDEX(GJDM);
	}
	
	@Autowired
	private MYQKMapper Mmapper;
	public List<MYQK> getMYQK(String GJDM){
		return Mmapper.getMYQK(GJDM);
	}
	
	@Autowired
	private WLJXZSMapper Wmapper;
	public List<WLJXZS> getWLJXZS(String GJDM,String NF){
		return Wmapper.getWLJXZS(GJDM, NF);
	}
}
