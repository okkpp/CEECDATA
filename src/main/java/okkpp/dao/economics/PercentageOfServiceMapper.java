package okkpp.dao.economics;

import okkpp.model.economics.PercentageOfService;
import okkpp.model.economics.PercentageOfServiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PercentageOfServiceMapper {
    int countByExample(PercentageOfServiceExample example);

    int deleteByExample(PercentageOfServiceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PercentageOfService record);

    int insertSelective(PercentageOfService record);

    List<PercentageOfService> selectByExample(PercentageOfServiceExample example);

    PercentageOfService selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PercentageOfService record, @Param("example") PercentageOfServiceExample example);

    int updateByExample(@Param("record") PercentageOfService record, @Param("example") PercentageOfServiceExample example);

    int updateByPrimaryKeySelective(PercentageOfService record);

    int updateByPrimaryKey(PercentageOfService record);
}