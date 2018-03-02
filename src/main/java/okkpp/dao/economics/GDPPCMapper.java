package okkpp.dao.economics;

import okkpp.model.economics.GDPPC;
import okkpp.model.economics.GDPPCExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GDPPCMapper {
    int deleteByExample(GDPPCExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GDPPC record);

    int insertSelective(GDPPC record);

    List<GDPPC> selectByExample(GDPPCExample example);

    GDPPC selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GDPPC record, @Param("example") GDPPCExample example);

    int updateByExample(@Param("record") GDPPC record, @Param("example") GDPPCExample example);

    int updateByPrimaryKeySelective(GDPPC record);

    int updateByPrimaryKey(GDPPC record);
}