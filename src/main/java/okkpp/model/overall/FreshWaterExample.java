package okkpp.model.overall;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FreshWaterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FreshWaterExample() {
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

        public Criteria andRenewableIsNull() {
            addCriterion("renewable is null");
            return (Criteria) this;
        }

        public Criteria andRenewableIsNotNull() {
            addCriterion("renewable is not null");
            return (Criteria) this;
        }

        public Criteria andRenewableEqualTo(Double value) {
            addCriterion("renewable =", value, "renewable");
            return (Criteria) this;
        }

        public Criteria andRenewableNotEqualTo(Double value) {
            addCriterion("renewable <>", value, "renewable");
            return (Criteria) this;
        }

        public Criteria andRenewableGreaterThan(Double value) {
            addCriterion("renewable >", value, "renewable");
            return (Criteria) this;
        }

        public Criteria andRenewableGreaterThanOrEqualTo(Double value) {
            addCriterion("renewable >=", value, "renewable");
            return (Criteria) this;
        }

        public Criteria andRenewableLessThan(Double value) {
            addCriterion("renewable <", value, "renewable");
            return (Criteria) this;
        }

        public Criteria andRenewableLessThanOrEqualTo(Double value) {
            addCriterion("renewable <=", value, "renewable");
            return (Criteria) this;
        }

        public Criteria andRenewableIn(List<Double> values) {
            addCriterion("renewable in", values, "renewable");
            return (Criteria) this;
        }

        public Criteria andRenewableNotIn(List<Double> values) {
            addCriterion("renewable not in", values, "renewable");
            return (Criteria) this;
        }

        public Criteria andRenewableBetween(Double value1, Double value2) {
            addCriterion("renewable between", value1, value2, "renewable");
            return (Criteria) this;
        }

        public Criteria andRenewableNotBetween(Double value1, Double value2) {
            addCriterion("renewable not between", value1, value2, "renewable");
            return (Criteria) this;
        }

        public Criteria andInternalIsNull() {
            addCriterion("internal is null");
            return (Criteria) this;
        }

        public Criteria andInternalIsNotNull() {
            addCriterion("internal is not null");
            return (Criteria) this;
        }

        public Criteria andInternalEqualTo(Double value) {
            addCriterion("internal =", value, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalNotEqualTo(Double value) {
            addCriterion("internal <>", value, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalGreaterThan(Double value) {
            addCriterion("internal >", value, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalGreaterThanOrEqualTo(Double value) {
            addCriterion("internal >=", value, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalLessThan(Double value) {
            addCriterion("internal <", value, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalLessThanOrEqualTo(Double value) {
            addCriterion("internal <=", value, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalIn(List<Double> values) {
            addCriterion("internal in", values, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalNotIn(List<Double> values) {
            addCriterion("internal not in", values, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalBetween(Double value1, Double value2) {
            addCriterion("internal between", value1, value2, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalNotBetween(Double value1, Double value2) {
            addCriterion("internal not between", value1, value2, "internal");
            return (Criteria) this;
        }

        public Criteria andAgricultureIsNull() {
            addCriterion("agriculture is null");
            return (Criteria) this;
        }

        public Criteria andAgricultureIsNotNull() {
            addCriterion("agriculture is not null");
            return (Criteria) this;
        }

        public Criteria andAgricultureEqualTo(Double value) {
            addCriterion("agriculture =", value, "agriculture");
            return (Criteria) this;
        }

        public Criteria andAgricultureNotEqualTo(Double value) {
            addCriterion("agriculture <>", value, "agriculture");
            return (Criteria) this;
        }

        public Criteria andAgricultureGreaterThan(Double value) {
            addCriterion("agriculture >", value, "agriculture");
            return (Criteria) this;
        }

        public Criteria andAgricultureGreaterThanOrEqualTo(Double value) {
            addCriterion("agriculture >=", value, "agriculture");
            return (Criteria) this;
        }

        public Criteria andAgricultureLessThan(Double value) {
            addCriterion("agriculture <", value, "agriculture");
            return (Criteria) this;
        }

        public Criteria andAgricultureLessThanOrEqualTo(Double value) {
            addCriterion("agriculture <=", value, "agriculture");
            return (Criteria) this;
        }

        public Criteria andAgricultureIn(List<Double> values) {
            addCriterion("agriculture in", values, "agriculture");
            return (Criteria) this;
        }

        public Criteria andAgricultureNotIn(List<Double> values) {
            addCriterion("agriculture not in", values, "agriculture");
            return (Criteria) this;
        }

        public Criteria andAgricultureBetween(Double value1, Double value2) {
            addCriterion("agriculture between", value1, value2, "agriculture");
            return (Criteria) this;
        }

        public Criteria andAgricultureNotBetween(Double value1, Double value2) {
            addCriterion("agriculture not between", value1, value2, "agriculture");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNull() {
            addCriterion("industry is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNotNull() {
            addCriterion("industry is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(Double value) {
            addCriterion("industry =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(Double value) {
            addCriterion("industry <>", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(Double value) {
            addCriterion("industry >", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(Double value) {
            addCriterion("industry >=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(Double value) {
            addCriterion("industry <", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(Double value) {
            addCriterion("industry <=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<Double> values) {
            addCriterion("industry in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<Double> values) {
            addCriterion("industry not in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(Double value1, Double value2) {
            addCriterion("industry between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(Double value1, Double value2) {
            addCriterion("industry not between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andDomesticIsNull() {
            addCriterion("domestic is null");
            return (Criteria) this;
        }

        public Criteria andDomesticIsNotNull() {
            addCriterion("domestic is not null");
            return (Criteria) this;
        }

        public Criteria andDomesticEqualTo(Double value) {
            addCriterion("domestic =", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticNotEqualTo(Double value) {
            addCriterion("domestic <>", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticGreaterThan(Double value) {
            addCriterion("domestic >", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticGreaterThanOrEqualTo(Double value) {
            addCriterion("domestic >=", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticLessThan(Double value) {
            addCriterion("domestic <", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticLessThanOrEqualTo(Double value) {
            addCriterion("domestic <=", value, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticIn(List<Double> values) {
            addCriterion("domestic in", values, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticNotIn(List<Double> values) {
            addCriterion("domestic not in", values, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticBetween(Double value1, Double value2) {
            addCriterion("domestic between", value1, value2, "domestic");
            return (Criteria) this;
        }

        public Criteria andDomesticNotBetween(Double value1, Double value2) {
            addCriterion("domestic not between", value1, value2, "domestic");
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