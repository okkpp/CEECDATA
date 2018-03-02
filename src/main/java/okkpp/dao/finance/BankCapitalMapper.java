package okkpp.dao.finance;

import java.util.List;
import okkpp.model.finance.BankCapital;
import okkpp.model.finance.BankCapitalExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface BankCapitalMapper extends Mapper<BankCapital> {
    int deleteByExample(BankCapitalExample example);

    List<BankCapital> selectByExample(BankCapitalExample example);

    int updateByExampleSelective(@Param("record") BankCapital record, @Param("example") BankCapitalExample example);

    int updateByExample(@Param("record") BankCapital record, @Param("example") BankCapitalExample example);
}