package okkpp.economics.overall;

import okkpp.model.economics.PercentageOfIndices;
import okkpp.model.economics.PercentageOfIndicesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PercentageOfIndicesMapper {
    int countByExample(PercentageOfIndicesExample example);

    int deleteByExample(PercentageOfIndicesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PercentageOfIndices record);

    int insertSelective(PercentageOfIndices record);

    List<PercentageOfIndices> selectByExample(PercentageOfIndicesExample example);

    PercentageOfIndices selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PercentageOfIndices record, @Param("example") PercentageOfIndicesExample example);

    int updateByExample(@Param("record") PercentageOfIndices record, @Param("example") PercentageOfIndicesExample example);

    int updateByPrimaryKeySelective(PercentageOfIndices record);

    int updateByPrimaryKey(PercentageOfIndices record);
}