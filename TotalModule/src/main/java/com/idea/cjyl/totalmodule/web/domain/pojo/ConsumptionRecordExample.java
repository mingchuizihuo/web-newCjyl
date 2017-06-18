package com.idea.cjyl.totalmodule.web.domain.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConsumptionRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConsumptionRecordExample() {
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

        public Criteria andUserSaivianIdIsNull() {
            addCriterion("user_saivian_id is null");
            return (Criteria) this;
        }

        public Criteria andUserSaivianIdIsNotNull() {
            addCriterion("user_saivian_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserSaivianIdEqualTo(Long value) {
            addCriterion("user_saivian_id =", value, "userSaivianId");
            return (Criteria) this;
        }

        public Criteria andUserSaivianIdNotEqualTo(Long value) {
            addCriterion("user_saivian_id <>", value, "userSaivianId");
            return (Criteria) this;
        }

        public Criteria andUserSaivianIdGreaterThan(Long value) {
            addCriterion("user_saivian_id >", value, "userSaivianId");
            return (Criteria) this;
        }

        public Criteria andUserSaivianIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_saivian_id >=", value, "userSaivianId");
            return (Criteria) this;
        }

        public Criteria andUserSaivianIdLessThan(Long value) {
            addCriterion("user_saivian_id <", value, "userSaivianId");
            return (Criteria) this;
        }

        public Criteria andUserSaivianIdLessThanOrEqualTo(Long value) {
            addCriterion("user_saivian_id <=", value, "userSaivianId");
            return (Criteria) this;
        }

        public Criteria andUserSaivianIdIn(List<Long> values) {
            addCriterion("user_saivian_id in", values, "userSaivianId");
            return (Criteria) this;
        }

        public Criteria andUserSaivianIdNotIn(List<Long> values) {
            addCriterion("user_saivian_id not in", values, "userSaivianId");
            return (Criteria) this;
        }

        public Criteria andUserSaivianIdBetween(Long value1, Long value2) {
            addCriterion("user_saivian_id between", value1, value2, "userSaivianId");
            return (Criteria) this;
        }

        public Criteria andUserSaivianIdNotBetween(Long value1, Long value2) {
            addCriterion("user_saivian_id not between", value1, value2, "userSaivianId");
            return (Criteria) this;
        }

        public Criteria andConsumeDateIsNull() {
            addCriterion("consume_date is null");
            return (Criteria) this;
        }

        public Criteria andConsumeDateIsNotNull() {
            addCriterion("consume_date is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeDateEqualTo(Date value) {
            addCriterion("consume_date =", value, "consumeDate");
            return (Criteria) this;
        }

        public Criteria andConsumeDateNotEqualTo(Date value) {
            addCriterion("consume_date <>", value, "consumeDate");
            return (Criteria) this;
        }

        public Criteria andConsumeDateGreaterThan(Date value) {
            addCriterion("consume_date >", value, "consumeDate");
            return (Criteria) this;
        }

        public Criteria andConsumeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("consume_date >=", value, "consumeDate");
            return (Criteria) this;
        }

        public Criteria andConsumeDateLessThan(Date value) {
            addCriterion("consume_date <", value, "consumeDate");
            return (Criteria) this;
        }

        public Criteria andConsumeDateLessThanOrEqualTo(Date value) {
            addCriterion("consume_date <=", value, "consumeDate");
            return (Criteria) this;
        }

        public Criteria andConsumeDateIn(List<Date> values) {
            addCriterion("consume_date in", values, "consumeDate");
            return (Criteria) this;
        }

        public Criteria andConsumeDateNotIn(List<Date> values) {
            addCriterion("consume_date not in", values, "consumeDate");
            return (Criteria) this;
        }

        public Criteria andConsumeDateBetween(Date value1, Date value2) {
            addCriterion("consume_date between", value1, value2, "consumeDate");
            return (Criteria) this;
        }

        public Criteria andConsumeDateNotBetween(Date value1, Date value2) {
            addCriterion("consume_date not between", value1, value2, "consumeDate");
            return (Criteria) this;
        }

        public Criteria andConsumeMoneyIsNull() {
            addCriterion("consume_money is null");
            return (Criteria) this;
        }

        public Criteria andConsumeMoneyIsNotNull() {
            addCriterion("consume_money is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeMoneyEqualTo(String value) {
            addCriterion("consume_money =", value, "consumeMoney");
            return (Criteria) this;
        }

        public Criteria andConsumeMoneyNotEqualTo(String value) {
            addCriterion("consume_money <>", value, "consumeMoney");
            return (Criteria) this;
        }

        public Criteria andConsumeMoneyGreaterThan(String value) {
            addCriterion("consume_money >", value, "consumeMoney");
            return (Criteria) this;
        }

        public Criteria andConsumeMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("consume_money >=", value, "consumeMoney");
            return (Criteria) this;
        }

        public Criteria andConsumeMoneyLessThan(String value) {
            addCriterion("consume_money <", value, "consumeMoney");
            return (Criteria) this;
        }

        public Criteria andConsumeMoneyLessThanOrEqualTo(String value) {
            addCriterion("consume_money <=", value, "consumeMoney");
            return (Criteria) this;
        }

        public Criteria andConsumeMoneyLike(String value) {
            addCriterion("consume_money like", value, "consumeMoney");
            return (Criteria) this;
        }

        public Criteria andConsumeMoneyNotLike(String value) {
            addCriterion("consume_money not like", value, "consumeMoney");
            return (Criteria) this;
        }

        public Criteria andConsumeMoneyIn(List<String> values) {
            addCriterion("consume_money in", values, "consumeMoney");
            return (Criteria) this;
        }

        public Criteria andConsumeMoneyNotIn(List<String> values) {
            addCriterion("consume_money not in", values, "consumeMoney");
            return (Criteria) this;
        }

        public Criteria andConsumeMoneyBetween(String value1, String value2) {
            addCriterion("consume_money between", value1, value2, "consumeMoney");
            return (Criteria) this;
        }

        public Criteria andConsumeMoneyNotBetween(String value1, String value2) {
            addCriterion("consume_money not between", value1, value2, "consumeMoney");
            return (Criteria) this;
        }

        public Criteria andShopCodeIsNull() {
            addCriterion("shop_code is null");
            return (Criteria) this;
        }

        public Criteria andShopCodeIsNotNull() {
            addCriterion("shop_code is not null");
            return (Criteria) this;
        }

        public Criteria andShopCodeEqualTo(String value) {
            addCriterion("shop_code =", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeNotEqualTo(String value) {
            addCriterion("shop_code <>", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeGreaterThan(String value) {
            addCriterion("shop_code >", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeGreaterThanOrEqualTo(String value) {
            addCriterion("shop_code >=", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeLessThan(String value) {
            addCriterion("shop_code <", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeLessThanOrEqualTo(String value) {
            addCriterion("shop_code <=", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeLike(String value) {
            addCriterion("shop_code like", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeNotLike(String value) {
            addCriterion("shop_code not like", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeIn(List<String> values) {
            addCriterion("shop_code in", values, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeNotIn(List<String> values) {
            addCriterion("shop_code not in", values, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeBetween(String value1, String value2) {
            addCriterion("shop_code between", value1, value2, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeNotBetween(String value1, String value2) {
            addCriterion("shop_code not between", value1, value2, "shopCode");
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