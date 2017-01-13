package com.idea.cjyl.totalmodule.web.domain.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OlderMonthChargeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OlderMonthChargeExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrganizationLoginIdIsNull() {
            addCriterion("organization_login_id is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationLoginIdIsNotNull() {
            addCriterion("organization_login_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationLoginIdEqualTo(Long value) {
            addCriterion("organization_login_id =", value, "organizationLoginId");
            return (Criteria) this;
        }

        public Criteria andOrganizationLoginIdNotEqualTo(Long value) {
            addCriterion("organization_login_id <>", value, "organizationLoginId");
            return (Criteria) this;
        }

        public Criteria andOrganizationLoginIdGreaterThan(Long value) {
            addCriterion("organization_login_id >", value, "organizationLoginId");
            return (Criteria) this;
        }

        public Criteria andOrganizationLoginIdGreaterThanOrEqualTo(Long value) {
            addCriterion("organization_login_id >=", value, "organizationLoginId");
            return (Criteria) this;
        }

        public Criteria andOrganizationLoginIdLessThan(Long value) {
            addCriterion("organization_login_id <", value, "organizationLoginId");
            return (Criteria) this;
        }

        public Criteria andOrganizationLoginIdLessThanOrEqualTo(Long value) {
            addCriterion("organization_login_id <=", value, "organizationLoginId");
            return (Criteria) this;
        }

        public Criteria andOrganizationLoginIdIn(List<Long> values) {
            addCriterion("organization_login_id in", values, "organizationLoginId");
            return (Criteria) this;
        }

        public Criteria andOrganizationLoginIdNotIn(List<Long> values) {
            addCriterion("organization_login_id not in", values, "organizationLoginId");
            return (Criteria) this;
        }

        public Criteria andOrganizationLoginIdBetween(Long value1, Long value2) {
            addCriterion("organization_login_id between", value1, value2, "organizationLoginId");
            return (Criteria) this;
        }

        public Criteria andOrganizationLoginIdNotBetween(Long value1, Long value2) {
            addCriterion("organization_login_id not between", value1, value2, "organizationLoginId");
            return (Criteria) this;
        }

        public Criteria andOlderIdIsNull() {
            addCriterion("older_id is null");
            return (Criteria) this;
        }

        public Criteria andOlderIdIsNotNull() {
            addCriterion("older_id is not null");
            return (Criteria) this;
        }

        public Criteria andOlderIdEqualTo(Long value) {
            addCriterion("older_id =", value, "olderId");
            return (Criteria) this;
        }

        public Criteria andOlderIdNotEqualTo(Long value) {
            addCriterion("older_id <>", value, "olderId");
            return (Criteria) this;
        }

        public Criteria andOlderIdGreaterThan(Long value) {
            addCriterion("older_id >", value, "olderId");
            return (Criteria) this;
        }

        public Criteria andOlderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("older_id >=", value, "olderId");
            return (Criteria) this;
        }

        public Criteria andOlderIdLessThan(Long value) {
            addCriterion("older_id <", value, "olderId");
            return (Criteria) this;
        }

        public Criteria andOlderIdLessThanOrEqualTo(Long value) {
            addCriterion("older_id <=", value, "olderId");
            return (Criteria) this;
        }

        public Criteria andOlderIdIn(List<Long> values) {
            addCriterion("older_id in", values, "olderId");
            return (Criteria) this;
        }

        public Criteria andOlderIdNotIn(List<Long> values) {
            addCriterion("older_id not in", values, "olderId");
            return (Criteria) this;
        }

        public Criteria andOlderIdBetween(Long value1, Long value2) {
            addCriterion("older_id between", value1, value2, "olderId");
            return (Criteria) this;
        }

        public Criteria andOlderIdNotBetween(Long value1, Long value2) {
            addCriterion("older_id not between", value1, value2, "olderId");
            return (Criteria) this;
        }

        public Criteria andMonthChargeIdIsNull() {
            addCriterion("month_charge_id is null");
            return (Criteria) this;
        }

        public Criteria andMonthChargeIdIsNotNull() {
            addCriterion("month_charge_id is not null");
            return (Criteria) this;
        }

        public Criteria andMonthChargeIdEqualTo(Long value) {
            addCriterion("month_charge_id =", value, "monthChargeId");
            return (Criteria) this;
        }

        public Criteria andMonthChargeIdNotEqualTo(Long value) {
            addCriterion("month_charge_id <>", value, "monthChargeId");
            return (Criteria) this;
        }

        public Criteria andMonthChargeIdGreaterThan(Long value) {
            addCriterion("month_charge_id >", value, "monthChargeId");
            return (Criteria) this;
        }

        public Criteria andMonthChargeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("month_charge_id >=", value, "monthChargeId");
            return (Criteria) this;
        }

        public Criteria andMonthChargeIdLessThan(Long value) {
            addCriterion("month_charge_id <", value, "monthChargeId");
            return (Criteria) this;
        }

        public Criteria andMonthChargeIdLessThanOrEqualTo(Long value) {
            addCriterion("month_charge_id <=", value, "monthChargeId");
            return (Criteria) this;
        }

        public Criteria andMonthChargeIdIn(List<Long> values) {
            addCriterion("month_charge_id in", values, "monthChargeId");
            return (Criteria) this;
        }

        public Criteria andMonthChargeIdNotIn(List<Long> values) {
            addCriterion("month_charge_id not in", values, "monthChargeId");
            return (Criteria) this;
        }

        public Criteria andMonthChargeIdBetween(Long value1, Long value2) {
            addCriterion("month_charge_id between", value1, value2, "monthChargeId");
            return (Criteria) this;
        }

        public Criteria andMonthChargeIdNotBetween(Long value1, Long value2) {
            addCriterion("month_charge_id not between", value1, value2, "monthChargeId");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeDateIsNull() {
            addCriterion("older_month_charge_date is null");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeDateIsNotNull() {
            addCriterion("older_month_charge_date is not null");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeDateEqualTo(Date value) {
            addCriterion("older_month_charge_date =", value, "olderMonthChargeDate");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeDateNotEqualTo(Date value) {
            addCriterion("older_month_charge_date <>", value, "olderMonthChargeDate");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeDateGreaterThan(Date value) {
            addCriterion("older_month_charge_date >", value, "olderMonthChargeDate");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("older_month_charge_date >=", value, "olderMonthChargeDate");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeDateLessThan(Date value) {
            addCriterion("older_month_charge_date <", value, "olderMonthChargeDate");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeDateLessThanOrEqualTo(Date value) {
            addCriterion("older_month_charge_date <=", value, "olderMonthChargeDate");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeDateIn(List<Date> values) {
            addCriterion("older_month_charge_date in", values, "olderMonthChargeDate");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeDateNotIn(List<Date> values) {
            addCriterion("older_month_charge_date not in", values, "olderMonthChargeDate");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeDateBetween(Date value1, Date value2) {
            addCriterion("older_month_charge_date between", value1, value2, "olderMonthChargeDate");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeDateNotBetween(Date value1, Date value2) {
            addCriterion("older_month_charge_date not between", value1, value2, "olderMonthChargeDate");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeEndDateIsNull() {
            addCriterion("older_month_charge_end_date is null");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeEndDateIsNotNull() {
            addCriterion("older_month_charge_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeEndDateEqualTo(Date value) {
            addCriterion("older_month_charge_end_date =", value, "olderMonthChargeEndDate");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeEndDateNotEqualTo(Date value) {
            addCriterion("older_month_charge_end_date <>", value, "olderMonthChargeEndDate");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeEndDateGreaterThan(Date value) {
            addCriterion("older_month_charge_end_date >", value, "olderMonthChargeEndDate");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("older_month_charge_end_date >=", value, "olderMonthChargeEndDate");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeEndDateLessThan(Date value) {
            addCriterion("older_month_charge_end_date <", value, "olderMonthChargeEndDate");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeEndDateLessThanOrEqualTo(Date value) {
            addCriterion("older_month_charge_end_date <=", value, "olderMonthChargeEndDate");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeEndDateIn(List<Date> values) {
            addCriterion("older_month_charge_end_date in", values, "olderMonthChargeEndDate");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeEndDateNotIn(List<Date> values) {
            addCriterion("older_month_charge_end_date not in", values, "olderMonthChargeEndDate");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeEndDateBetween(Date value1, Date value2) {
            addCriterion("older_month_charge_end_date between", value1, value2, "olderMonthChargeEndDate");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeEndDateNotBetween(Date value1, Date value2) {
            addCriterion("older_month_charge_end_date not between", value1, value2, "olderMonthChargeEndDate");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeStateIsNull() {
            addCriterion("older_month_charge_state is null");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeStateIsNotNull() {
            addCriterion("older_month_charge_state is not null");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeStateEqualTo(Long value) {
            addCriterion("older_month_charge_state =", value, "olderMonthChargeState");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeStateNotEqualTo(Long value) {
            addCriterion("older_month_charge_state <>", value, "olderMonthChargeState");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeStateGreaterThan(Long value) {
            addCriterion("older_month_charge_state >", value, "olderMonthChargeState");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeStateGreaterThanOrEqualTo(Long value) {
            addCriterion("older_month_charge_state >=", value, "olderMonthChargeState");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeStateLessThan(Long value) {
            addCriterion("older_month_charge_state <", value, "olderMonthChargeState");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeStateLessThanOrEqualTo(Long value) {
            addCriterion("older_month_charge_state <=", value, "olderMonthChargeState");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeStateIn(List<Long> values) {
            addCriterion("older_month_charge_state in", values, "olderMonthChargeState");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeStateNotIn(List<Long> values) {
            addCriterion("older_month_charge_state not in", values, "olderMonthChargeState");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeStateBetween(Long value1, Long value2) {
            addCriterion("older_month_charge_state between", value1, value2, "olderMonthChargeState");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeStateNotBetween(Long value1, Long value2) {
            addCriterion("older_month_charge_state not between", value1, value2, "olderMonthChargeState");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeEndTypeIsNull() {
            addCriterion("older_month_charge_end_type is null");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeEndTypeIsNotNull() {
            addCriterion("older_month_charge_end_type is not null");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeEndTypeEqualTo(Long value) {
            addCriterion("older_month_charge_end_type =", value, "olderMonthChargeEndType");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeEndTypeNotEqualTo(Long value) {
            addCriterion("older_month_charge_end_type <>", value, "olderMonthChargeEndType");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeEndTypeGreaterThan(Long value) {
            addCriterion("older_month_charge_end_type >", value, "olderMonthChargeEndType");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeEndTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("older_month_charge_end_type >=", value, "olderMonthChargeEndType");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeEndTypeLessThan(Long value) {
            addCriterion("older_month_charge_end_type <", value, "olderMonthChargeEndType");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeEndTypeLessThanOrEqualTo(Long value) {
            addCriterion("older_month_charge_end_type <=", value, "olderMonthChargeEndType");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeEndTypeIn(List<Long> values) {
            addCriterion("older_month_charge_end_type in", values, "olderMonthChargeEndType");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeEndTypeNotIn(List<Long> values) {
            addCriterion("older_month_charge_end_type not in", values, "olderMonthChargeEndType");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeEndTypeBetween(Long value1, Long value2) {
            addCriterion("older_month_charge_end_type between", value1, value2, "olderMonthChargeEndType");
            return (Criteria) this;
        }

        public Criteria andOlderMonthChargeEndTypeNotBetween(Long value1, Long value2) {
            addCriterion("older_month_charge_end_type not between", value1, value2, "olderMonthChargeEndType");
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