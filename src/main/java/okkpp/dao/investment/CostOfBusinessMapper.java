package okkpp.dao.investment;

import okkpp.model.investment.CostOfBusiness;
import okkpp.model.investment.CostOfBusinessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CostOfBusinessMapper {
    int deleteByExample(CostOfBusinessExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CostOfBusiness record);

    int insertSelective(CostOfBusiness record);

    List<CostOfBusiness> selectByExample(CostOfBusinessExample example);

    CostOfBusiness selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CostOfBusiness record, @Param("example") CostOfBusinessExample example);

    int updateByExample(@Param("record") CostOfBusiness record, @Param("example") CostOfBusinessExample example);

    int updateByPrimaryKeySelective(CostOfBusiness record);

    int updateByPrimaryKey(CostOfBusiness record);
}