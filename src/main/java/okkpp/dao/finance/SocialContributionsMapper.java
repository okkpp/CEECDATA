package okkpp.dao.finance;

import java.util.List;
import okkpp.model.finance.SocialContributions;
import okkpp.model.finance.SocialContributionsExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface SocialContributionsMapper extends Mapper<SocialContributions> {
    int deleteByExample(SocialContributionsExample example);

    List<SocialContributions> selectByExample(SocialContributionsExample example);

    int updateByExampleSelective(@Param("record") SocialContributions record, @Param("example") SocialContributionsExample example);

    int updateByExample(@Param("record") SocialContributions record, @Param("example") SocialContributionsExample example);
}