package okkpp.dao.finance;

import java.util.List;
import okkpp.model.finance.DepositRateAndLendingRate;
import okkpp.model.finance.DepositRateAndLendingRateExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface DepositRateAndLendingRateMapper extends Mapper<DepositRateAndLendingRate> {
    int deleteByExample(DepositRateAndLendingRateExample example);

    List<DepositRateAndLendingRate> selectByExample(DepositRateAndLendingRateExample example);

    int updateByExampleSelective(@Param("record") DepositRateAndLendingRate record, @Param("example") DepositRateAndLendingRateExample example);

    int updateByExample(@Param("record") DepositRateAndLendingRate record, @Param("example") DepositRateAndLendingRateExample example);
}