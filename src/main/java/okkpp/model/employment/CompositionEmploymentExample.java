package okkpp.model.employment;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompositionEmploymentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompositionEmploymentExample() {
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

        public Criteria andPrimaryIsNull() {
            addCriterion("primary is null");
            return (Criteria) this;
        }

        public Criteria andPrimaryIsNotNull() {
            addCriterion("primary is not null");
            return (Criteria) this;
        }

        public Criteria andPrimaryEqualTo(Double value) {
            addCriterion("primary =", value, "primary");
            return (Criteria) this;
        }

        public Criteria andPrimaryNotEqualTo(Double value) {
            addCriterion("primary <>", value, "primary");
            return (Criteria) this;
        }

        public Criteria andPrimaryGreaterThan(Double value) {
            addCriterion("primary >", value, "primary");
            return (Criteria) this;
        }

        public Criteria andPrimaryGreaterThanOrEqualTo(Double value) {
            addCriterion("primary >=", value, "primary");
            return (Criteria) this;
        }

        public Criteria andPrimaryLessThan(Double value) {
            addCriterion("primary <", value, "primary");
            return (Criteria) this;
        }

        public Criteria andPrimaryLessThanOrEqualTo(Double value) {
            addCriterion("primary <=", value, "primary");
            return (Criteria) this;
        }

        public Criteria andPrimaryIn(List<Double> values) {
            addCriterion("primary in", values, "primary");
            return (Criteria) this;
        }

        public Criteria andPrimaryNotIn(List<Double> values) {
            addCriterion("primary not in", values, "primary");
            return (Criteria) this;
        }

        public Criteria andPrimaryBetween(Double value1, Double value2) {
            addCriterion("primary between", value1, value2, "primary");
            return (Criteria) this;
        }

        public Criteria andPrimaryNotBetween(Double value1, Double value2) {
            addCriterion("primary not between", value1, value2, "primary");
            return (Criteria) this;
        }

        public Criteria andSecondaryIsNull() {
            addCriterion("secondary is null");
            return (Criteria) this;
        }

        public Criteria andSecondaryIsNotNull() {
            addCriterion("secondary is not null");
            return (Criteria) this;
        }

        public Criteria andSecondaryEqualTo(Double value) {
            addCriterion("secondary =", value, "secondary");
            return (Criteria) this;
        }

        public Criteria andSecondaryNotEqualTo(Double value) {
            addCriterion("secondary <>", value, "secondary");
            return (Criteria) this;
        }

        public Criteria andSecondaryGreaterThan(Double value) {
            addCriterion("secondary >", value, "secondary");
            return (Criteria) this;
        }

        public Criteria andSecondaryGreaterThanOrEqualTo(Double value) {
            addCriterion("secondary >=", value, "secondary");
            return (Criteria) this;
        }

        public Criteria andSecondaryLessThan(Double value) {
            addCriterion("secondary <", value, "secondary");
            return (Criteria) this;
        }

        public Criteria andSecondaryLessThanOrEqualTo(Double value) {
            addCriterion("secondary <=", value, "secondary");
            return (Criteria) this;
        }

        public Criteria andSecondaryIn(List<Double> values) {
            addCriterion("secondary in", values, "secondary");
            return (Criteria) this;
        }

        public Criteria andSecondaryNotIn(List<Double> values) {
            addCriterion("secondary not in", values, "secondary");
            return (Criteria) this;
        }

        public Criteria andSecondaryBetween(Double value1, Double value2) {
            addCriterion("secondary between", value1, value2, "secondary");
            return (Criteria) this;
        }

        public Criteria andSecondaryNotBetween(Double value1, Double value2) {
            addCriterion("secondary not between", value1, value2, "secondary");
            return (Criteria) this;
        }

        public Criteria andTertiaryIsNull() {
            addCriterion("tertiary is null");
            return (Criteria) this;
        }

        public Criteria andTertiaryIsNotNull() {
            addCriterion("tertiary is not null");
            return (Criteria) this;
        }

        public Criteria andTertiaryEqualTo(Double value) {
            addCriterion("tertiary =", value, "tertiary");
            return (Criteria) this;
        }

        public Criteria andTertiaryNotEqualTo(Double value) {
            addCriterion("tertiary <>", value, "tertiary");
            return (Criteria) this;
        }

        public Criteria andTertiaryGreaterThan(Double value) {
            addCriterion("tertiary >", value, "tertiary");
            return (Criteria) this;
        }

        public Criteria andTertiaryGreaterThanOrEqualTo(Double value) {
            addCriterion("tertiary >=", value, "tertiary");
            return (Criteria) this;
        }

        public Criteria andTertiaryLessThan(Double value) {
            addCriterion("tertiary <", value, "tertiary");
            return (Criteria) this;
        }

        public Criteria andTertiaryLessThanOrEqualTo(Double value) {
            addCriterion("tertiary <=", value, "tertiary");
            return (Criteria) this;
        }

        public Criteria andTertiaryIn(List<Double> values) {
            addCriterion("tertiary in", values, "tertiary");
            return (Criteria) this;
        }

        public Criteria andTertiaryNotIn(List<Double> values) {
            addCriterion("tertiary not in", values, "tertiary");
            return (Criteria) this;
        }

        public Criteria andTertiaryBetween(Double value1, Double value2) {
            addCriterion("tertiary between", value1, value2, "tertiary");
            return (Criteria) this;
        }

        public Criteria andTertiaryNotBetween(Double value1, Double value2) {
            addCriterion("tertiary not between", value1, value2, "tertiary");
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