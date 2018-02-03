package okkpp.economics.overall;

import okkpp.model.economics.FinalConsumption;
import okkpp.model.economics.FinalConsumptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinalConsumptionMapper {
    int countByExample(FinalConsumptionExample example);

    int deleteByExample(FinalConsumptionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FinalConsumption record);

    int insertSelective(FinalConsumption record);

    List<FinalConsumption> selectByExample(FinalConsumptionExample example);

    FinalConsumption selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FinalConsumption record, @Param("example") FinalConsumptionExample example);

    int updateByExample(@Param("record") FinalConsumption record, @Param("example") FinalConsumptionExample example);

    int updateByPrimaryKeySelective(FinalConsumption record);

    int updateByPrimaryKey(FinalConsumption record);
}