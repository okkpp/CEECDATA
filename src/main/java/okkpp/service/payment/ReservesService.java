package okkpp.service.payment;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.payment.ReservesMapper;
import okkpp.model.payment.Reserves;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class ReservesService {

	@Autowired
	ReservesMapper mapper;
	
	public List<Reserves> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn){		
		PageHelper.startPage(pn, 10);
		List<Reserves> list = mapper.selectAll();
		return new PageInfo(list, 10);
	}
	
	public List<Reserves> selectByExample(String column,String condition){
		Example example = new Example(Reserves.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
}
