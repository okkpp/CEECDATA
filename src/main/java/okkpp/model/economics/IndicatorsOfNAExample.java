package okkpp.model.economics;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IndicatorsOfNAExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IndicatorsOfNAExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 按购买力平价法计算的国民经济核算主要指标
 Main Economic Indicators of National Accounts Based on PPP
     * 
     * @author wcyong
     * 
     * @date 2018-03-02
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("year like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("year not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andGdpIsNull() {
            addCriterion("gdp is null");
            return (Criteria) this;
        }

        public Criteria andGdpIsNotNull() {
            addCriterion("gdp is not null");
            return (Criteria) this;
        }

        public Criteria andGdpEqualTo(Integer value) {
            addCriterion("gdp =", value, "gdp");
            return (Criteria) this;
        }

        public Criteria andGdpNotEqualTo(Integer value) {
            addCriterion("gdp <>", value, "gdp");
            return (Criteria) this;
        }

        public Criteria andGdpGreaterThan(Integer value) {
            addCriterion("gdp >", value, "gdp");
            return (Criteria) this;
        }

        public Criteria andGdpGreaterThanOrEqualTo(Integer value) {
            addCriterion("gdp >=", value, "gdp");
            return (Criteria) this;
        }

        public Criteria andGdpLessThan(Integer value) {
            addCriterion("gdp <", value, "gdp");
            return (Criteria) this;
        }

        public Criteria andGdpLessThanOrEqualTo(Integer value) {
            addCriterion("gdp <=", value, "gdp");
            return (Criteria) this;
        }

        public Criteria andGdpIn(List<Integer> values) {
            addCriterion("gdp in", values, "gdp");
            return (Criteria) this;
        }

        public Criteria andGdpNotIn(List<Integer> values) {
            addCriterion("gdp not in", values, "gdp");
            return (Criteria) this;
        }

        public Criteria andGdpBetween(Integer value1, Integer value2) {
            addCriterion("gdp between", value1, value2, "gdp");
            return (Criteria) this;
        }

        public Criteria andGdpNotBetween(Integer value1, Integer value2) {
            addCriterion("gdp not between", value1, value2, "gdp");
            return (Criteria) this;
        }

        public Criteria andGdppcIsNull() {
            addCriterion("gdppc is null");
            return (Criteria) this;
        }

        public Criteria andGdppcIsNotNull() {
            addCriterion("gdppc is not null");
            return (Criteria) this;
        }

        public Criteria andGdppcEqualTo(Integer value) {
            addCriterion("gdppc =", value, "gdppc");
            return (Criteria) this;
        }

        public Criteria andGdppcNotEqualTo(Integer value) {
            addCriterion("gdppc <>", value, "gdppc");
            return (Criteria) this;
        }

        public Criteria andGdppcGreaterThan(Integer value) {
            addCriterion("gdppc >", value, "gdppc");
            return (Criteria) this;
        }

        public Criteria andGdppcGreaterThanOrEqualTo(Integer value) {
            addCriterion("gdppc >=", value, "gdppc");
            return (Criteria) this;
        }

        public Criteria andGdppcLessThan(Integer value) {
            addCriterion("gdppc <", value, "gdppc");
            return (Criteria) this;
        }

        public Criteria andGdppcLessThanOrEqualTo(Integer value) {
            addCriterion("gdppc <=", value, "gdppc");
            return (Criteria) this;
        }

        public Criteria andGdppcIn(List<Integer> values) {
            addCriterion("gdppc in", values, "gdppc");
            return (Criteria) this;
        }

        public Criteria andGdppcNotIn(List<Integer> values) {
            addCriterion("gdppc not in", values, "gdppc");
            return (Criteria) this;
        }

        public Criteria andGdppcBetween(Integer value1, Integer value2) {
            addCriterion("gdppc between", value1, value2, "gdppc");
            return (Criteria) this;
        }

        public Criteria andGdppcNotBetween(Integer value1, Integer value2) {
            addCriterion("gdppc not between", value1, value2, "gdppc");
            return (Criteria) this;
        }

        public Criteria andGniIsNull() {
            addCriterion("gni is null");
            return (Criteria) this;
        }

        public Criteria andGniIsNotNull() {
            addCriterion("gni is not null");
            return (Criteria) this;
        }

        public Criteria andGniEqualTo(Integer value) {
            addCriterion("gni =", value, "gni");
            return (Criteria) this;
        }

        public Criteria andGniNotEqualTo(Integer value) {
            addCriterion("gni <>", value, "gni");
            return (Criteria) this;
        }

        public Criteria andGniGreaterThan(Integer value) {
            addCriterion("gni >", value, "gni");
            return (Criteria) this;
        }

        public Criteria andGniGreaterThanOrEqualTo(Integer value) {
            addCriterion("gni >=", value, "gni");
            return (Criteria) this;
        }

        public Criteria andGniLessThan(Integer value) {
            addCriterion("gni <", value, "gni");
            return (Criteria) this;
        }

        public Criteria andGniLessThanOrEqualTo(Integer value) {
            addCriterion("gni <=", value, "gni");
            return (Criteria) this;
        }

        public Criteria andGniIn(List<Integer> values) {
            addCriterion("gni in", values, "gni");
            return (Criteria) this;
        }

        public Criteria andGniNotIn(List<Integer> values) {
            addCriterion("gni not in", values, "gni");
            return (Criteria) this;
        }

        public Criteria andGniBetween(Integer value1, Integer value2) {
            addCriterion("gni between", value1, value2, "gni");
            return (Criteria) this;
        }

        public Criteria andGniNotBetween(Integer value1, Integer value2) {
            addCriterion("gni not between", value1, value2, "gni");
            return (Criteria) this;
        }

        public Criteria andGnipcIsNull() {
            addCriterion("gnipc is null");
            return (Criteria) this;
        }

        public Criteria andGnipcIsNotNull() {
            addCriterion("gnipc is not null");
            return (Criteria) this;
        }

        public Criteria andGnipcEqualTo(Integer value) {
            addCriterion("gnipc =", value, "gnipc");
            return (Criteria) this;
        }

        public Criteria andGnipcNotEqualTo(Integer value) {
            addCriterion("gnipc <>", value, "gnipc");
            return (Criteria) this;
        }

        public Criteria andGnipcGreaterThan(Integer value) {
            addCriterion("gnipc >", value, "gnipc");
            return (Criteria) this;
        }

        public Criteria andGnipcGreaterThanOrEqualTo(Integer value) {
            addCriterion("gnipc >=", value, "gnipc");
            return (Criteria) this;
        }

        public Criteria andGnipcLessThan(Integer value) {
            addCriterion("gnipc <", value, "gnipc");
            return (Criteria) this;
        }

        public Criteria andGnipcLessThanOrEqualTo(Integer value) {
            addCriterion("gnipc <=", value, "gnipc");
            return (Criteria) this;
        }

        public Criteria andGnipcIn(List<Integer> values) {
            addCriterion("gnipc in", values, "gnipc");
            return (Criteria) this;
        }

        public Criteria andGnipcNotIn(List<Integer> values) {
            addCriterion("gnipc not in", values, "gnipc");
            return (Criteria) this;
        }

        public Criteria andGnipcBetween(Integer value1, Integer value2) {
            addCriterion("gnipc between", value1, value2, "gnipc");
            return (Criteria) this;
        }

        public Criteria andGnipcNotBetween(Integer value1, Integer value2) {
            addCriterion("gnipc not between", value1, value2, "gnipc");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andUpdateIsNull() {
            addCriterion("update is null");
            return (Criteria) this;
        }

        public Criteria andUpdateIsNotNull() {
            addCriterion("update is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateEqualTo(Date value) {
            addCriterion("update =", value, "update");
            return (Criteria) this;
        }

        public Criteria andUpdateNotEqualTo(Date value) {
            addCriterion("update <>", value, "update");
            return (Criteria) this;
        }

        public Criteria andUpdateGreaterThan(Date value) {
            addCriterion("update >", value, "update");
            return (Criteria) this;
        }

        public Criteria andUpdateGreaterThanOrEqualTo(Date value) {
            addCriterion("update >=", value, "update");
            return (Criteria) this;
        }

        public Criteria andUpdateLessThan(Date value) {
            addCriterion("update <", value, "update");
            return (Criteria) this;
        }

        public Criteria andUpdateLessThanOrEqualTo(Date value) {
            addCriterion("update <=", value, "update");
            return (Criteria) this;
        }

        public Criteria andUpdateIn(List<Date> values) {
            addCriterion("update in", values, "update");
            return (Criteria) this;
        }

        public Criteria andUpdateNotIn(List<Date> values) {
            addCriterion("update not in", values, "update");
            return (Criteria) this;
        }

        public Criteria andUpdateBetween(Date value1, Date value2) {
            addCriterion("update between", value1, value2, "update");
            return (Criteria) this;
        }

        public Criteria andUpdateNotBetween(Date value1, Date value2) {
            addCriterion("update not between", value1, value2, "update");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 按购买力平价法计算的国民经济核算主要指标
 Main Economic Indicators of National Accounts Based on PPP
     * 
     * @author wcyong
     * 
     * @date 2018-03-02
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}