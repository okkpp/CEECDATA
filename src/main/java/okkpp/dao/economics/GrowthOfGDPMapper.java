package okkpp.dao.economics;

import java.util.List;
import okkpp.model.economics.GrowthOfGDP;
import okkpp.model.economics.GrowthOfGDPExample;
import org.apache.ibatis.annotations.Param;

public interface GrowthOfGDPMapper {
    int deleteByExample(GrowthOfGDPExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GrowthOfGDP record);

    int insertSelective(GrowthOfGDP record);

    List<GrowthOfGDP> selectByExample(GrowthOfGDPExample example);

    GrowthOfGDP selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GrowthOfGDP record, @Param("example") GrowthOfGDPExample example);

    int updateByExample(@Param("record") GrowthOfGDP record, @Param("example") GrowthOfGDPExample example);

    int updateByPrimaryKeySelective(GrowthOfGDP record);

    int updateByPrimaryKey(GrowthOfGDP record);
}