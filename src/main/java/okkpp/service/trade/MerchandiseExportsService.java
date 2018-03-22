package okkpp.service.trade;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.trade.MerchandiseExportsMapper;
import okkpp.model.trade.MerchandiseExports;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class MerchandiseExportsService {

	@Autowired
	MerchandiseExportsMapper mapper;

	public List<MerchandiseExports> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(MerchandiseExports.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<MerchandiseExports> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(MerchandiseExports.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<MerchandiseExports> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// MerchandiseExports¸üÐÂ
	public int updateMerchandiseExports(MerchandiseExports merchandiseExports) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(merchandiseExports);
	}

	// MerchandiseExports²åÈë
	public int insertImportsByCommodityGroups(MerchandiseExports merchandiseExports) {
		return mapper.insertSelective(merchandiseExports);
	}

	// MerchandiseExportsÉ¾³ý
	public int deleteMerchandiseExports(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}

}
