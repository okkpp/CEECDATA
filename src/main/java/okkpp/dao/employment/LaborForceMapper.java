package okkpp.dao.employment;

import java.util.List;
import okkpp.model.employment.LaborForce;
import okkpp.model.employment.LaborForceExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface LaborForceMapper extends Mapper<LaborForce> {
    int countByExample(LaborForceExample example);

    int deleteByExample(LaborForceExample example);

    List<LaborForce> selectByExample(LaborForceExample example);

    int updateByExampleSelective(@Param("record") LaborForce record, @Param("example") LaborForceExample example);

    int updateByExample(@Param("record") LaborForce record, @Param("example") LaborForceExample example);
}