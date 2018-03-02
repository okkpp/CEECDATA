package okkpp.dao.finance;

import java.util.List;
import okkpp.model.finance.ListedDomesticCompanies;
import okkpp.model.finance.ListedDomesticCompaniesExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface ListedDomesticCompaniesMapper extends Mapper<ListedDomesticCompanies> {
    int deleteByExample(ListedDomesticCompaniesExample example);

    List<ListedDomesticCompanies> selectByExample(ListedDomesticCompaniesExample example);

    int updateByExampleSelective(@Param("record") ListedDomesticCompanies record, @Param("example") ListedDomesticCompaniesExample example);

    int updateByExample(@Param("record") ListedDomesticCompanies record, @Param("example") ListedDomesticCompaniesExample example);
}