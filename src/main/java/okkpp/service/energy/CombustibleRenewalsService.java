package okkpp.service.energy;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import okkpp.dao.energy.CombustibleRenewalsMapper;
import okkpp.model.energy.CombustibleRenewals;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date ����ʱ�䣺2018��3��7�� ����10:35:15
*/
@Service
@Transactional
public class CombustibleRenewalsService {

	@Autowired
	CombustibleRenewalsMapper mapper;
	public List<CombustibleRenewals> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<CombustibleRenewals> selectByExample(String column,String condition){
		Example example = new Example(CombustibleRenewals.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
