package okkpp.service.price;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.price.ConsumerMapper;
import okkpp.model.price.Consumer;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class ConsumerService {

	@Autowired
	ConsumerMapper mapper;
	
	public List<Consumer> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	public List<Consumer> selectByExample(String column,String condition){
		Example example = new Example(Consumer.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}

	//Consumer¸üÐÂ
	public int updateConsumer(Consumer consumer) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(consumer);
	}
}
