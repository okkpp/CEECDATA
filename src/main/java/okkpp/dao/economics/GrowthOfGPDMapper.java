package okkpp.dao.economics;

import okkpp.model.economics.GrowthOfGPD;
import okkpp.model.economics.GrowthOfGPDExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GrowthOfGPDMapper {
    int deleteByExample(GrowthOfGPDExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GrowthOfGPD record);

    int insertSelective(GrowthOfGPD record);

    List<GrowthOfGPD> selectByExample(GrowthOfGPDExample example);

    GrowthOfGPD selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GrowthOfGPD record, @Param("example") GrowthOfGPDExample example);

    int updateByExample(@Param("record") GrowthOfGPD record, @Param("example") GrowthOfGPDExample example);

    int updateByPrimaryKeySelective(GrowthOfGPD record);

    int updateByPrimaryKey(GrowthOfGPD record);
}