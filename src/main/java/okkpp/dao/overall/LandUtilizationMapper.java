package okkpp.dao.overall;

import java.util.List;
import okkpp.model.overall.LandUtilization;
import okkpp.model.overall.LandUtilizationExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface LandUtilizationMapper extends Mapper<LandUtilization> {
    int deleteByExample(LandUtilizationExample example);

    List<LandUtilization> selectByExample(LandUtilizationExample example);

    int updateByExampleSelective(@Param("record") LandUtilization record, @Param("example") LandUtilizationExample example);

    int updateByExample(@Param("record") LandUtilization record, @Param("example") LandUtilizationExample example);
}