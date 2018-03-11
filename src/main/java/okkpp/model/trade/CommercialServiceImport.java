package okkpp.model.trade;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_trade_commercial_service_import")
public class CommercialServiceImport implements Serializable {
    @Id
    private Integer id;

    /**
     * 国家
     */
    private String country;

    /**
     * 年份
     */
    private String year;

    /**
     * 服务贸易进口总额
     */
    @Column(name = "trade_import")
    private Integer tradeImport;

    /**
     * 序号
     */
    private Integer sort;

    /**
     * 更新时间
     */
    private Date updated;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取国家
     *
     * @return country - 国家
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置国家
     *
     * @param country 国家
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 获取年份
     *
     * @return year - 年份
     */
    public String getYear() {
        return year;
    }

    /**
     * 设置年份
     *
     * @param year 年份
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * 获取服务贸易进口总额
     *
     * @return trade_import - 服务贸易进口总额
     */
    public Integer getTradeImport() {
        return tradeImport;
    }

    /**
     * 设置服务贸易进口总额
     *
     * @param tradeImport 服务贸易进口总额
     */
    public void setTradeImport(Integer tradeImport) {
        this.tradeImport = tradeImport;
    }

    /**
     * 获取序号
     *
     * @return sort - 序号
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置序号
     *
     * @param sort 序号
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取更新时间
     *
     * @return updated - 更新时间
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * 设置更新时间
     *
     * @param updated 更新时间
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}