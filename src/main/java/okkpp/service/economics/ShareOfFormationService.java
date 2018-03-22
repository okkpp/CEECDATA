package okkpp.service.economics;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.economics.ShareOfFormationMapper;
import okkpp.model.economics.ShareOfFormation;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date ����ʱ�䣺2018��3��6�� ����9:22:29
*/
@Service
@Transactional
public class ShareOfFormationService {

	@Autowired
	ShareOfFormationMapper mapper;
	public List<ShareOfFormation> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(ShareOfFormation.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<ShareOfFormation> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(ShareOfFormation.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<ShareOfFormation> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// ShareOfFormation����
	public int updateShareOfFormation(ShareOfFormation shareOfFormation) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(shareOfFormation);
	}

	// ShareOfFormation����
	public int insertShareOfFormation(ShareOfFormation shareOfFormation) {
		return mapper.insertSelective(shareOfFormation);
	}

	// ShareOfFormationɾ��
	public int deleteShareOfFormation(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
