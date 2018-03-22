package okkpp.service.industry;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.industry.IndicesOfMiningMapper;
import okkpp.model.industry.IndicesOfMining;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date ����ʱ�䣺2018��3��7�� ����11:03:12
*/
@Service
@Transactional
public class IndicesOfMiningService {

	@Autowired
	IndicesOfMiningMapper mapper;
	public List<IndicesOfMining> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(IndicesOfMining.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<IndicesOfMining> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(IndicesOfMining.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<IndicesOfMining> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// IndicesOfMining����
	public int updateIndicesOfMining(IndicesOfMining indicesOfMining) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(indicesOfMining);
	}

	// IndicesOfMining����
	public int insertIndicesOfMining(IndicesOfMining indicesOfMining) {
		return mapper.insertSelective(indicesOfMining);
	}

	// IndicesOfMiningɾ��
	public int deleteIndicesOfMining(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
