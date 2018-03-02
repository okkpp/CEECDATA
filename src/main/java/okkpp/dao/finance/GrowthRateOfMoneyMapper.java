package okkpp.dao.finance;

import java.util.List;
import okkpp.model.finance.GrowthRateOfMoney;
import okkpp.model.finance.GrowthRateOfMoneyExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface GrowthRateOfMoneyMapper extends Mapper<GrowthRateOfMoney> {
    int deleteByExample(GrowthRateOfMoneyExample example);

    List<GrowthRateOfMoney> selectByExample(GrowthRateOfMoneyExample example);

    int updateByExampleSelective(@Param("record") GrowthRateOfMoney record, @Param("example") GrowthRateOfMoneyExample example);

    int updateByExample(@Param("record") GrowthRateOfMoney record, @Param("example") GrowthRateOfMoneyExample example);
}