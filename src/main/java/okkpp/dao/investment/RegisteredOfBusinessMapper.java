package okkpp.dao.investment;

import okkpp.model.investment.RegisteredOfBusiness;
import okkpp.model.investment.RegisteredOfBusinessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegisteredOfBusinessMapper {
    int countByExample(RegisteredOfBusinessExample example);

    int deleteByExample(RegisteredOfBusinessExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RegisteredOfBusiness record);

    int insertSelective(RegisteredOfBusiness record);

    List<RegisteredOfBusiness> selectByExample(RegisteredOfBusinessExample example);

    RegisteredOfBusiness selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RegisteredOfBusiness record, @Param("example") RegisteredOfBusinessExample example);

    int updateByExample(@Param("record") RegisteredOfBusiness record, @Param("example") RegisteredOfBusinessExample example);

    int updateByPrimaryKeySelective(RegisteredOfBusiness record);

    int updateByPrimaryKey(RegisteredOfBusiness record);
}