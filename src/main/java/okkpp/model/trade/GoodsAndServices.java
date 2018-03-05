package okkpp.model.trade;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_trade_goods_and_services")
public class GoodsAndServices implements Serializable {
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
     * 货物和服务出口占国内生产总值比重
     */
    @Column(name = "trade_export")
    private Double tradeExport;

    /**
     * 货物和服务进口占国内生产总值比重
     */
    @Column(name = "trade_import")
    private Double tradeImport;

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
     * 获取货物和服务出口占国内生产总值比重
     *
     * @return trade_export - 货物和服务出口占国内生产总值比重
     */
    public Double getTradeExport() {
        return tradeExport;
    }

    /**
     * 设置货物和服务出口占国内生产总值比重
     *
     * @param tradeExport 货物和服务出口占国内生产总值比重
     */
    public void setTradeExport(Double tradeExport) {
        this.tradeExport = tradeExport;
    }

    /**
     * 获取货物和服务进口占国内生产总值比重
     *
     * @return trade_import - 货物和服务进口占国内生产总值比重
     */
    public Double getTradeImport() {
        return tradeImport;
    }

    /**
     * 设置货物和服务进口占国内生产总值比重
     *
     * @param tradeImport 货物和服务进口占国内生产总值比重
     */
    public void setTradeImport(Double tradeImport) {
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