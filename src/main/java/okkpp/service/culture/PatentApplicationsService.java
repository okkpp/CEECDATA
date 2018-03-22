package okkpp.service.culture;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.culture.PatentApplicationsMapper;
import okkpp.model.culture.PatentApplications;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月6日 上午8:53:22
*/
@Service
@Transactional
public class PatentApplicationsService {

	@Autowired
	PatentApplicationsMapper mapper;
	public List<PatentApplications> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(PatentApplications.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<PatentApplications> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(PatentApplications.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<PatentApplications> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// PatentApplications更新
	public int updatePatentApplications(PatentApplications patentApplications) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(patentApplications);
	}

	// PatentApplications插入
	public int insertPatentApplications(PatentApplications patentApplications) {
		return mapper.insertSelective(patentApplications);
	}

	// PatentApplications删除
	public int deletePatentApplications(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
