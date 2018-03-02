package okkpp.dao.finance;

import java.util.List;
import okkpp.model.finance.Surplus;
import okkpp.model.finance.SurplusExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface SurplusMapper extends Mapper<Surplus> {
    int deleteByExample(SurplusExample example);

    List<Surplus> selectByExample(SurplusExample example);

    int updateByExampleSelective(@Param("record") Surplus record, @Param("example") SurplusExample example);

    int updateByExample(@Param("record") Surplus record, @Param("example") SurplusExample example);
}