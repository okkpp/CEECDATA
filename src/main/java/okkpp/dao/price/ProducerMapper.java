package okkpp.dao.price;

import okkpp.model.price.Producer;
import okkpp.model.price.ProducerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProducerMapper {
    int countByExample(ProducerExample example);

    int deleteByExample(ProducerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Producer record);

    int insertSelective(Producer record);

    List<Producer> selectByExample(ProducerExample example);

    Producer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Producer record, @Param("example") ProducerExample example);

    int updateByExample(@Param("record") Producer record, @Param("example") ProducerExample example);

    int updateByPrimaryKeySelective(Producer record);

    int updateByPrimaryKey(Producer record);
}