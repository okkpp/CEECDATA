package okkpp.dao.employment;

import java.util.List;
import okkpp.model.employment.Wages;
import okkpp.model.employment.WagesExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface WagesMapper extends Mapper<Wages> {
    int countByExample(WagesExample example);

    int deleteByExample(WagesExample example);

    List<Wages> selectByExample(WagesExample example);

    int updateByExampleSelective(@Param("record") Wages record, @Param("example") WagesExample example);

    int updateByExample(@Param("record") Wages record, @Param("example") WagesExample example);
}