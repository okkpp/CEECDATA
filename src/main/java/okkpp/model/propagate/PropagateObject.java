package okkpp.model.propagate;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

/**
* @author duck
* @date 创建时间：2018年3月28日 上午10:27:54
*/
public class PropagateObject {

	/**
     * 国家
     */
    private String country;
    /**
     * 年份
     */
    private String year;
    
    private Map<String, Object> data;
    /**
     * 序号
     */
    private Integer sort;

    /**
     * 更新时间
     */
    private Date updated;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Map<String, Object> getData() {
		return data;
	}
	
	public Object getDataByKey(String key) {
		if(data.containsKey(key)) {
			return data.get(key);
		}
		return null;
	}

	public void setData(Map<String, Object> data) {
		this.data = data;
	}

	public void setDataByKey(String key,Object value) {
		if(this.data==null) {
			this.data = new HashMap<>();
		}
		this.data.put(key, value);
	}
	
	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}
    
	public String toJson() {
		return new Gson().toJson(this);
	}
}
