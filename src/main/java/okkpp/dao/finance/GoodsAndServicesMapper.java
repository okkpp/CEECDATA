package okkpp.dao.finance;

import java.util.List;
import okkpp.model.finance.GoodsAndServices;
import okkpp.model.finance.GoodsAndServicesExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface GoodsAndServicesMapper extends Mapper<GoodsAndServices> {
    int deleteByExample(GoodsAndServicesExample example);

    List<GoodsAndServices> selectByExample(GoodsAndServicesExample example);

    int updateByExampleSelective(@Param("record") GoodsAndServices record, @Param("example") GoodsAndServicesExample example);

    int updateByExample(@Param("record") GoodsAndServices record, @Param("example") GoodsAndServicesExample example);
}