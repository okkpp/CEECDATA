package okkpp.dao.employment;

import java.util.List;
import okkpp.model.employment.Educational;
import okkpp.model.employment.EducationalExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface EducationalMapper extends Mapper<Educational> {
    int countByExample(EducationalExample example);

    int deleteByExample(EducationalExample example);

    List<Educational> selectByExample(EducationalExample example);

    int updateByExampleSelective(@Param("record") Educational record, @Param("example") EducationalExample example);

    int updateByExample(@Param("record") Educational record, @Param("example") EducationalExample example);
}