package okkpp.dao.employment;

import java.util.List;
import okkpp.model.employment.EmploymentGDP;
import okkpp.model.employment.EmploymentGDPExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface EmploymentGDPMapper extends Mapper<EmploymentGDP> {
    int countByExample(EmploymentGDPExample example);

    int deleteByExample(EmploymentGDPExample example);

    List<EmploymentGDP> selectByExample(EmploymentGDPExample example);

    int updateByExampleSelective(@Param("record") EmploymentGDP record, @Param("example") EmploymentGDPExample example);

    int updateByExample(@Param("record") EmploymentGDP record, @Param("example") EmploymentGDPExample example);
}