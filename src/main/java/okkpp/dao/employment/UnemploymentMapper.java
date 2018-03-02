package okkpp.dao.employment;

import java.util.List;
import okkpp.model.employment.Unemployment;
import okkpp.model.employment.UnemploymentExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UnemploymentMapper extends Mapper<Unemployment> {
    int countByExample(UnemploymentExample example);

    int deleteByExample(UnemploymentExample example);

    List<Unemployment> selectByExample(UnemploymentExample example);

    int updateByExampleSelective(@Param("record") Unemployment record, @Param("example") UnemploymentExample example);

    int updateByExample(@Param("record") Unemployment record, @Param("example") UnemploymentExample example);
}