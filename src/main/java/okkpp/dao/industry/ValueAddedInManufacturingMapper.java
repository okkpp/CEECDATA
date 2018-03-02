package okkpp.dao.industry;

import okkpp.model.industry.ValueAddedInManufacturing;
import okkpp.model.industry.ValueAddedInManufacturingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ValueAddedInManufacturingMapper {
    int deleteByExample(ValueAddedInManufacturingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ValueAddedInManufacturing record);

    int insertSelective(ValueAddedInManufacturing record);

    List<ValueAddedInManufacturing> selectByExample(ValueAddedInManufacturingExample example);

    ValueAddedInManufacturing selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ValueAddedInManufacturing record, @Param("example") ValueAddedInManufacturingExample example);

    int updateByExample(@Param("record") ValueAddedInManufacturing record, @Param("example") ValueAddedInManufacturingExample example);

    int updateByPrimaryKeySelective(ValueAddedInManufacturing record);

    int updateByPrimaryKey(ValueAddedInManufacturing record);
}