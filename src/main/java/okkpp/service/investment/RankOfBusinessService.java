package okkpp.service.investment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import okkpp.dao.investment.RankOfBusinessMapper;
import okkpp.model.investment.DensityOfBusiness;
import okkpp.model.investment.RankOfBusiness;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class RankOfBusinessService {

	@Autowired
	RankOfBusinessMapper mapper;
	
	public List<RankOfBusiness> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<RankOfBusiness> selectByExample(String column,String condition){
		Example example = new Example(RankOfBusiness.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
