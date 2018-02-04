package okkpp.dao.economics;

import okkpp.model.economics.IndicatorsOfNA;
import okkpp.model.economics.IndicatorsOfNAExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndicatorsOfNAMapper {
    int countByExample(IndicatorsOfNAExample example);

    int deleteByExample(IndicatorsOfNAExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IndicatorsOfNA record);

    int insertSelective(IndicatorsOfNA record);

    List<IndicatorsOfNA> selectByExample(IndicatorsOfNAExample example);

    IndicatorsOfNA selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IndicatorsOfNA record, @Param("example") IndicatorsOfNAExample example);

    int updateByExample(@Param("record") IndicatorsOfNA record, @Param("example") IndicatorsOfNAExample example);

    int updateByPrimaryKeySelective(IndicatorsOfNA record);

    int updateByPrimaryKey(IndicatorsOfNA record);
}