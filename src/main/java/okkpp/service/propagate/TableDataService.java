package okkpp.service.propagate;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import okkpp.base.service.BaseService;
import okkpp.dao.propagate.TableDataMapper;
import okkpp.model.propagate.TableData;
import okkpp.utils.TimeUtils;
import tk.mybatis.mapper.entity.Example;

/**
 * @author duck
 * @date 创建时间：2018年3月28日 上午10:26:08
 */
@Service
@Transactional
public class TableDataService extends BaseService<TableData> {

	@Autowired
	TableDataMapper mapper;

	public int saveData(int tableId, Map<String, Object> data) {
		TableData td = new TableData(tableId, data);
		mapper.insertReturnId(td);
		return td.getId();
	}

	public List<TableData> list(int catalogId) {
		Example example = new Example(TableData.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andEqualTo("infoId", catalogId);
		return selectByExample(example);
	}

	public int updateData(Integer id, String field, String value) {
		// TODO Auto-generated method stub
		TableData tableData = mapper.selectByPrimaryKey(id);
		Map<String, String> map = toFastJson(tableData.getData());
		map.put(field, value);
		tableData.setDataByMap(map);
		tableData.setUpdated(TimeUtils.getCurrentTime());
		return mapper.updateByPrimaryKey(tableData);
	}

	public HashMap<String, String> toFastJson(String str) {
		HashMap<String, String> jsonMap = JSON.parseObject(str, new TypeReference<HashMap<String, String>>() {
		});
		return jsonMap;
	}
}
