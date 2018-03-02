package okkpp.dao.finance;

import java.util.List;
import okkpp.model.finance.MoneySupply;
import okkpp.model.finance.MoneySupplyExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface MoneySupplyMapper extends Mapper<MoneySupply> {
    int deleteByExample(MoneySupplyExample example);

    List<MoneySupply> selectByExample(MoneySupplyExample example);

    int updateByExampleSelective(@Param("record") MoneySupply record, @Param("example") MoneySupplyExample example);

    int updateByExample(@Param("record") MoneySupply record, @Param("example") MoneySupplyExample example);
}