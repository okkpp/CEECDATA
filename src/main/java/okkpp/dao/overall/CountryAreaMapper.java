package okkpp.dao.overall;

import java.util.List;
import okkpp.model.overall.CountryArea;
import okkpp.model.overall.CountryAreaExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface CountryAreaMapper extends Mapper<CountryArea> {
    int deleteByExample(CountryAreaExample example);

    List<CountryArea> selectByExample(CountryAreaExample example);

    int updateByExampleSelective(@Param("record") CountryArea record, @Param("example") CountryAreaExample example);

    int updateByExample(@Param("record") CountryArea record, @Param("example") CountryAreaExample example);
}