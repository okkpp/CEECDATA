package okkpp.dao.economics;

import java.util.List;
import okkpp.model.economics.GrowthOfGDPPC;
import okkpp.model.economics.GrowthOfGDPPCExample;
import org.apache.ibatis.annotations.Param;

public interface GrowthOfGDPPCMapper {
    int deleteByExample(GrowthOfGDPPCExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GrowthOfGDPPC record);

    int insertSelective(GrowthOfGDPPC record);

    List<GrowthOfGDPPC> selectByExample(GrowthOfGDPPCExample example);

    GrowthOfGDPPC selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GrowthOfGDPPC record, @Param("example") GrowthOfGDPPCExample example);

    int updateByExample(@Param("record") GrowthOfGDPPC record, @Param("example") GrowthOfGDPPCExample example);

    int updateByPrimaryKeySelective(GrowthOfGDPPC record);

    int updateByPrimaryKey(GrowthOfGDPPC record);
}