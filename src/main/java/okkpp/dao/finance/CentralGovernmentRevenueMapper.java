package okkpp.dao.finance;

import java.util.List;
import okkpp.model.finance.CentralGovernmentRevenue;
import okkpp.model.finance.CentralGovernmentRevenueExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface CentralGovernmentRevenueMapper extends Mapper<CentralGovernmentRevenue> {
    int deleteByExample(CentralGovernmentRevenueExample example);

    List<CentralGovernmentRevenue> selectByExample(CentralGovernmentRevenueExample example);

    int updateByExampleSelective(@Param("record") CentralGovernmentRevenue record, @Param("example") CentralGovernmentRevenueExample example);

    int updateByExample(@Param("record") CentralGovernmentRevenue record, @Param("example") CentralGovernmentRevenueExample example);
}