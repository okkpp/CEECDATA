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
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class ProducerService {
	
	@Autowired
	ProducerMapper mapper;
	
	public List<Producer> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn){		
		PageHelper.startPage(pn, 10);
		List<Producer> list = mapper.selectAll();
		return new PageInfo(list, 10);
	}
	public List<Producer> selectByExample(String column,String condition){
		Example example = new Example(Producer.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}

}