package okkpp.dao.industry;

import java.util.List;
import okkpp.model.industry.IndicesOfManufacturing;
import okkpp.model.industry.IndicesOfManufacturingExample;
import org.apache.ibatis.annotations.Param;

public interface IndicesOfManufacturingMapper {
    int deleteByExample(IndicesOfManufacturingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IndicesOfManufacturing record);

    int insertSelective(IndicesOfManufacturing record);

    List<IndicesOfManufacturing> selectByExample(IndicesOfManufacturingExample example);

    IndicesOfManufacturing selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IndicesOfManufacturing record, @Param("example") IndicesOfManufacturingExample example);

    int updateByExample(@Param("record") IndicesOfManufacturing record, @Param("example") IndicesOfManufacturingExample example);

    int updateByPrimaryKeySelective(IndicesOfManufacturing record);

    int updateByPrimaryKey(IndicesOfManufacturing record);
}