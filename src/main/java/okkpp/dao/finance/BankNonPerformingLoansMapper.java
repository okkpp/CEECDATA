package okkpp.dao.finance;

import java.util.List;
import okkpp.model.finance.BankNonPerformingLoans;
import okkpp.model.finance.BankNonPerformingLoansExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface BankNonPerformingLoansMapper extends Mapper<BankNonPerformingLoans> {
    int deleteByExample(BankNonPerformingLoansExample example);

    List<BankNonPerformingLoans> selectByExample(BankNonPerformingLoansExample example);

    int updateByExampleSelective(@Param("record") BankNonPerformingLoans record, @Param("example") BankNonPerformingLoansExample example);

    int updateByExample(@Param("record") BankNonPerformingLoans record, @Param("example") BankNonPerformingLoansExample example);
}