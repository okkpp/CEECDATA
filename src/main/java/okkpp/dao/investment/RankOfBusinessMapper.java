package okkpp.dao.investment;

import okkpp.model.investment.RankOfBusiness;
import okkpp.model.investment.RankOfBusinessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RankOfBusinessMapper {
    int countByExample(RankOfBusinessExample example);

    int deleteByExample(RankOfBusinessExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RankOfBusiness record);

    int insertSelective(RankOfBusiness record);

    List<RankOfBusiness> selectByExample(RankOfBusinessExample example);

    RankOfBusiness selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RankOfBusiness record, @Param("example") RankOfBusinessExample example);

    int updateByExample(@Param("record") RankOfBusiness record, @Param("example") RankOfBusinessExample example);

    int updateByPrimaryKeySelective(RankOfBusiness record);

    int updateByPrimaryKey(RankOfBusiness record);
}