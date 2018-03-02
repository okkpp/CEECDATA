package okkpp.dao.economics;

import okkpp.model.economics.GNIPC;
import okkpp.model.economics.GNIPCExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GNIPCMapper {
    int deleteByExample(GNIPCExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GNIPC record);

    int insertSelective(GNIPC record);

    List<GNIPC> selectByExample(GNIPCExample example);

    GNIPC selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GNIPC record, @Param("example") GNIPCExample example);

    int updateByExample(@Param("record") GNIPC record, @Param("example") GNIPCExample example);

    int updateByPrimaryKeySelective(GNIPC record);

    int updateByPrimaryKey(GNIPC record);
}