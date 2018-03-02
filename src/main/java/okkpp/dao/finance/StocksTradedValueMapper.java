package okkpp.dao.finance;

import java.util.List;
import okkpp.model.finance.StocksTradedValue;
import okkpp.model.finance.StocksTradedValueExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface StocksTradedValueMapper extends Mapper<StocksTradedValue> {
    int deleteByExample(StocksTradedValueExample example);

    List<StocksTradedValue> selectByExample(StocksTradedValueExample example);

    int updateByExampleSelective(@Param("record") StocksTradedValue record, @Param("example") StocksTradedValueExample example);

    int updateByExample(@Param("record") StocksTradedValue record, @Param("example") StocksTradedValueExample example);
}