package okkpp.service.culture;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.culture.ExpenditureStudentGDPRateMapper;
import okkpp.model.culture.ExpenditureStudentGDPRate;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月5日 下午3:57:41
*/
@Service
@Transactional
public class ExpenditureStudentGDPRateService {

	@Autowired
	ExpenditureStudentGDPRateMapper mapper;
	public List<ExpenditureStudentGDPRate> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(ExpenditureStudentGDPRate.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<ExpenditureStudentGDPRate> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(ExpenditureStudentGDPRate.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<ExpenditureStudentGDPRate> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// ExpenditureStudentGDPRate更新
	public int updateExpenditureStudentGDPRate(ExpenditureStudentGDPRate expenditureStudentGDPRate) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(expenditureStudentGDPRate);
	}

	// ExpenditureStudentGDPRate插入
	public int insertExpenditureStudentGDPRate(ExpenditureStudentGDPRate expenditureStudentGDPRate) {
		return mapper.insertSelective(expenditureStudentGDPRate);
	}

	// ExpenditureStudentGDPRate删除
	public int deleteExpenditureStudentGDPRate(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
