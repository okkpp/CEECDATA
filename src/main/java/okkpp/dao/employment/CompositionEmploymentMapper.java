package okkpp.dao.employment;

import java.util.List;
import okkpp.model.employment.CompositionEmployment;
import okkpp.model.employment.CompositionEmploymentExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface CompositionEmploymentMapper extends Mapper<CompositionEmployment> {
    int countByExample(CompositionEmploymentExample example);

    int deleteByExample(CompositionEmploymentExample example);

    List<CompositionEmployment> selectByExample(CompositionEmploymentExample example);

    int updateByExampleSelective(@Param("record") CompositionEmployment record, @Param("example") CompositionEmploymentExample example);

    int updateByExample(@Param("record") CompositionEmployment record, @Param("example") CompositionEmploymentExample example);
}