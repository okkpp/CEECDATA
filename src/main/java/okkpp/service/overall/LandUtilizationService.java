package okkpp.service.overall;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.overall.LandUtilizationMapper;
import okkpp.model.overall.LandUtilization;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date ����ʱ�䣺2018��3��5�� ����3:38:11
*/
@Service
@Transactional
public class LandUtilizationService {

	@Autowired
	LandUtilizationMapper mapper;
	public List<LandUtilization> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<LandUtilization> selectByExample(String column,String condition){
		Example example = new Example(LandUtilization.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
