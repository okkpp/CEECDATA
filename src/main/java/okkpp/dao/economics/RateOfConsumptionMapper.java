package okkpp.dao.economics;

import okkpp.model.economics.RateOfConsumption;
import okkpp.model.economics.RateOfConsumptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RateOfConsumptionMapper {
    int countByExample(RateOfConsumptionExample example);

    int deleteByExample(RateOfConsumptionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RateOfConsumption record);

    int insertSelective(RateOfConsumption record);

    List<RateOfConsumption> selectByExample(RateOfConsumptionExample example);

    RateOfConsumption selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RateOfConsumption record, @Param("example") RateOfConsumptionExample example);

    int updateByExample(@Param("record") RateOfConsumption record, @Param("example") RateOfConsumptionExample example);

    int updateByPrimaryKeySelective(RateOfConsumption record);

    int updateByPrimaryKey(RateOfConsumption record);
}