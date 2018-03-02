package okkpp.dao.employment;

import java.util.List;
import okkpp.model.employment.Employment;
import okkpp.model.employment.EmploymentExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface EmploymentMapper extends Mapper<Employment> {
    int countByExample(EmploymentExample example);

    int deleteByExample(EmploymentExample example);

    List<Employment> selectByExample(EmploymentExample example);

    int updateByExampleSelective(@Param("record") Employment record, @Param("example") EmploymentExample example);

    int updateByExample(@Param("record") Employment record, @Param("example") EmploymentExample example);
}