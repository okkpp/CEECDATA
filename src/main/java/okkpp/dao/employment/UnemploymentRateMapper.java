package okkpp.dao.employment;

import java.util.List;
import okkpp.model.employment.UnemploymentRate;
import okkpp.model.employment.UnemploymentRateExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UnemploymentRateMapper extends Mapper<UnemploymentRate> {
    int countByExample(UnemploymentRateExample example);

    int deleteByExample(UnemploymentRateExample example);

    List<UnemploymentRate> selectByExample(UnemploymentRateExample example);

    int updateByExampleSelective(@Param("record") UnemploymentRate record, @Param("example") UnemploymentRateExample example);

    int updateByExample(@Param("record") UnemploymentRate record, @Param("example") UnemploymentRateExample example);
}