package okkpp.dao.industry;

import java.util.List;
import okkpp.model.industry.IndicesOfMining;
import okkpp.model.industry.IndicesOfMiningExample;
import org.apache.ibatis.annotations.Param;

public interface IndicesOfMiningMapper {
    int deleteByExample(IndicesOfMiningExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IndicesOfMining record);

    int insertSelective(IndicesOfMining record);

    List<IndicesOfMining> selectByExample(IndicesOfMiningExample example);

    IndicesOfMining selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IndicesOfMining record, @Param("example") IndicesOfMiningExample example);

    int updateByExample(@Param("record") IndicesOfMining record, @Param("example") IndicesOfMiningExample example);

    int updateByPrimaryKeySelective(IndicesOfMining record);

    int updateByPrimaryKey(IndicesOfMining record);
}