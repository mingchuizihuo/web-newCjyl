package com.idea.cjyl.food.web.domain.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WeekFoodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WeekFoodExample() {
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

        public Criteria andWeekDateIsNull() {
            addCriterion("week_date is null");
            return (Criteria) this;
        }

        public Criteria andWeekDateIsNotNull() {
            addCriterion("week_date is not null");
            return (Criteria) this;
        }

        public Criteria andWeekDateEqualTo(Byte value) {
            addCriterion("week_date =", value, "weekDate");
            return (Criteria) this;
        }

        public Criteria andWeekDateNotEqualTo(Byte value) {
            addCriterion("week_date <>", value, "weekDate");
            return (Criteria) this;
        }

        public Criteria andWeekDateGreaterThan(Byte value) {
            addCriterion("week_date >", value, "weekDate");
            return (Criteria) this;
        }

        public Criteria andWeekDateGreaterThanOrEqualTo(Byte value) {
            addCriterion("week_date >=", value, "weekDate");
            return (Criteria) this;
        }

        public Criteria andWeekDateLessThan(Byte value) {
            addCriterion("week_date <", value, "weekDate");
            return (Criteria) this;
        }

        public Criteria andWeekDateLessThanOrEqualTo(Byte value) {
            addCriterion("week_date <=", value, "weekDate");
            return (Criteria) this;
        }

        public Criteria andWeekDateIn(List<Byte> values) {
            addCriterion("week_date in", values, "weekDate");
            return (Criteria) this;
        }

        public Criteria andWeekDateNotIn(List<Byte> values) {
            addCriterion("week_date not in", values, "weekDate");
            return (Criteria) this;
        }

        public Criteria andWeekDateBetween(Byte value1, Byte value2) {
            addCriterion("week_date between", value1, value2, "weekDate");
            return (Criteria) this;
        }

        public Criteria andWeekDateNotBetween(Byte value1, Byte value2) {
            addCriterion("week_date not between", value1, value2, "weekDate");
            return (Criteria) this;
        }

        public Criteria andOneEarlyIsNull() {
            addCriterion("one_early is null");
            return (Criteria) this;
        }

        public Criteria andOneEarlyIsNotNull() {
            addCriterion("one_early is not null");
            return (Criteria) this;
        }

        public Criteria andOneEarlyEqualTo(Byte value) {
            addCriterion("one_early =", value, "oneEarly");
            return (Criteria) this;
        }

        public Criteria andOneEarlyNotEqualTo(Byte value) {
            addCriterion("one_early <>", value, "oneEarly");
            return (Criteria) this;
        }

        public Criteria andOneEarlyGreaterThan(Byte value) {
            addCriterion("one_early >", value, "oneEarly");
            return (Criteria) this;
        }

        public Criteria andOneEarlyGreaterThanOrEqualTo(Byte value) {
            addCriterion("one_early >=", value, "oneEarly");
            return (Criteria) this;
        }

        public Criteria andOneEarlyLessThan(Byte value) {
            addCriterion("one_early <", value, "oneEarly");
            return (Criteria) this;
        }

        public Criteria andOneEarlyLessThanOrEqualTo(Byte value) {
            addCriterion("one_early <=", value, "oneEarly");
            return (Criteria) this;
        }

        public Criteria andOneEarlyIn(List<Byte> values) {
            addCriterion("one_early in", values, "oneEarly");
            return (Criteria) this;
        }

        public Criteria andOneEarlyNotIn(List<Byte> values) {
            addCriterion("one_early not in", values, "oneEarly");
            return (Criteria) this;
        }

        public Criteria andOneEarlyBetween(Byte value1, Byte value2) {
            addCriterion("one_early between", value1, value2, "oneEarly");
            return (Criteria) this;
        }

        public Criteria andOneEarlyNotBetween(Byte value1, Byte value2) {
            addCriterion("one_early not between", value1, value2, "oneEarly");
            return (Criteria) this;
        }

        public Criteria andDishesListIsNull() {
            addCriterion("dishes_list is null");
            return (Criteria) this;
        }

        public Criteria andDishesListIsNotNull() {
            addCriterion("dishes_list is not null");
            return (Criteria) this;
        }

        public Criteria andDishesListEqualTo(String value) {
            addCriterion("dishes_list =", value, "dishesList");
            return (Criteria) this;
        }

        public Criteria andDishesListNotEqualTo(String value) {
            addCriterion("dishes_list <>", value, "dishesList");
            return (Criteria) this;
        }

        public Criteria andDishesListGreaterThan(String value) {
            addCriterion("dishes_list >", value, "dishesList");
            return (Criteria) this;
        }

        public Criteria andDishesListGreaterThanOrEqualTo(String value) {
            addCriterion("dishes_list >=", value, "dishesList");
            return (Criteria) this;
        }

        public Criteria andDishesListLessThan(String value) {
            addCriterion("dishes_list <", value, "dishesList");
            return (Criteria) this;
        }

        public Criteria andDishesListLessThanOrEqualTo(String value) {
            addCriterion("dishes_list <=", value, "dishesList");
            return (Criteria) this;
        }

        public Criteria andDishesListLike(String value) {
            addCriterion("dishes_list like", value, "dishesList");
            return (Criteria) this;
        }

        public Criteria andDishesListNotLike(String value) {
            addCriterion("dishes_list not like", value, "dishesList");
            return (Criteria) this;
        }

        public Criteria andDishesListIn(List<String> values) {
            addCriterion("dishes_list in", values, "dishesList");
            return (Criteria) this;
        }

        public Criteria andDishesListNotIn(List<String> values) {
            addCriterion("dishes_list not in", values, "dishesList");
            return (Criteria) this;
        }

        public Criteria andDishesListBetween(String value1, String value2) {
            addCriterion("dishes_list between", value1, value2, "dishesList");
            return (Criteria) this;
        }

        public Criteria andDishesListNotBetween(String value1, String value2) {
            addCriterion("dishes_list not between", value1, value2, "dishesList");
            return (Criteria) this;
        }

        public Criteria andFoodDateIsNull() {
            addCriterion("food_date is null");
            return (Criteria) this;
        }

        public Criteria andFoodDateIsNotNull() {
            addCriterion("food_date is not null");
            return (Criteria) this;
        }

        public Criteria andFoodDateEqualTo(Date value) {
            addCriterion("food_date =", value, "foodDate");
            return (Criteria) this;
        }

        public Criteria andFoodDateNotEqualTo(Date value) {
            addCriterion("food_date <>", value, "foodDate");
            return (Criteria) this;
        }

        public Criteria andFoodDateGreaterThan(Date value) {
            addCriterion("food_date >", value, "foodDate");
            return (Criteria) this;
        }

        public Criteria andFoodDateGreaterThanOrEqualTo(Date value) {
            addCriterion("food_date >=", value, "foodDate");
            return (Criteria) this;
        }

        public Criteria andFoodDateLessThan(Date value) {
            addCriterion("food_date <", value, "foodDate");
            return (Criteria) this;
        }

        public Criteria andFoodDateLessThanOrEqualTo(Date value) {
            addCriterion("food_date <=", value, "foodDate");
            return (Criteria) this;
        }

        public Criteria andFoodDateIn(List<Date> values) {
            addCriterion("food_date in", values, "foodDate");
            return (Criteria) this;
        }

        public Criteria andFoodDateNotIn(List<Date> values) {
            addCriterion("food_date not in", values, "foodDate");
            return (Criteria) this;
        }

        public Criteria andFoodDateBetween(Date value1, Date value2) {
            addCriterion("food_date between", value1, value2, "foodDate");
            return (Criteria) this;
        }

        public Criteria andFoodDateNotBetween(Date value1, Date value2) {
            addCriterion("food_date not between", value1, value2, "foodDate");
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