package okkpp.service.economics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.economics.IndicatorsOfNAMapper;
import okkpp.model.economics.IndicatorsOfNA;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午9:12:47
*/
@Service
@Transactional
public class IndicatorsOfNAService {

	@Autowired
	IndicatorsOfNAMapper mapper;
	public List<IndicatorsOfNA> selectAll() {
		return mapper.selectAll();
	}
}
