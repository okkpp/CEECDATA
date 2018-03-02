package okkpp.dao.finance;

import java.util.List;
import okkpp.model.finance.GlobalEquityIndices;
import okkpp.model.finance.GlobalEquityIndicesExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface GlobalEquityIndicesMapper extends Mapper<GlobalEquityIndices> {
    int deleteByExample(GlobalEquityIndicesExample example);

    List<GlobalEquityIndices> selectByExample(GlobalEquityIndicesExample example);

    int updateByExampleSelective(@Param("record") GlobalEquityIndices record, @Param("example") GlobalEquityIndicesExample example);

    int updateByExample(@Param("record") GlobalEquityIndices record, @Param("example") GlobalEquityIndicesExample example);
}