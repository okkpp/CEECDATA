package okkpp.service.overall;

import java.util.List;
import okkpp.dao.overall.CountryAreaMapper;
import okkpp.model.overall.CountryArea;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * @author DUCK  E-mail: okkpp@qq.com
 * @date ����ʱ�䣺2018��3��2�� ����10:05:25 
 * @version 1.0 
 */
@Service
@Transactional
public class CountryAreaService {

	@Autowired
	CountryAreaMapper mapper;
	public List<CountryArea> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn){		
		PageHelper.startPage(pn, 10);
		List<CountryArea> list = mapper.selectAll();
		return new PageInfo(list, 10);
	}
	
	public List<CountryArea> selectByExample(String column,String condition){
		Example example = new Example(CountryArea.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		return CountryCode.replaceCountry(mapper.selectByExample(example));
	}
	
}
