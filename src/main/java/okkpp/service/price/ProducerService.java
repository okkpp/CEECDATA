package okkpp.service.price;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.price.ProducerMapper;
import okkpp.model.price.Producer;
import okkpp.utils.CountryCode;
import okkpp.utils.FormatUtil;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class ProducerService {

	@Autowired
	ProducerMapper mapper;

	public List<Producer> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(Producer.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<Producer> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(Producer.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<Producer> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// Producer¸üÐÂ
	public int updateConsumer(Producer producer) {
		if (FormatUtil.haveNull(producer)) {
			return 0;
		}
		return mapper.updateByPrimaryKeySelective(producer);
	}

	// Consumer²åÈë
	public int insertProducer(Producer producer) {
		if (FormatUtil.haveNull(producer)) {
			return 0;
		}
		return mapper.insertSelective(producer);
	}

	// ProducerÉ¾³ý
	public int deleteProducer(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}

}