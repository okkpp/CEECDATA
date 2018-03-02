package okkpp.dao.employment;

import java.util.List;
import okkpp.model.employment.LaborForceParticipationRate;
import okkpp.model.employment.LaborForceParticipationRateExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface LaborForceParticipationRateMapper extends Mapper<LaborForceParticipationRate> {
    int countByExample(LaborForceParticipationRateExample example);

    int deleteByExample(LaborForceParticipationRateExample example);

    List<LaborForceParticipationRate> selectByExample(LaborForceParticipationRateExample example);

    int updateByExampleSelective(@Param("record") LaborForceParticipationRate record, @Param("example") LaborForceParticipationRateExample example);

    int updateByExample(@Param("record") LaborForceParticipationRate record, @Param("example") LaborForceParticipationRateExample example);
}