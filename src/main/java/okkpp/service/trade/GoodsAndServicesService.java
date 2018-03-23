package okkpp.service.trade;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.trade.GoodsAndServicesMapper;
import okkpp.model.trade.GoodsAndServices;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class GoodsAndServicesService {

	@Autowired
	GoodsAndServicesMapper mapper;
	
	public List<GoodsAndServices> selectAll(){
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn){		
		Example example = new Example(GoodsAndServices.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<GoodsAndServices> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn,String column,String condition){
		Example example = new Example(GoodsAndServices.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%"+condition+"%");
		PageHelper.startPage(pn, 10);
		List<GoodsAndServices> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list,10);
	}

	//GoodsAndServices¸üÐÂ
	public int updateGoodsAndServices(GoodsAndServices goodsAndServices) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(goodsAndServices);
	}
	
	//GoodsAndServices²åÈë
	public int insertGoodsAndServices(GoodsAndServices goodsAndServices) {
		return mapper.insertSelective(goodsAndServices);
	}
	
	//GoodsAndServicesÉ¾³ý
	public int deleteGoodsAndServices(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
	
}
