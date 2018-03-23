package okkpp.service.culture;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.culture.ResearchersAndTechniciansMapper;
import okkpp.model.culture.ResearchersAndTechnicians;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date ����ʱ�䣺2018��3��6�� ����8:54:42
*/
@Service
@Transactional
public class ResearchersAndTechniciansService {

	@Autowired
	ResearchersAndTechniciansMapper mapper;
	public List<ResearchersAndTechnicians> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(ResearchersAndTechnicians.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<ResearchersAndTechnicians> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(ResearchersAndTechnicians.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<ResearchersAndTechnicians> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// ResearchersAndTechnicians����
	public int updateResearchersAndTechnicians(ResearchersAndTechnicians researchersAndTechnicians) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(researchersAndTechnicians);
	}

	// ResearchersAndTechnicians����
	public int insertResearchersAndTechnicians(ResearchersAndTechnicians researchersAndTechnicians) {
		return mapper.insertSelective(researchersAndTechnicians);
	}

	// ResearchersAndTechniciansɾ��
	public int deleteResearchersAndTechnicians(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
