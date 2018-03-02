package okkpp.dao.industry;

import java.util.List;
import okkpp.model.industry.IndicesOfIndustrial;
import okkpp.model.industry.IndicesOfIndustrialExample;
import org.apache.ibatis.annotations.Param;

public interface IndicesOfIndustrialMapper {
    int deleteByExample(IndicesOfIndustrialExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IndicesOfIndustrial record);

    int insertSelective(IndicesOfIndustrial record);

    List<IndicesOfIndustrial> selectByExample(IndicesOfIndustrialExample example);

    IndicesOfIndustrial selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IndicesOfIndustrial record, @Param("example") IndicesOfIndustrialExample example);

    int updateByExample(@Param("record") IndicesOfIndustrial record, @Param("example") IndicesOfIndustrialExample example);

    int updateByPrimaryKeySelective(IndicesOfIndustrial record);

    int updateByPrimaryKey(IndicesOfIndustrial record);
}