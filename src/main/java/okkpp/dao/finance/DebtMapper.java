package okkpp.dao.finance;

import java.util.List;
import okkpp.model.finance.Debt;
import okkpp.model.finance.DebtExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface DebtMapper extends Mapper<Debt> {
    int deleteByExample(DebtExample example);

    List<Debt> selectByExample(DebtExample example);

    int updateByExampleSelective(@Param("record") Debt record, @Param("example") DebtExample example);

    int updateByExample(@Param("record") Debt record, @Param("example") DebtExample example);
}