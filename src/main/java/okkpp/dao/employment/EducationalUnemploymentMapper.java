package okkpp.dao.employment;

import java.util.List;
import okkpp.model.employment.EducationalUnemployment;
import okkpp.model.employment.EducationalUnemploymentExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface EducationalUnemploymentMapper extends Mapper<EducationalUnemployment> {
    int countByExample(EducationalUnemploymentExample example);

    int deleteByExample(EducationalUnemploymentExample example);

    List<EducationalUnemployment> selectByExample(EducationalUnemploymentExample example);

    int updateByExampleSelective(@Param("record") EducationalUnemployment record, @Param("example") EducationalUnemploymentExample example);

    int updateByExample(@Param("record") EducationalUnemployment record, @Param("example") EducationalUnemploymentExample example);
}