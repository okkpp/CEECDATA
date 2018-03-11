package okkpp.service.emoloyment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.employment.WagesMapper;
import okkpp.model.employment.Wages;
import okkpp.utils.CountryCode;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:35:03
*/
@Service
@Transactional
public class WagesService {

	@Autowired
	WagesMapper mapper;
	public List<Wages> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
}
