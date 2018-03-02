package okkpp.dao.overall;

import java.util.List;
import okkpp.model.overall.FreshWater;
import okkpp.model.overall.FreshWaterExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface FreshWaterMapper extends Mapper<FreshWater> {
    int deleteByExample(FreshWaterExample example);

    List<FreshWater> selectByExample(FreshWaterExample example);

    int updateByExampleSelective(@Param("record") FreshWater record, @Param("example") FreshWaterExample example);

    int updateByExample(@Param("record") FreshWater record, @Param("example") FreshWaterExample example);
}