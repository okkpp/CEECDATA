package okkpp.dao.economics;

import okkpp.model.economics.PercentageOfAgriculture;
import okkpp.model.economics.PercentageOfAgricultureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PercentageOfAgricultureMapper {
    int countByExample(PercentageOfAgricultureExample example);

    int deleteByExample(PercentageOfAgricultureExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PercentageOfAgriculture record);

    int insertSelective(PercentageOfAgriculture record);

    List<PercentageOfAgriculture> selectByExample(PercentageOfAgricultureExample example);

    PercentageOfAgriculture selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PercentageOfAgriculture record, @Param("example") PercentageOfAgricultureExample example);

    int updateByExample(@Param("record") PercentageOfAgriculture record, @Param("example") PercentageOfAgricultureExample example);

    int updateByPrimaryKeySelective(PercentageOfAgriculture record);

    int updateByPrimaryKey(PercentageOfAgriculture record);
}