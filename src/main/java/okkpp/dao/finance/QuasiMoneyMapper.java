package okkpp.dao.finance;

import java.util.List;
import okkpp.model.finance.QuasiMoney;
import okkpp.model.finance.QuasiMoneyExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface QuasiMoneyMapper extends Mapper<QuasiMoney> {
    int deleteByExample(QuasiMoneyExample example);

    List<QuasiMoney> selectByExample(QuasiMoneyExample example);

    int updateByExampleSelective(@Param("record") QuasiMoney record, @Param("example") QuasiMoneyExample example);

    int updateByExample(@Param("record") QuasiMoney record, @Param("example") QuasiMoneyExample example);
}