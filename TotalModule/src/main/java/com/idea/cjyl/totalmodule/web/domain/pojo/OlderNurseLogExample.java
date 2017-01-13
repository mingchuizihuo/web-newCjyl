package com.idea.cjyl.totalmodule.web.domain.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OlderNurseLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OlderNurseLogExample() {
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

        public Criteria andPhysicalConditionIsNull() {
            addCriterion("physical_condition is null");
            return (Criteria) this;
        }

        public Criteria andPhysicalConditionIsNotNull() {
            addCriterion("physical_condition is not null");
            return (Criteria) this;
        }

        public Criteria andPhysicalConditionEqualTo(String value) {
            addCriterion("physical_condition =", value, "physicalCondition");
            return (Criteria) this;
        }

        public Criteria andPhysicalConditionNotEqualTo(String value) {
            addCriterion("physical_condition <>", value, "physicalCondition");
            return (Criteria) this;
        }

        public Criteria andPhysicalConditionGreaterThan(String value) {
            addCriterion("physical_condition >", value, "physicalCondition");
            return (Criteria) this;
        }

        public Criteria andPhysicalConditionGreaterThanOrEqualTo(String value) {
            addCriterion("physical_condition >=", value, "physicalCondition");
            return (Criteria) this;
        }

        public Criteria andPhysicalConditionLessThan(String value) {
            addCriterion("physical_condition <", value, "physicalCondition");
            return (Criteria) this;
        }

        public Criteria andPhysicalConditionLessThanOrEqualTo(String value) {
            addCriterion("physical_condition <=", value, "physicalCondition");
            return (Criteria) this;
        }

        public Criteria andPhysicalConditionLike(String value) {
            addCriterion("physical_condition like", value, "physicalCondition");
            return (Criteria) this;
        }

        public Criteria andPhysicalConditionNotLike(String value) {
            addCriterion("physical_condition not like", value, "physicalCondition");
            return (Criteria) this;
        }

        public Criteria andPhysicalConditionIn(List<String> values) {
            addCriterion("physical_condition in", values, "physicalCondition");
            return (Criteria) this;
        }

        public Criteria andPhysicalConditionNotIn(List<String> values) {
            addCriterion("physical_condition not in", values, "physicalCondition");
            return (Criteria) this;
        }

        public Criteria andPhysicalConditionBetween(String value1, String value2) {
            addCriterion("physical_condition between", value1, value2, "physicalCondition");
            return (Criteria) this;
        }

        public Criteria andPhysicalConditionNotBetween(String value1, String value2) {
            addCriterion("physical_condition not between", value1, value2, "physicalCondition");
            return (Criteria) this;
        }

        public Criteria andNurseInfoIsNull() {
            addCriterion("nurse_info is null");
            return (Criteria) this;
        }

        public Criteria andNurseInfoIsNotNull() {
            addCriterion("nurse_info is not null");
            return (Criteria) this;
        }

        public Criteria andNurseInfoEqualTo(String value) {
            addCriterion("nurse_info =", value, "nurseInfo");
            return (Criteria) this;
        }

        public Criteria andNurseInfoNotEqualTo(String value) {
            addCriterion("nurse_info <>", value, "nurseInfo");
            return (Criteria) this;
        }

        public Criteria andNurseInfoGreaterThan(String value) {
            addCriterion("nurse_info >", value, "nurseInfo");
            return (Criteria) this;
        }

        public Criteria andNurseInfoGreaterThanOrEqualTo(String value) {
            addCriterion("nurse_info >=", value, "nurseInfo");
            return (Criteria) this;
        }

        public Criteria andNurseInfoLessThan(String value) {
            addCriterion("nurse_info <", value, "nurseInfo");
            return (Criteria) this;
        }

        public Criteria andNurseInfoLessThanOrEqualTo(String value) {
            addCriterion("nurse_info <=", value, "nurseInfo");
            return (Criteria) this;
        }

        public Criteria andNurseInfoLike(String value) {
            addCriterion("nurse_info like", value, "nurseInfo");
            return (Criteria) this;
        }

        public Criteria andNurseInfoNotLike(String value) {
            addCriterion("nurse_info not like", value, "nurseInfo");
            return (Criteria) this;
        }

        public Criteria andNurseInfoIn(List<String> values) {
            addCriterion("nurse_info in", values, "nurseInfo");
            return (Criteria) this;
        }

        public Criteria andNurseInfoNotIn(List<String> values) {
            addCriterion("nurse_info not in", values, "nurseInfo");
            return (Criteria) this;
        }

        public Criteria andNurseInfoBetween(String value1, String value2) {
            addCriterion("nurse_info between", value1, value2, "nurseInfo");
            return (Criteria) this;
        }

        public Criteria andNurseInfoNotBetween(String value1, String value2) {
            addCriterion("nurse_info not between", value1, value2, "nurseInfo");
            return (Criteria) this;
        }

        public Criteria andNurseDateIsNull() {
            addCriterion("nurse_date is null");
            return (Criteria) this;
        }

        public Criteria andNurseDateIsNotNull() {
            addCriterion("nurse_date is not null");
            return (Criteria) this;
        }

        public Criteria andNurseDateEqualTo(Date value) {
            addCriterion("nurse_date =", value, "nurseDate");
            return (Criteria) this;
        }

        public Criteria andNurseDateNotEqualTo(Date value) {
            addCriterion("nurse_date <>", value, "nurseDate");
            return (Criteria) this;
        }

        public Criteria andNurseDateGreaterThan(Date value) {
            addCriterion("nurse_date >", value, "nurseDate");
            return (Criteria) this;
        }

        public Criteria andNurseDateGreaterThanOrEqualTo(Date value) {
            addCriterion("nurse_date >=", value, "nurseDate");
            return (Criteria) this;
        }

        public Criteria andNurseDateLessThan(Date value) {
            addCriterion("nurse_date <", value, "nurseDate");
            return (Criteria) this;
        }

        public Criteria andNurseDateLessThanOrEqualTo(Date value) {
            addCriterion("nurse_date <=", value, "nurseDate");
            return (Criteria) this;
        }

        public Criteria andNurseDateIn(List<Date> values) {
            addCriterion("nurse_date in", values, "nurseDate");
            return (Criteria) this;
        }

        public Criteria andNurseDateNotIn(List<Date> values) {
            addCriterion("nurse_date not in", values, "nurseDate");
            return (Criteria) this;
        }

        public Criteria andNurseDateBetween(Date value1, Date value2) {
            addCriterion("nurse_date between", value1, value2, "nurseDate");
            return (Criteria) this;
        }

        public Criteria andNurseDateNotBetween(Date value1, Date value2) {
            addCriterion("nurse_date not between", value1, value2, "nurseDate");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNull() {
            addCriterion("staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(Long value) {
            addCriterion("staff_id =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(Long value) {
            addCriterion("staff_id <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(Long value) {
            addCriterion("staff_id >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(Long value) {
            addCriterion("staff_id >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(Long value) {
            addCriterion("staff_id <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(Long value) {
            addCriterion("staff_id <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<Long> values) {
            addCriterion("staff_id in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<Long> values) {
            addCriterion("staff_id not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(Long value1, Long value2) {
            addCriterion("staff_id between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(Long value1, Long value2) {
            addCriterion("staff_id not between", value1, value2, "staffId");
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