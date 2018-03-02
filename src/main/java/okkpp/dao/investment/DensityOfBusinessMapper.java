package okkpp.dao.investment;

import okkpp.model.investment.DensityOfBusiness;
import okkpp.model.investment.DensityOfBusinessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DensityOfBusinessMapper {
    int deleteByExample(DensityOfBusinessExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DensityOfBusiness record);

    int insertSelective(DensityOfBusiness record);

    List<DensityOfBusiness> selectByExample(DensityOfBusinessExample example);

    DensityOfBusiness selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DensityOfBusiness record, @Param("example") DensityOfBusinessExample example);

    int updateByExample(@Param("record") DensityOfBusiness record, @Param("example") DensityOfBusinessExample example);

    int updateByPrimaryKeySelective(DensityOfBusiness record);

    int updateByPrimaryKey(DensityOfBusiness record);
}