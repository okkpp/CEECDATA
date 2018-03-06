package okkpp.service.investment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import okkpp.dao.investment.RankOfBusinessMapper;
import okkpp.model.investment.RankOfBusiness;

@Service
@Transactional
public class RankOfBusinessService {

	@Autowired
	RankOfBusinessMapper mapper;
	
	public List<RankOfBusiness> selectAll(){
		return mapper.selectAll();
	}
	
	public List<RankOfBusiness> selectByExample(String country){
		return null;
	}
}
