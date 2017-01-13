package com.idea.cjyl.food.web.domain.pojo;

import java.util.ArrayList;
import java.util.List;

public class DishesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DishesExample() {
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

        public Criteria andDishesNameIsNull() {
            addCriterion("dishes_name is null");
            return (Criteria) this;
        }

        public Criteria andDishesNameIsNotNull() {
            addCriterion("dishes_name is not null");
            return (Criteria) this;
        }

        public Criteria andDishesNameEqualTo(String value) {
            addCriterion("dishes_name =", value, "dishesName");
            return (Criteria) this;
        }

        public Criteria andDishesNameNotEqualTo(String value) {
            addCriterion("dishes_name <>", value, "dishesName");
            return (Criteria) this;
        }

        public Criteria andDishesNameGreaterThan(String value) {
            addCriterion("dishes_name >", value, "dishesName");
            return (Criteria) this;
        }

        public Criteria andDishesNameGreaterThanOrEqualTo(String value) {
            addCriterion("dishes_name >=", value, "dishesName");
            return (Criteria) this;
        }

        public Criteria andDishesNameLessThan(String value) {
            addCriterion("dishes_name <", value, "dishesName");
            return (Criteria) this;
        }

        public Criteria andDishesNameLessThanOrEqualTo(String value) {
            addCriterion("dishes_name <=", value, "dishesName");
            return (Criteria) this;
        }

        public Criteria andDishesNameLike(String value) {
            addCriterion("dishes_name like", value, "dishesName");
            return (Criteria) this;
        }

        public Criteria andDishesNameNotLike(String value) {
            addCriterion("dishes_name not like", value, "dishesName");
            return (Criteria) this;
        }

        public Criteria andDishesNameIn(List<String> values) {
            addCriterion("dishes_name in", values, "dishesName");
            return (Criteria) this;
        }

        public Criteria andDishesNameNotIn(List<String> values) {
            addCriterion("dishes_name not in", values, "dishesName");
            return (Criteria) this;
        }

        public Criteria andDishesNameBetween(String value1, String value2) {
            addCriterion("dishes_name between", value1, value2, "dishesName");
            return (Criteria) this;
        }

        public Criteria andDishesNameNotBetween(String value1, String value2) {
            addCriterion("dishes_name not between", value1, value2, "dishesName");
            return (Criteria) this;
        }

        public Criteria andDishesTasteIsNull() {
            addCriterion("dishes_taste is null");
            return (Criteria) this;
        }

        public Criteria andDishesTasteIsNotNull() {
            addCriterion("dishes_taste is not null");
            return (Criteria) this;
        }

        public Criteria andDishesTasteEqualTo(String value) {
            addCriterion("dishes_taste =", value, "dishesTaste");
            return (Criteria) this;
        }

        public Criteria andDishesTasteNotEqualTo(String value) {
            addCriterion("dishes_taste <>", value, "dishesTaste");
            return (Criteria) this;
        }

        public Criteria andDishesTasteGreaterThan(String value) {
            addCriterion("dishes_taste >", value, "dishesTaste");
            return (Criteria) this;
        }

        public Criteria andDishesTasteGreaterThanOrEqualTo(String value) {
            addCriterion("dishes_taste >=", value, "dishesTaste");
            return (Criteria) this;
        }

        public Criteria andDishesTasteLessThan(String value) {
            addCriterion("dishes_taste <", value, "dishesTaste");
            return (Criteria) this;
        }

        public Criteria andDishesTasteLessThanOrEqualTo(String value) {
            addCriterion("dishes_taste <=", value, "dishesTaste");
            return (Criteria) this;
        }

        public Criteria andDishesTasteLike(String value) {
            addCriterion("dishes_taste like", value, "dishesTaste");
            return (Criteria) this;
        }

        public Criteria andDishesTasteNotLike(String value) {
            addCriterion("dishes_taste not like", value, "dishesTaste");
            return (Criteria) this;
        }

        public Criteria andDishesTasteIn(List<String> values) {
            addCriterion("dishes_taste in", values, "dishesTaste");
            return (Criteria) this;
        }

        public Criteria andDishesTasteNotIn(List<String> values) {
            addCriterion("dishes_taste not in", values, "dishesTaste");
            return (Criteria) this;
        }

        public Criteria andDishesTasteBetween(String value1, String value2) {
            addCriterion("dishes_taste between", value1, value2, "dishesTaste");
            return (Criteria) this;
        }

        public Criteria andDishesTasteNotBetween(String value1, String value2) {
            addCriterion("dishes_taste not between", value1, value2, "dishesTaste");
            return (Criteria) this;
        }

        public Criteria andDishesAllergenIsNull() {
            addCriterion("dishes_allergen is null");
            return (Criteria) this;
        }

        public Criteria andDishesAllergenIsNotNull() {
            addCriterion("dishes_allergen is not null");
            return (Criteria) this;
        }

        public Criteria andDishesAllergenEqualTo(String value) {
            addCriterion("dishes_allergen =", value, "dishesAllergen");
            return (Criteria) this;
        }

        public Criteria andDishesAllergenNotEqualTo(String value) {
            addCriterion("dishes_allergen <>", value, "dishesAllergen");
            return (Criteria) this;
        }

        public Criteria andDishesAllergenGreaterThan(String value) {
            addCriterion("dishes_allergen >", value, "dishesAllergen");
            return (Criteria) this;
        }

        public Criteria andDishesAllergenGreaterThanOrEqualTo(String value) {
            addCriterion("dishes_allergen >=", value, "dishesAllergen");
            return (Criteria) this;
        }

        public Criteria andDishesAllergenLessThan(String value) {
            addCriterion("dishes_allergen <", value, "dishesAllergen");
            return (Criteria) this;
        }

        public Criteria andDishesAllergenLessThanOrEqualTo(String value) {
            addCriterion("dishes_allergen <=", value, "dishesAllergen");
            return (Criteria) this;
        }

        public Criteria andDishesAllergenLike(String value) {
            addCriterion("dishes_allergen like", value, "dishesAllergen");
            return (Criteria) this;
        }

        public Criteria andDishesAllergenNotLike(String value) {
            addCriterion("dishes_allergen not like", value, "dishesAllergen");
            return (Criteria) this;
        }

        public Criteria andDishesAllergenIn(List<String> values) {
            addCriterion("dishes_allergen in", values, "dishesAllergen");
            return (Criteria) this;
        }

        public Criteria andDishesAllergenNotIn(List<String> values) {
            addCriterion("dishes_allergen not in", values, "dishesAllergen");
            return (Criteria) this;
        }

        public Criteria andDishesAllergenBetween(String value1, String value2) {
            addCriterion("dishes_allergen between", value1, value2, "dishesAllergen");
            return (Criteria) this;
        }

        public Criteria andDishesAllergenNotBetween(String value1, String value2) {
            addCriterion("dishes_allergen not between", value1, value2, "dishesAllergen");
            return (Criteria) this;
        }

        public Criteria andDishesSuitPeopleIsNull() {
            addCriterion("dishes_suit_people is null");
            return (Criteria) this;
        }

        public Criteria andDishesSuitPeopleIsNotNull() {
            addCriterion("dishes_suit_people is not null");
            return (Criteria) this;
        }

        public Criteria andDishesSuitPeopleEqualTo(String value) {
            addCriterion("dishes_suit_people =", value, "dishesSuitPeople");
            return (Criteria) this;
        }

        public Criteria andDishesSuitPeopleNotEqualTo(String value) {
            addCriterion("dishes_suit_people <>", value, "dishesSuitPeople");
            return (Criteria) this;
        }

        public Criteria andDishesSuitPeopleGreaterThan(String value) {
            addCriterion("dishes_suit_people >", value, "dishesSuitPeople");
            return (Criteria) this;
        }

        public Criteria andDishesSuitPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("dishes_suit_people >=", value, "dishesSuitPeople");
            return (Criteria) this;
        }

        public Criteria andDishesSuitPeopleLessThan(String value) {
            addCriterion("dishes_suit_people <", value, "dishesSuitPeople");
            return (Criteria) this;
        }

        public Criteria andDishesSuitPeopleLessThanOrEqualTo(String value) {
            addCriterion("dishes_suit_people <=", value, "dishesSuitPeople");
            return (Criteria) this;
        }

        public Criteria andDishesSuitPeopleLike(String value) {
            addCriterion("dishes_suit_people like", value, "dishesSuitPeople");
            return (Criteria) this;
        }

        public Criteria andDishesSuitPeopleNotLike(String value) {
            addCriterion("dishes_suit_people not like", value, "dishesSuitPeople");
            return (Criteria) this;
        }

        public Criteria andDishesSuitPeopleIn(List<String> values) {
            addCriterion("dishes_suit_people in", values, "dishesSuitPeople");
            return (Criteria) this;
        }

        public Criteria andDishesSuitPeopleNotIn(List<String> values) {
            addCriterion("dishes_suit_people not in", values, "dishesSuitPeople");
            return (Criteria) this;
        }

        public Criteria andDishesSuitPeopleBetween(String value1, String value2) {
            addCriterion("dishes_suit_people between", value1, value2, "dishesSuitPeople");
            return (Criteria) this;
        }

        public Criteria andDishesSuitPeopleNotBetween(String value1, String value2) {
            addCriterion("dishes_suit_people not between", value1, value2, "dishesSuitPeople");
            return (Criteria) this;
        }

        public Criteria andDishesWeightIsNull() {
            addCriterion("dishes_weight is null");
            return (Criteria) this;
        }

        public Criteria andDishesWeightIsNotNull() {
            addCriterion("dishes_weight is not null");
            return (Criteria) this;
        }

        public Criteria andDishesWeightEqualTo(Byte value) {
            addCriterion("dishes_weight =", value, "dishesWeight");
            return (Criteria) this;
        }

        public Criteria andDishesWeightNotEqualTo(Byte value) {
            addCriterion("dishes_weight <>", value, "dishesWeight");
            return (Criteria) this;
        }

        public Criteria andDishesWeightGreaterThan(Byte value) {
            addCriterion("dishes_weight >", value, "dishesWeight");
            return (Criteria) this;
        }

        public Criteria andDishesWeightGreaterThanOrEqualTo(Byte value) {
            addCriterion("dishes_weight >=", value, "dishesWeight");
            return (Criteria) this;
        }

        public Criteria andDishesWeightLessThan(Byte value) {
            addCriterion("dishes_weight <", value, "dishesWeight");
            return (Criteria) this;
        }

        public Criteria andDishesWeightLessThanOrEqualTo(Byte value) {
            addCriterion("dishes_weight <=", value, "dishesWeight");
            return (Criteria) this;
        }

        public Criteria andDishesWeightIn(List<Byte> values) {
            addCriterion("dishes_weight in", values, "dishesWeight");
            return (Criteria) this;
        }

        public Criteria andDishesWeightNotIn(List<Byte> values) {
            addCriterion("dishes_weight not in", values, "dishesWeight");
            return (Criteria) this;
        }

        public Criteria andDishesWeightBetween(Byte value1, Byte value2) {
            addCriterion("dishes_weight between", value1, value2, "dishesWeight");
            return (Criteria) this;
        }

        public Criteria andDishesWeightNotBetween(Byte value1, Byte value2) {
            addCriterion("dishes_weight not between", value1, value2, "dishesWeight");
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