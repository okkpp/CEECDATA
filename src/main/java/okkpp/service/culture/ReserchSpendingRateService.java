package okkpp.service.culture;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.culture.ReserchSpendingRateMapper;
import okkpp.model.culture.ReserchSpendingRate;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午8:58:14
*/
@Service
@Transactional
public class ReserchSpendingRateService {

	@Autowired
	ReserchSpendingRateMapper mapper;
	public List<ReserchSpendingRate> selectAll(){
		return mapper.selectAll();
	}
}
