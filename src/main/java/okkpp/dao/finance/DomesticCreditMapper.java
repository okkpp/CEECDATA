package okkpp.dao.finance;

import java.util.List;
import okkpp.model.finance.DomesticCredit;
import okkpp.model.finance.DomesticCreditExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface DomesticCreditMapper extends Mapper<DomesticCredit> {
    int deleteByExample(DomesticCreditExample example);

    List<DomesticCredit> selectByExample(DomesticCreditExample example);

    int updateByExampleSelective(@Param("record") DomesticCredit record, @Param("example") DomesticCreditExample example);

    int updateByExample(@Param("record") DomesticCredit record, @Param("example") DomesticCreditExample example);
}