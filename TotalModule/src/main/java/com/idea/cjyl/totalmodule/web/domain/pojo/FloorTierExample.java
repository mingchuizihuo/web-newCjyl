package com.idea.cjyl.totalmodule.web.domain.pojo;

import java.util.ArrayList;
import java.util.List;

public class FloorTierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FloorTierExample() {
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

        public Criteria andMansionIdIsNull() {
            addCriterion("mansion_id is null");
            return (Criteria) this;
        }

        public Criteria andMansionIdIsNotNull() {
            addCriterion("mansion_id is not null");
            return (Criteria) this;
        }

        public Criteria andMansionIdEqualTo(Long value) {
            addCriterion("mansion_id =", value, "mansionId");
            return (Criteria) this;
        }

        public Criteria andMansionIdNotEqualTo(Long value) {
            addCriterion("mansion_id <>", value, "mansionId");
            return (Criteria) this;
        }

        public Criteria andMansionIdGreaterThan(Long value) {
            addCriterion("mansion_id >", value, "mansionId");
            return (Criteria) this;
        }

        public Criteria andMansionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("mansion_id >=", value, "mansionId");
            return (Criteria) this;
        }

        public Criteria andMansionIdLessThan(Long value) {
            addCriterion("mansion_id <", value, "mansionId");
            return (Criteria) this;
        }

        public Criteria andMansionIdLessThanOrEqualTo(Long value) {
            addCriterion("mansion_id <=", value, "mansionId");
            return (Criteria) this;
        }

        public Criteria andMansionIdIn(List<Long> values) {
            addCriterion("mansion_id in", values, "mansionId");
            return (Criteria) this;
        }

        public Criteria andMansionIdNotIn(List<Long> values) {
            addCriterion("mansion_id not in", values, "mansionId");
            return (Criteria) this;
        }

        public Criteria andMansionIdBetween(Long value1, Long value2) {
            addCriterion("mansion_id between", value1, value2, "mansionId");
            return (Criteria) this;
        }

        public Criteria andMansionIdNotBetween(Long value1, Long value2) {
            addCriterion("mansion_id not between", value1, value2, "mansionId");
            return (Criteria) this;
        }

        public Criteria andFloorTierIsNull() {
            addCriterion("floor_tier is null");
            return (Criteria) this;
        }

        public Criteria andFloorTierIsNotNull() {
            addCriterion("floor_tier is not null");
            return (Criteria) this;
        }

        public Criteria andFloorTierEqualTo(String value) {
            addCriterion("floor_tier =", value, "floorTier");
            return (Criteria) this;
        }

        public Criteria andFloorTierNotEqualTo(String value) {
            addCriterion("floor_tier <>", value, "floorTier");
            return (Criteria) this;
        }

        public Criteria andFloorTierGreaterThan(String value) {
            addCriterion("floor_tier >", value, "floorTier");
            return (Criteria) this;
        }

        public Criteria andFloorTierGreaterThanOrEqualTo(String value) {
            addCriterion("floor_tier >=", value, "floorTier");
            return (Criteria) this;
        }

        public Criteria andFloorTierLessThan(String value) {
            addCriterion("floor_tier <", value, "floorTier");
            return (Criteria) this;
        }

        public Criteria andFloorTierLessThanOrEqualTo(String value) {
            addCriterion("floor_tier <=", value, "floorTier");
            return (Criteria) this;
        }

        public Criteria andFloorTierLike(String value) {
            addCriterion("floor_tier like", value, "floorTier");
            return (Criteria) this;
        }

        public Criteria andFloorTierNotLike(String value) {
            addCriterion("floor_tier not like", value, "floorTier");
            return (Criteria) this;
        }

        public Criteria andFloorTierIn(List<String> values) {
            addCriterion("floor_tier in", values, "floorTier");
            return (Criteria) this;
        }

        public Criteria andFloorTierNotIn(List<String> values) {
            addCriterion("floor_tier not in", values, "floorTier");
            return (Criteria) this;
        }

        public Criteria andFloorTierBetween(String value1, String value2) {
            addCriterion("floor_tier between", value1, value2, "floorTier");
            return (Criteria) this;
        }

        public Criteria andFloorTierNotBetween(String value1, String value2) {
            addCriterion("floor_tier not between", value1, value2, "floorTier");
            return (Criteria) this;
        }

        public Criteria andAccountForIsNull() {
            addCriterion("account_for is null");
            return (Criteria) this;
        }

        public Criteria andAccountForIsNotNull() {
            addCriterion("account_for is not null");
            return (Criteria) this;
        }

        public Criteria andAccountForEqualTo(String value) {
            addCriterion("account_for =", value, "accountFor");
            return (Criteria) this;
        }

        public Criteria andAccountForNotEqualTo(String value) {
            addCriterion("account_for <>", value, "accountFor");
            return (Criteria) this;
        }

        public Criteria andAccountForGreaterThan(String value) {
            addCriterion("account_for >", value, "accountFor");
            return (Criteria) this;
        }

        public Criteria andAccountForGreaterThanOrEqualTo(String value) {
            addCriterion("account_for >=", value, "accountFor");
            return (Criteria) this;
        }

        public Criteria andAccountForLessThan(String value) {
            addCriterion("account_for <", value, "accountFor");
            return (Criteria) this;
        }

        public Criteria andAccountForLessThanOrEqualTo(String value) {
            addCriterion("account_for <=", value, "accountFor");
            return (Criteria) this;
        }

        public Criteria andAccountForLike(String value) {
            addCriterion("account_for like", value, "accountFor");
            return (Criteria) this;
        }

        public Criteria andAccountForNotLike(String value) {
            addCriterion("account_for not like", value, "accountFor");
            return (Criteria) this;
        }

        public Criteria andAccountForIn(List<String> values) {
            addCriterion("account_for in", values, "accountFor");
            return (Criteria) this;
        }

        public Criteria andAccountForNotIn(List<String> values) {
            addCriterion("account_for not in", values, "accountFor");
            return (Criteria) this;
        }

        public Criteria andAccountForBetween(String value1, String value2) {
            addCriterion("account_for between", value1, value2, "accountFor");
            return (Criteria) this;
        }

        public Criteria andAccountForNotBetween(String value1, String value2) {
            addCriterion("account_for not between", value1, value2, "accountFor");
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