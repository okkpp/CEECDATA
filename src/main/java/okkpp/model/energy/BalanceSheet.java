package okkpp.model.energy;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_energy_balance_sheet")
public class BalanceSheet implements Serializable {
    @Id
    private Integer id;

    /**
     * 国家/地区
     */
    private String country;

    /**
     * 年份
     */
    private String year;

    /**
     * 煤和煤制品生产量
     */
    private Integer coal;

    /**
     * 天然气生产量
     */
    @Column(name = "natural_gas")
    private Integer naturalGas;

    /**
     * 能源进口总计
     */
    private Integer imports;

    /**
     * 煤和煤制品进口量
     */
    @Column(name = "imports_coal")
    private Integer importsCoal;

    /**
     * 天然气进口量
     */
    @Column(name = "imports_natural_gas")
    private Integer importsNaturalGas;

    /**
     * 能源生产量总计
     */
    private Integer total;

    /**
     * 序号
     */
    private Integer sort;

    /**
     * 更新日期
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
     * 获取国家/地区
     *
     * @return country - 国家/地区
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置国家/地区
     *
     * @param country 国家/地区
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
     * 获取煤和煤制品生产量
     *
     * @return coal - 煤和煤制品生产量
     */
    public Integer getCoal() {
        return coal;
    }

    /**
     * 设置煤和煤制品生产量
     *
     * @param coal 煤和煤制品生产量
     */
    public void setCoal(Integer coal) {
        this.coal = coal;
    }

    /**
     * 获取天然气生产量
     *
     * @return natural_gas - 天然气生产量
     */
    public Integer getNaturalGas() {
        return naturalGas;
    }

    /**
     * 设置天然气生产量
     *
     * @param naturalGas 天然气生产量
     */
    public void setNaturalGas(Integer naturalGas) {
        this.naturalGas = naturalGas;
    }

    /**
     * 获取能源进口总计
     *
     * @return imports - 能源进口总计
     */
    public Integer getImports() {
        return imports;
    }

    /**
     * 设置能源进口总计
     *
     * @param imports 能源进口总计
     */
    public void setImports(Integer imports) {
        this.imports = imports;
    }

    /**
     * 获取煤和煤制品进口量
     *
     * @return imports_coal - 煤和煤制品进口量
     */
    public Integer getImportsCoal() {
        return importsCoal;
    }

    /**
     * 设置煤和煤制品进口量
     *
     * @param importsCoal 煤和煤制品进口量
     */
    public void setImportsCoal(Integer importsCoal) {
        this.importsCoal = importsCoal;
    }

    /**
     * 获取天然气进口量
     *
     * @return imports_natural_gas - 天然气进口量
     */
    public Integer getImportsNaturalGas() {
        return importsNaturalGas;
    }

    /**
     * 设置天然气进口量
     *
     * @param importsNaturalGas 天然气进口量
     */
    public void setImportsNaturalGas(Integer importsNaturalGas) {
        this.importsNaturalGas = importsNaturalGas;
    }

    /**
     * 获取能源生产量总计
     *
     * @return total - 能源生产量总计
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * 设置能源生产量总计
     *
     * @param total 能源生产量总计
     */
    public void setTotal(Integer total) {
        this.total = total;
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
     * 获取更新日期
     *
     * @return updated - 更新日期
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * 设置更新日期
     *
     * @param updated 更新日期
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}