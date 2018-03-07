package okkpp.service.fiinance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.finance.SocialContributionsMapper;
import okkpp.model.finance.SocialContributions;
import okkpp.utils.CountryCode;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午10:55:55
*/
@Service
@Transactional
public class SocialContributionsService {

	@Autowired
	SocialContributionsMapper mapper;
	public List<SocialContributions> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
}
