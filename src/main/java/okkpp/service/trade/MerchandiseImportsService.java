package okkpp.service.trade;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.trade.MerchandiseImportsMapper;
import okkpp.model.trade.MerchandiseImports;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class MerchandiseImportsService {

	@Autowired
	MerchandiseImportsMapper mapper;
	
	public List<MerchandiseImports> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(MerchandiseImports.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<MerchandiseImports> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(MerchandiseImports.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<MerchandiseImports> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// MerchandiseImports¸üÐÂ
	public int updateMerchandiseImports(MerchandiseImports merchandiseImports) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(merchandiseImports);
	}

	// MerchandiseImports²åÈë
	public int insertMerchandiseImports(MerchandiseImports merchandiseImports) {
		return mapper.insertSelective(merchandiseImports);
	}

	// MerchandiseImportsÉ¾³ý
	public int deleteMerchandiseImports(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
