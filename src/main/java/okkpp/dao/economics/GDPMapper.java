package okkpp.dao.economics;

import okkpp.model.economics.GDP;
import okkpp.model.economics.GDPExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GDPMapper {
    int deleteByExample(GDPExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GDP record);

    int insertSelective(GDP record);

    List<GDP> selectByExample(GDPExample example);

    GDP selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GDP record, @Param("example") GDPExample example);

    int updateByExample(@Param("record") GDP record, @Param("example") GDPExample example);

    int updateByPrimaryKeySelective(GDP record);

    int updateByPrimaryKey(GDP record);
}