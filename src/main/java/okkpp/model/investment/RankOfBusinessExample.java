package okkpp.model.investment;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RankOfBusinessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RankOfBusinessExample() {
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
     * 企业经营环境排名（2017年）
East of Doing Business Rank（2017）
     * 
     * @author wcyong
     * 
     * @date 2018-02-09
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

        public Criteria andYearEqualTo(Integer value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Integer value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Integer value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Integer value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Integer value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Integer> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Integer> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Integer value1, Integer value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Integer value1, Integer value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andBusinessRankIsNull() {
            addCriterion("business_rank is null");
            return (Criteria) this;
        }

        public Criteria andBusinessRankIsNotNull() {
            addCriterion("business_rank is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessRankEqualTo(Integer value) {
            addCriterion("business_rank =", value, "businessRank");
            return (Criteria) this;
        }

        public Criteria andBusinessRankNotEqualTo(Integer value) {
            addCriterion("business_rank <>", value, "businessRank");
            return (Criteria) this;
        }

        public Criteria andBusinessRankGreaterThan(Integer value) {
            addCriterion("business_rank >", value, "businessRank");
            return (Criteria) this;
        }

        public Criteria andBusinessRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_rank >=", value, "businessRank");
            return (Criteria) this;
        }

        public Criteria andBusinessRankLessThan(Integer value) {
            addCriterion("business_rank <", value, "businessRank");
            return (Criteria) this;
        }

        public Criteria andBusinessRankLessThanOrEqualTo(Integer value) {
            addCriterion("business_rank <=", value, "businessRank");
            return (Criteria) this;
        }

        public Criteria andBusinessRankIn(List<Integer> values) {
            addCriterion("business_rank in", values, "businessRank");
            return (Criteria) this;
        }

        public Criteria andBusinessRankNotIn(List<Integer> values) {
            addCriterion("business_rank not in", values, "businessRank");
            return (Criteria) this;
        }

        public Criteria andBusinessRankBetween(Integer value1, Integer value2) {
            addCriterion("business_rank between", value1, value2, "businessRank");
            return (Criteria) this;
        }

        public Criteria andBusinessRankNotBetween(Integer value1, Integer value2) {
            addCriterion("business_rank not between", value1, value2, "businessRank");
            return (Criteria) this;
        }

        public Criteria andStartRankIsNull() {
            addCriterion("start_rank is null");
            return (Criteria) this;
        }

        public Criteria andStartRankIsNotNull() {
            addCriterion("start_rank is not null");
            return (Criteria) this;
        }

        public Criteria andStartRankEqualTo(Integer value) {
            addCriterion("start_rank =", value, "startRank");
            return (Criteria) this;
        }

        public Criteria andStartRankNotEqualTo(Integer value) {
            addCriterion("start_rank <>", value, "startRank");
            return (Criteria) this;
        }

        public Criteria andStartRankGreaterThan(Integer value) {
            addCriterion("start_rank >", value, "startRank");
            return (Criteria) this;
        }

        public Criteria andStartRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("start_rank >=", value, "startRank");
            return (Criteria) this;
        }

        public Criteria andStartRankLessThan(Integer value) {
            addCriterion("start_rank <", value, "startRank");
            return (Criteria) this;
        }

        public Criteria andStartRankLessThanOrEqualTo(Integer value) {
            addCriterion("start_rank <=", value, "startRank");
            return (Criteria) this;
        }

        public Criteria andStartRankIn(List<Integer> values) {
            addCriterion("start_rank in", values, "startRank");
            return (Criteria) this;
        }

        public Criteria andStartRankNotIn(List<Integer> values) {
            addCriterion("start_rank not in", values, "startRank");
            return (Criteria) this;
        }

        public Criteria andStartRankBetween(Integer value1, Integer value2) {
            addCriterion("start_rank between", value1, value2, "startRank");
            return (Criteria) this;
        }

        public Criteria andStartRankNotBetween(Integer value1, Integer value2) {
            addCriterion("start_rank not between", value1, value2, "startRank");
            return (Criteria) this;
        }

        public Criteria andConstructionRankIsNull() {
            addCriterion("construction_rank is null");
            return (Criteria) this;
        }

        public Criteria andConstructionRankIsNotNull() {
            addCriterion("construction_rank is not null");
            return (Criteria) this;
        }

        public Criteria andConstructionRankEqualTo(Integer value) {
            addCriterion("construction_rank =", value, "constructionRank");
            return (Criteria) this;
        }

        public Criteria andConstructionRankNotEqualTo(Integer value) {
            addCriterion("construction_rank <>", value, "constructionRank");
            return (Criteria) this;
        }

        public Criteria andConstructionRankGreaterThan(Integer value) {
            addCriterion("construction_rank >", value, "constructionRank");
            return (Criteria) this;
        }

        public Criteria andConstructionRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("construction_rank >=", value, "constructionRank");
            return (Criteria) this;
        }

        public Criteria andConstructionRankLessThan(Integer value) {
            addCriterion("construction_rank <", value, "constructionRank");
            return (Criteria) this;
        }

        public Criteria andConstructionRankLessThanOrEqualTo(Integer value) {
            addCriterion("construction_rank <=", value, "constructionRank");
            return (Criteria) this;
        }

        public Criteria andConstructionRankIn(List<Integer> values) {
            addCriterion("construction_rank in", values, "constructionRank");
            return (Criteria) this;
        }

        public Criteria andConstructionRankNotIn(List<Integer> values) {
            addCriterion("construction_rank not in", values, "constructionRank");
            return (Criteria) this;
        }

        public Criteria andConstructionRankBetween(Integer value1, Integer value2) {
            addCriterion("construction_rank between", value1, value2, "constructionRank");
            return (Criteria) this;
        }

        public Criteria andConstructionRankNotBetween(Integer value1, Integer value2) {
            addCriterion("construction_rank not between", value1, value2, "constructionRank");
            return (Criteria) this;
        }

        public Criteria andConstructionNumberIsNull() {
            addCriterion("construction_number is null");
            return (Criteria) this;
        }

        public Criteria andConstructionNumberIsNotNull() {
            addCriterion("construction_number is not null");
            return (Criteria) this;
        }

        public Criteria andConstructionNumberEqualTo(Integer value) {
            addCriterion("construction_number =", value, "constructionNumber");
            return (Criteria) this;
        }

        public Criteria andConstructionNumberNotEqualTo(Integer value) {
            addCriterion("construction_number <>", value, "constructionNumber");
            return (Criteria) this;
        }

        public Criteria andConstructionNumberGreaterThan(Integer value) {
            addCriterion("construction_number >", value, "constructionNumber");
            return (Criteria) this;
        }

        public Criteria andConstructionNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("construction_number >=", value, "constructionNumber");
            return (Criteria) this;
        }

        public Criteria andConstructionNumberLessThan(Integer value) {
            addCriterion("construction_number <", value, "constructionNumber");
            return (Criteria) this;
        }

        public Criteria andConstructionNumberLessThanOrEqualTo(Integer value) {
            addCriterion("construction_number <=", value, "constructionNumber");
            return (Criteria) this;
        }

        public Criteria andConstructionNumberIn(List<Integer> values) {
            addCriterion("construction_number in", values, "constructionNumber");
            return (Criteria) this;
        }

        public Criteria andConstructionNumberNotIn(List<Integer> values) {
            addCriterion("construction_number not in", values, "constructionNumber");
            return (Criteria) this;
        }

        public Criteria andConstructionNumberBetween(Integer value1, Integer value2) {
            addCriterion("construction_number between", value1, value2, "constructionNumber");
            return (Criteria) this;
        }

        public Criteria andConstructionNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("construction_number not between", value1, value2, "constructionNumber");
            return (Criteria) this;
        }

        public Criteria andConstructionDaysIsNull() {
            addCriterion("construction_days is null");
            return (Criteria) this;
        }

        public Criteria andConstructionDaysIsNotNull() {
            addCriterion("construction_days is not null");
            return (Criteria) this;
        }

        public Criteria andConstructionDaysEqualTo(Double value) {
            addCriterion("construction_days =", value, "constructionDays");
            return (Criteria) this;
        }

        public Criteria andConstructionDaysNotEqualTo(Double value) {
            addCriterion("construction_days <>", value, "constructionDays");
            return (Criteria) this;
        }

        public Criteria andConstructionDaysGreaterThan(Double value) {
            addCriterion("construction_days >", value, "constructionDays");
            return (Criteria) this;
        }

        public Criteria andConstructionDaysGreaterThanOrEqualTo(Double value) {
            addCriterion("construction_days >=", value, "constructionDays");
            return (Criteria) this;
        }

        public Criteria andConstructionDaysLessThan(Double value) {
            addCriterion("construction_days <", value, "constructionDays");
            return (Criteria) this;
        }

        public Criteria andConstructionDaysLessThanOrEqualTo(Double value) {
            addCriterion("construction_days <=", value, "constructionDays");
            return (Criteria) this;
        }

        public Criteria andConstructionDaysIn(List<Double> values) {
            addCriterion("construction_days in", values, "constructionDays");
            return (Criteria) this;
        }

        public Criteria andConstructionDaysNotIn(List<Double> values) {
            addCriterion("construction_days not in", values, "constructionDays");
            return (Criteria) this;
        }

        public Criteria andConstructionDaysBetween(Double value1, Double value2) {
            addCriterion("construction_days between", value1, value2, "constructionDays");
            return (Criteria) this;
        }

        public Criteria andConstructionDaysNotBetween(Double value1, Double value2) {
            addCriterion("construction_days not between", value1, value2, "constructionDays");
            return (Criteria) this;
        }

        public Criteria andPropertyRankIsNull() {
            addCriterion("property_rank is null");
            return (Criteria) this;
        }

        public Criteria andPropertyRankIsNotNull() {
            addCriterion("property_rank is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyRankEqualTo(Integer value) {
            addCriterion("property_rank =", value, "propertyRank");
            return (Criteria) this;
        }

        public Criteria andPropertyRankNotEqualTo(Integer value) {
            addCriterion("property_rank <>", value, "propertyRank");
            return (Criteria) this;
        }

        public Criteria andPropertyRankGreaterThan(Integer value) {
            addCriterion("property_rank >", value, "propertyRank");
            return (Criteria) this;
        }

        public Criteria andPropertyRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("property_rank >=", value, "propertyRank");
            return (Criteria) this;
        }

        public Criteria andPropertyRankLessThan(Integer value) {
            addCriterion("property_rank <", value, "propertyRank");
            return (Criteria) this;
        }

        public Criteria andPropertyRankLessThanOrEqualTo(Integer value) {
            addCriterion("property_rank <=", value, "propertyRank");
            return (Criteria) this;
        }

        public Criteria andPropertyRankIn(List<Integer> values) {
            addCriterion("property_rank in", values, "propertyRank");
            return (Criteria) this;
        }

        public Criteria andPropertyRankNotIn(List<Integer> values) {
            addCriterion("property_rank not in", values, "propertyRank");
            return (Criteria) this;
        }

        public Criteria andPropertyRankBetween(Integer value1, Integer value2) {
            addCriterion("property_rank between", value1, value2, "propertyRank");
            return (Criteria) this;
        }

        public Criteria andPropertyRankNotBetween(Integer value1, Integer value2) {
            addCriterion("property_rank not between", value1, value2, "propertyRank");
            return (Criteria) this;
        }

        public Criteria andPropertyNumberIsNull() {
            addCriterion("property_number is null");
            return (Criteria) this;
        }

        public Criteria andPropertyNumberIsNotNull() {
            addCriterion("property_number is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyNumberEqualTo(Integer value) {
            addCriterion("property_number =", value, "propertyNumber");
            return (Criteria) this;
        }

        public Criteria andPropertyNumberNotEqualTo(Integer value) {
            addCriterion("property_number <>", value, "propertyNumber");
            return (Criteria) this;
        }

        public Criteria andPropertyNumberGreaterThan(Integer value) {
            addCriterion("property_number >", value, "propertyNumber");
            return (Criteria) this;
        }

        public Criteria andPropertyNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("property_number >=", value, "propertyNumber");
            return (Criteria) this;
        }

        public Criteria andPropertyNumberLessThan(Integer value) {
            addCriterion("property_number <", value, "propertyNumber");
            return (Criteria) this;
        }

        public Criteria andPropertyNumberLessThanOrEqualTo(Integer value) {
            addCriterion("property_number <=", value, "propertyNumber");
            return (Criteria) this;
        }

        public Criteria andPropertyNumberIn(List<Integer> values) {
            addCriterion("property_number in", values, "propertyNumber");
            return (Criteria) this;
        }

        public Criteria andPropertyNumberNotIn(List<Integer> values) {
            addCriterion("property_number not in", values, "propertyNumber");
            return (Criteria) this;
        }

        public Criteria andPropertyNumberBetween(Integer value1, Integer value2) {
            addCriterion("property_number between", value1, value2, "propertyNumber");
            return (Criteria) this;
        }

        public Criteria andPropertyNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("property_number not between", value1, value2, "propertyNumber");
            return (Criteria) this;
        }

        public Criteria andPropertyDaysIsNull() {
            addCriterion("property_days is null");
            return (Criteria) this;
        }

        public Criteria andPropertyDaysIsNotNull() {
            addCriterion("property_days is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyDaysEqualTo(Double value) {
            addCriterion("property_days =", value, "propertyDays");
            return (Criteria) this;
        }

        public Criteria andPropertyDaysNotEqualTo(Double value) {
            addCriterion("property_days <>", value, "propertyDays");
            return (Criteria) this;
        }

        public Criteria andPropertyDaysGreaterThan(Double value) {
            addCriterion("property_days >", value, "propertyDays");
            return (Criteria) this;
        }

        public Criteria andPropertyDaysGreaterThanOrEqualTo(Double value) {
            addCriterion("property_days >=", value, "propertyDays");
            return (Criteria) this;
        }

        public Criteria andPropertyDaysLessThan(Double value) {
            addCriterion("property_days <", value, "propertyDays");
            return (Criteria) this;
        }

        public Criteria andPropertyDaysLessThanOrEqualTo(Double value) {
            addCriterion("property_days <=", value, "propertyDays");
            return (Criteria) this;
        }

        public Criteria andPropertyDaysIn(List<Double> values) {
            addCriterion("property_days in", values, "propertyDays");
            return (Criteria) this;
        }

        public Criteria andPropertyDaysNotIn(List<Double> values) {
            addCriterion("property_days not in", values, "propertyDays");
            return (Criteria) this;
        }

        public Criteria andPropertyDaysBetween(Double value1, Double value2) {
            addCriterion("property_days between", value1, value2, "propertyDays");
            return (Criteria) this;
        }

        public Criteria andPropertyDaysNotBetween(Double value1, Double value2) {
            addCriterion("property_days not between", value1, value2, "propertyDays");
            return (Criteria) this;
        }

        public Criteria andCreditRankIsNull() {
            addCriterion("credit_rank is null");
            return (Criteria) this;
        }

        public Criteria andCreditRankIsNotNull() {
            addCriterion("credit_rank is not null");
            return (Criteria) this;
        }

        public Criteria andCreditRankEqualTo(Integer value) {
            addCriterion("credit_rank =", value, "creditRank");
            return (Criteria) this;
        }

        public Criteria andCreditRankNotEqualTo(Integer value) {
            addCriterion("credit_rank <>", value, "creditRank");
            return (Criteria) this;
        }

        public Criteria andCreditRankGreaterThan(Integer value) {
            addCriterion("credit_rank >", value, "creditRank");
            return (Criteria) this;
        }

        public Criteria andCreditRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("credit_rank >=", value, "creditRank");
            return (Criteria) this;
        }

        public Criteria andCreditRankLessThan(Integer value) {
            addCriterion("credit_rank <", value, "creditRank");
            return (Criteria) this;
        }

        public Criteria andCreditRankLessThanOrEqualTo(Integer value) {
            addCriterion("credit_rank <=", value, "creditRank");
            return (Criteria) this;
        }

        public Criteria andCreditRankIn(List<Integer> values) {
            addCriterion("credit_rank in", values, "creditRank");
            return (Criteria) this;
        }

        public Criteria andCreditRankNotIn(List<Integer> values) {
            addCriterion("credit_rank not in", values, "creditRank");
            return (Criteria) this;
        }

        public Criteria andCreditRankBetween(Integer value1, Integer value2) {
            addCriterion("credit_rank between", value1, value2, "creditRank");
            return (Criteria) this;
        }

        public Criteria andCreditRankNotBetween(Integer value1, Integer value2) {
            addCriterion("credit_rank not between", value1, value2, "creditRank");
            return (Criteria) this;
        }

        public Criteria andTaxesRankIsNull() {
            addCriterion("taxes_rank is null");
            return (Criteria) this;
        }

        public Criteria andTaxesRankIsNotNull() {
            addCriterion("taxes_rank is not null");
            return (Criteria) this;
        }

        public Criteria andTaxesRankEqualTo(Integer value) {
            addCriterion("taxes_rank =", value, "taxesRank");
            return (Criteria) this;
        }

        public Criteria andTaxesRankNotEqualTo(Integer value) {
            addCriterion("taxes_rank <>", value, "taxesRank");
            return (Criteria) this;
        }

        public Criteria andTaxesRankGreaterThan(Integer value) {
            addCriterion("taxes_rank >", value, "taxesRank");
            return (Criteria) this;
        }

        public Criteria andTaxesRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("taxes_rank >=", value, "taxesRank");
            return (Criteria) this;
        }

        public Criteria andTaxesRankLessThan(Integer value) {
            addCriterion("taxes_rank <", value, "taxesRank");
            return (Criteria) this;
        }

        public Criteria andTaxesRankLessThanOrEqualTo(Integer value) {
            addCriterion("taxes_rank <=", value, "taxesRank");
            return (Criteria) this;
        }

        public Criteria andTaxesRankIn(List<Integer> values) {
            addCriterion("taxes_rank in", values, "taxesRank");
            return (Criteria) this;
        }

        public Criteria andTaxesRankNotIn(List<Integer> values) {
            addCriterion("taxes_rank not in", values, "taxesRank");
            return (Criteria) this;
        }

        public Criteria andTaxesRankBetween(Integer value1, Integer value2) {
            addCriterion("taxes_rank between", value1, value2, "taxesRank");
            return (Criteria) this;
        }

        public Criteria andTaxesRankNotBetween(Integer value1, Integer value2) {
            addCriterion("taxes_rank not between", value1, value2, "taxesRank");
            return (Criteria) this;
        }

        public Criteria andInvestorsRankIsNull() {
            addCriterion("investors_rank is null");
            return (Criteria) this;
        }

        public Criteria andInvestorsRankIsNotNull() {
            addCriterion("investors_rank is not null");
            return (Criteria) this;
        }

        public Criteria andInvestorsRankEqualTo(Integer value) {
            addCriterion("investors_rank =", value, "investorsRank");
            return (Criteria) this;
        }

        public Criteria andInvestorsRankNotEqualTo(Integer value) {
            addCriterion("investors_rank <>", value, "investorsRank");
            return (Criteria) this;
        }

        public Criteria andInvestorsRankGreaterThan(Integer value) {
            addCriterion("investors_rank >", value, "investorsRank");
            return (Criteria) this;
        }

        public Criteria andInvestorsRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("investors_rank >=", value, "investorsRank");
            return (Criteria) this;
        }

        public Criteria andInvestorsRankLessThan(Integer value) {
            addCriterion("investors_rank <", value, "investorsRank");
            return (Criteria) this;
        }

        public Criteria andInvestorsRankLessThanOrEqualTo(Integer value) {
            addCriterion("investors_rank <=", value, "investorsRank");
            return (Criteria) this;
        }

        public Criteria andInvestorsRankIn(List<Integer> values) {
            addCriterion("investors_rank in", values, "investorsRank");
            return (Criteria) this;
        }

        public Criteria andInvestorsRankNotIn(List<Integer> values) {
            addCriterion("investors_rank not in", values, "investorsRank");
            return (Criteria) this;
        }

        public Criteria andInvestorsRankBetween(Integer value1, Integer value2) {
            addCriterion("investors_rank between", value1, value2, "investorsRank");
            return (Criteria) this;
        }

        public Criteria andInvestorsRankNotBetween(Integer value1, Integer value2) {
            addCriterion("investors_rank not between", value1, value2, "investorsRank");
            return (Criteria) this;
        }

        public Criteria andInvestorsIndexIsNull() {
            addCriterion("investors_index is null");
            return (Criteria) this;
        }

        public Criteria andInvestorsIndexIsNotNull() {
            addCriterion("investors_index is not null");
            return (Criteria) this;
        }

        public Criteria andInvestorsIndexEqualTo(Double value) {
            addCriterion("investors_index =", value, "investorsIndex");
            return (Criteria) this;
        }

        public Criteria andInvestorsIndexNotEqualTo(Double value) {
            addCriterion("investors_index <>", value, "investorsIndex");
            return (Criteria) this;
        }

        public Criteria andInvestorsIndexGreaterThan(Double value) {
            addCriterion("investors_index >", value, "investorsIndex");
            return (Criteria) this;
        }

        public Criteria andInvestorsIndexGreaterThanOrEqualTo(Double value) {
            addCriterion("investors_index >=", value, "investorsIndex");
            return (Criteria) this;
        }

        public Criteria andInvestorsIndexLessThan(Double value) {
            addCriterion("investors_index <", value, "investorsIndex");
            return (Criteria) this;
        }

        public Criteria andInvestorsIndexLessThanOrEqualTo(Double value) {
            addCriterion("investors_index <=", value, "investorsIndex");
            return (Criteria) this;
        }

        public Criteria andInvestorsIndexIn(List<Double> values) {
            addCriterion("investors_index in", values, "investorsIndex");
            return (Criteria) this;
        }

        public Criteria andInvestorsIndexNotIn(List<Double> values) {
            addCriterion("investors_index not in", values, "investorsIndex");
            return (Criteria) this;
        }

        public Criteria andInvestorsIndexBetween(Double value1, Double value2) {
            addCriterion("investors_index between", value1, value2, "investorsIndex");
            return (Criteria) this;
        }

        public Criteria andInvestorsIndexNotBetween(Double value1, Double value2) {
            addCriterion("investors_index not between", value1, value2, "investorsIndex");
            return (Criteria) this;
        }

        public Criteria andTradingRankIsNull() {
            addCriterion("trading_rank is null");
            return (Criteria) this;
        }

        public Criteria andTradingRankIsNotNull() {
            addCriterion("trading_rank is not null");
            return (Criteria) this;
        }

        public Criteria andTradingRankEqualTo(Integer value) {
            addCriterion("trading_rank =", value, "tradingRank");
            return (Criteria) this;
        }

        public Criteria andTradingRankNotEqualTo(Integer value) {
            addCriterion("trading_rank <>", value, "tradingRank");
            return (Criteria) this;
        }

        public Criteria andTradingRankGreaterThan(Integer value) {
            addCriterion("trading_rank >", value, "tradingRank");
            return (Criteria) this;
        }

        public Criteria andTradingRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("trading_rank >=", value, "tradingRank");
            return (Criteria) this;
        }

        public Criteria andTradingRankLessThan(Integer value) {
            addCriterion("trading_rank <", value, "tradingRank");
            return (Criteria) this;
        }

        public Criteria andTradingRankLessThanOrEqualTo(Integer value) {
            addCriterion("trading_rank <=", value, "tradingRank");
            return (Criteria) this;
        }

        public Criteria andTradingRankIn(List<Integer> values) {
            addCriterion("trading_rank in", values, "tradingRank");
            return (Criteria) this;
        }

        public Criteria andTradingRankNotIn(List<Integer> values) {
            addCriterion("trading_rank not in", values, "tradingRank");
            return (Criteria) this;
        }

        public Criteria andTradingRankBetween(Integer value1, Integer value2) {
            addCriterion("trading_rank between", value1, value2, "tradingRank");
            return (Criteria) this;
        }

        public Criteria andTradingRankNotBetween(Integer value1, Integer value2) {
            addCriterion("trading_rank not between", value1, value2, "tradingRank");
            return (Criteria) this;
        }

        public Criteria andContractsRankIsNull() {
            addCriterion("contracts_rank is null");
            return (Criteria) this;
        }

        public Criteria andContractsRankIsNotNull() {
            addCriterion("contracts_rank is not null");
            return (Criteria) this;
        }

        public Criteria andContractsRankEqualTo(Integer value) {
            addCriterion("contracts_rank =", value, "contractsRank");
            return (Criteria) this;
        }

        public Criteria andContractsRankNotEqualTo(Integer value) {
            addCriterion("contracts_rank <>", value, "contractsRank");
            return (Criteria) this;
        }

        public Criteria andContractsRankGreaterThan(Integer value) {
            addCriterion("contracts_rank >", value, "contractsRank");
            return (Criteria) this;
        }

        public Criteria andContractsRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("contracts_rank >=", value, "contractsRank");
            return (Criteria) this;
        }

        public Criteria andContractsRankLessThan(Integer value) {
            addCriterion("contracts_rank <", value, "contractsRank");
            return (Criteria) this;
        }

        public Criteria andContractsRankLessThanOrEqualTo(Integer value) {
            addCriterion("contracts_rank <=", value, "contractsRank");
            return (Criteria) this;
        }

        public Criteria andContractsRankIn(List<Integer> values) {
            addCriterion("contracts_rank in", values, "contractsRank");
            return (Criteria) this;
        }

        public Criteria andContractsRankNotIn(List<Integer> values) {
            addCriterion("contracts_rank not in", values, "contractsRank");
            return (Criteria) this;
        }

        public Criteria andContractsRankBetween(Integer value1, Integer value2) {
            addCriterion("contracts_rank between", value1, value2, "contractsRank");
            return (Criteria) this;
        }

        public Criteria andContractsRankNotBetween(Integer value1, Integer value2) {
            addCriterion("contracts_rank not between", value1, value2, "contractsRank");
            return (Criteria) this;
        }

        public Criteria andContractsDaysIsNull() {
            addCriterion("contracts_days is null");
            return (Criteria) this;
        }

        public Criteria andContractsDaysIsNotNull() {
            addCriterion("contracts_days is not null");
            return (Criteria) this;
        }

        public Criteria andContractsDaysEqualTo(Double value) {
            addCriterion("contracts_days =", value, "contractsDays");
            return (Criteria) this;
        }

        public Criteria andContractsDaysNotEqualTo(Double value) {
            addCriterion("contracts_days <>", value, "contractsDays");
            return (Criteria) this;
        }

        public Criteria andContractsDaysGreaterThan(Double value) {
            addCriterion("contracts_days >", value, "contractsDays");
            return (Criteria) this;
        }

        public Criteria andContractsDaysGreaterThanOrEqualTo(Double value) {
            addCriterion("contracts_days >=", value, "contractsDays");
            return (Criteria) this;
        }

        public Criteria andContractsDaysLessThan(Double value) {
            addCriterion("contracts_days <", value, "contractsDays");
            return (Criteria) this;
        }

        public Criteria andContractsDaysLessThanOrEqualTo(Double value) {
            addCriterion("contracts_days <=", value, "contractsDays");
            return (Criteria) this;
        }

        public Criteria andContractsDaysIn(List<Double> values) {
            addCriterion("contracts_days in", values, "contractsDays");
            return (Criteria) this;
        }

        public Criteria andContractsDaysNotIn(List<Double> values) {
            addCriterion("contracts_days not in", values, "contractsDays");
            return (Criteria) this;
        }

        public Criteria andContractsDaysBetween(Double value1, Double value2) {
            addCriterion("contracts_days between", value1, value2, "contractsDays");
            return (Criteria) this;
        }

        public Criteria andContractsDaysNotBetween(Double value1, Double value2) {
            addCriterion("contracts_days not between", value1, value2, "contractsDays");
            return (Criteria) this;
        }

        public Criteria andInsolvencyRankIsNull() {
            addCriterion("insolvency_rank is null");
            return (Criteria) this;
        }

        public Criteria andInsolvencyRankIsNotNull() {
            addCriterion("insolvency_rank is not null");
            return (Criteria) this;
        }

        public Criteria andInsolvencyRankEqualTo(Integer value) {
            addCriterion("insolvency_rank =", value, "insolvencyRank");
            return (Criteria) this;
        }

        public Criteria andInsolvencyRankNotEqualTo(Integer value) {
            addCriterion("insolvency_rank <>", value, "insolvencyRank");
            return (Criteria) this;
        }

        public Criteria andInsolvencyRankGreaterThan(Integer value) {
            addCriterion("insolvency_rank >", value, "insolvencyRank");
            return (Criteria) this;
        }

        public Criteria andInsolvencyRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("insolvency_rank >=", value, "insolvencyRank");
            return (Criteria) this;
        }

        public Criteria andInsolvencyRankLessThan(Integer value) {
            addCriterion("insolvency_rank <", value, "insolvencyRank");
            return (Criteria) this;
        }

        public Criteria andInsolvencyRankLessThanOrEqualTo(Integer value) {
            addCriterion("insolvency_rank <=", value, "insolvencyRank");
            return (Criteria) this;
        }

        public Criteria andInsolvencyRankIn(List<Integer> values) {
            addCriterion("insolvency_rank in", values, "insolvencyRank");
            return (Criteria) this;
        }

        public Criteria andInsolvencyRankNotIn(List<Integer> values) {
            addCriterion("insolvency_rank not in", values, "insolvencyRank");
            return (Criteria) this;
        }

        public Criteria andInsolvencyRankBetween(Integer value1, Integer value2) {
            addCriterion("insolvency_rank between", value1, value2, "insolvencyRank");
            return (Criteria) this;
        }

        public Criteria andInsolvencyRankNotBetween(Integer value1, Integer value2) {
            addCriterion("insolvency_rank not between", value1, value2, "insolvencyRank");
            return (Criteria) this;
        }

        public Criteria andInsolcenvyDaysIsNull() {
            addCriterion("insolcenvy_days is null");
            return (Criteria) this;
        }

        public Criteria andInsolcenvyDaysIsNotNull() {
            addCriterion("insolcenvy_days is not null");
            return (Criteria) this;
        }

        public Criteria andInsolcenvyDaysEqualTo(Double value) {
            addCriterion("insolcenvy_days =", value, "insolcenvyDays");
            return (Criteria) this;
        }

        public Criteria andInsolcenvyDaysNotEqualTo(Double value) {
            addCriterion("insolcenvy_days <>", value, "insolcenvyDays");
            return (Criteria) this;
        }

        public Criteria andInsolcenvyDaysGreaterThan(Double value) {
            addCriterion("insolcenvy_days >", value, "insolcenvyDays");
            return (Criteria) this;
        }

        public Criteria andInsolcenvyDaysGreaterThanOrEqualTo(Double value) {
            addCriterion("insolcenvy_days >=", value, "insolcenvyDays");
            return (Criteria) this;
        }

        public Criteria andInsolcenvyDaysLessThan(Double value) {
            addCriterion("insolcenvy_days <", value, "insolcenvyDays");
            return (Criteria) this;
        }

        public Criteria andInsolcenvyDaysLessThanOrEqualTo(Double value) {
            addCriterion("insolcenvy_days <=", value, "insolcenvyDays");
            return (Criteria) this;
        }

        public Criteria andInsolcenvyDaysIn(List<Double> values) {
            addCriterion("insolcenvy_days in", values, "insolcenvyDays");
            return (Criteria) this;
        }

        public Criteria andInsolcenvyDaysNotIn(List<Double> values) {
            addCriterion("insolcenvy_days not in", values, "insolcenvyDays");
            return (Criteria) this;
        }

        public Criteria andInsolcenvyDaysBetween(Double value1, Double value2) {
            addCriterion("insolcenvy_days between", value1, value2, "insolcenvyDays");
            return (Criteria) this;
        }

        public Criteria andInsolcenvyDaysNotBetween(Double value1, Double value2) {
            addCriterion("insolcenvy_days not between", value1, value2, "insolcenvyDays");
            return (Criteria) this;
        }

        public Criteria andInsolvencyRateIsNull() {
            addCriterion("insolvency_rate is null");
            return (Criteria) this;
        }

        public Criteria andInsolvencyRateIsNotNull() {
            addCriterion("insolvency_rate is not null");
            return (Criteria) this;
        }

        public Criteria andInsolvencyRateEqualTo(Double value) {
            addCriterion("insolvency_rate =", value, "insolvencyRate");
            return (Criteria) this;
        }

        public Criteria andInsolvencyRateNotEqualTo(Double value) {
            addCriterion("insolvency_rate <>", value, "insolvencyRate");
            return (Criteria) this;
        }

        public Criteria andInsolvencyRateGreaterThan(Double value) {
            addCriterion("insolvency_rate >", value, "insolvencyRate");
            return (Criteria) this;
        }

        public Criteria andInsolvencyRateGreaterThanOrEqualTo(Double value) {
            addCriterion("insolvency_rate >=", value, "insolvencyRate");
            return (Criteria) this;
        }

        public Criteria andInsolvencyRateLessThan(Double value) {
            addCriterion("insolvency_rate <", value, "insolvencyRate");
            return (Criteria) this;
        }

        public Criteria andInsolvencyRateLessThanOrEqualTo(Double value) {
            addCriterion("insolvency_rate <=", value, "insolvencyRate");
            return (Criteria) this;
        }

        public Criteria andInsolvencyRateIn(List<Double> values) {
            addCriterion("insolvency_rate in", values, "insolvencyRate");
            return (Criteria) this;
        }

        public Criteria andInsolvencyRateNotIn(List<Double> values) {
            addCriterion("insolvency_rate not in", values, "insolvencyRate");
            return (Criteria) this;
        }

        public Criteria andInsolvencyRateBetween(Double value1, Double value2) {
            addCriterion("insolvency_rate between", value1, value2, "insolvencyRate");
            return (Criteria) this;
        }

        public Criteria andInsolvencyRateNotBetween(Double value1, Double value2) {
            addCriterion("insolvency_rate not between", value1, value2, "insolvencyRate");
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
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 企业经营环境排名（2017年）
East of Doing Business Rank（2017）
     * 
     * @author wcyong
     * 
     * @date 2018-02-09
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