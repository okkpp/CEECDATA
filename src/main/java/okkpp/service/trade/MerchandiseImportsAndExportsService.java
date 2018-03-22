package okkpp.service.trade;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.trade.MerchandiseImportsAndExportsMapper;
import okkpp.model.trade.MerchandiseImportsAndExports;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class MerchandiseImportsAndExportsService {
  
	@Autowired
	MerchandiseImportsAndExportsMapper mapper;
	
	public List<MerchandiseImportsAndExports> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(MerchandiseImportsAndExports.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<MerchandiseImportsAndExports> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(MerchandiseImportsAndExports.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<MerchandiseImportsAndExports> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// MerchandiseImportsAndExports¸üÐÂ
	public int updateMerchandiseImportsAndExports(MerchandiseImportsAndExports merchandiseImportsAndExports) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(merchandiseImportsAndExports);
	}

	// MerchandiseImportsAndExports²åÈë
	public int insertMerchandiseImportsAndExports(MerchandiseImportsAndExports merchandiseImportsAndExports) {
		return mapper.insertSelective(merchandiseImportsAndExports);
	}

	// MerchandiseImportsAndExportsÉ¾³ý
	public int deleteMerchandiseImportsAndExports(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
	 
}
