package okkpp.dao.economics;

import okkpp.model.economics.ShareOfFormation;
import okkpp.model.economics.ShareOfFormationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShareOfFormationMapper {
    int countByExample(ShareOfFormationExample example);

    int deleteByExample(ShareOfFormationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShareOfFormation record);

    int insertSelective(ShareOfFormation record);

    List<ShareOfFormation> selectByExample(ShareOfFormationExample example);

    ShareOfFormation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShareOfFormation record, @Param("example") ShareOfFormationExample example);

    int updateByExample(@Param("record") ShareOfFormation record, @Param("example") ShareOfFormationExample example);

    int updateByPrimaryKeySelective(ShareOfFormation record);

    int updateByPrimaryKey(ShareOfFormation record);
}