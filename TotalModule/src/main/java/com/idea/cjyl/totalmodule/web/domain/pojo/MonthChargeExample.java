package com.idea.cjyl.totalmodule.web.domain.pojo;

import java.util.ArrayList;
import java.util.List;

public class MonthChargeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MonthChargeExample() {
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

        public Criteria andNursingGradesIsNull() {
            addCriterion("nursing_grades is null");
            return (Criteria) this;
        }

        public Criteria andNursingGradesIsNotNull() {
            addCriterion("nursing_grades is not null");
            return (Criteria) this;
        }

        public Criteria andNursingGradesEqualTo(String value) {
            addCriterion("nursing_grades =", value, "nursingGrades");
            return (Criteria) this;
        }

        public Criteria andNursingGradesNotEqualTo(String value) {
            addCriterion("nursing_grades <>", value, "nursingGrades");
            return (Criteria) this;
        }

        public Criteria andNursingGradesGreaterThan(String value) {
            addCriterion("nursing_grades >", value, "nursingGrades");
            return (Criteria) this;
        }

        public Criteria andNursingGradesGreaterThanOrEqualTo(String value) {
            addCriterion("nursing_grades >=", value, "nursingGrades");
            return (Criteria) this;
        }

        public Criteria andNursingGradesLessThan(String value) {
            addCriterion("nursing_grades <", value, "nursingGrades");
            return (Criteria) this;
        }

        public Criteria andNursingGradesLessThanOrEqualTo(String value) {
            addCriterion("nursing_grades <=", value, "nursingGrades");
            return (Criteria) this;
        }

        public Criteria andNursingGradesLike(String value) {
            addCriterion("nursing_grades like", value, "nursingGrades");
            return (Criteria) this;
        }

        public Criteria andNursingGradesNotLike(String value) {
            addCriterion("nursing_grades not like", value, "nursingGrades");
            return (Criteria) this;
        }

        public Criteria andNursingGradesIn(List<String> values) {
            addCriterion("nursing_grades in", values, "nursingGrades");
            return (Criteria) this;
        }

        public Criteria andNursingGradesNotIn(List<String> values) {
            addCriterion("nursing_grades not in", values, "nursingGrades");
            return (Criteria) this;
        }

        public Criteria andNursingGradesBetween(String value1, String value2) {
            addCriterion("nursing_grades between", value1, value2, "nursingGrades");
            return (Criteria) this;
        }

        public Criteria andNursingGradesNotBetween(String value1, String value2) {
            addCriterion("nursing_grades not between", value1, value2, "nursingGrades");
            return (Criteria) this;
        }

        public Criteria andAdministrativeFeeIsNull() {
            addCriterion("administrative_fee is null");
            return (Criteria) this;
        }

        public Criteria andAdministrativeFeeIsNotNull() {
            addCriterion("administrative_fee is not null");
            return (Criteria) this;
        }

        public Criteria andAdministrativeFeeEqualTo(Integer value) {
            addCriterion("administrative_fee =", value, "administrativeFee");
            return (Criteria) this;
        }

        public Criteria andAdministrativeFeeNotEqualTo(Integer value) {
            addCriterion("administrative_fee <>", value, "administrativeFee");
            return (Criteria) this;
        }

        public Criteria andAdministrativeFeeGreaterThan(Integer value) {
            addCriterion("administrative_fee >", value, "administrativeFee");
            return (Criteria) this;
        }

        public Criteria andAdministrativeFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("administrative_fee >=", value, "administrativeFee");
            return (Criteria) this;
        }

        public Criteria andAdministrativeFeeLessThan(Integer value) {
            addCriterion("administrative_fee <", value, "administrativeFee");
            return (Criteria) this;
        }

        public Criteria andAdministrativeFeeLessThanOrEqualTo(Integer value) {
            addCriterion("administrative_fee <=", value, "administrativeFee");
            return (Criteria) this;
        }

        public Criteria andAdministrativeFeeIn(List<Integer> values) {
            addCriterion("administrative_fee in", values, "administrativeFee");
            return (Criteria) this;
        }

        public Criteria andAdministrativeFeeNotIn(List<Integer> values) {
            addCriterion("administrative_fee not in", values, "administrativeFee");
            return (Criteria) this;
        }

        public Criteria andAdministrativeFeeBetween(Integer value1, Integer value2) {
            addCriterion("administrative_fee between", value1, value2, "administrativeFee");
            return (Criteria) this;
        }

        public Criteria andAdministrativeFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("administrative_fee not between", value1, value2, "administrativeFee");
            return (Criteria) this;
        }

        public Criteria andServiceChargeIsNull() {
            addCriterion("service_charge is null");
            return (Criteria) this;
        }

        public Criteria andServiceChargeIsNotNull() {
            addCriterion("service_charge is not null");
            return (Criteria) this;
        }

        public Criteria andServiceChargeEqualTo(Integer value) {
            addCriterion("service_charge =", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeNotEqualTo(Integer value) {
            addCriterion("service_charge <>", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeGreaterThan(Integer value) {
            addCriterion("service_charge >", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_charge >=", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeLessThan(Integer value) {
            addCriterion("service_charge <", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeLessThanOrEqualTo(Integer value) {
            addCriterion("service_charge <=", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeIn(List<Integer> values) {
            addCriterion("service_charge in", values, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeNotIn(List<Integer> values) {
            addCriterion("service_charge not in", values, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeBetween(Integer value1, Integer value2) {
            addCriterion("service_charge between", value1, value2, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeNotBetween(Integer value1, Integer value2) {
            addCriterion("service_charge not between", value1, value2, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andBedCostIsNull() {
            addCriterion("bed_cost is null");
            return (Criteria) this;
        }

        public Criteria andBedCostIsNotNull() {
            addCriterion("bed_cost is not null");
            return (Criteria) this;
        }

        public Criteria andBedCostEqualTo(Integer value) {
            addCriterion("bed_cost =", value, "bedCost");
            return (Criteria) this;
        }

        public Criteria andBedCostNotEqualTo(Integer value) {
            addCriterion("bed_cost <>", value, "bedCost");
            return (Criteria) this;
        }

        public Criteria andBedCostGreaterThan(Integer value) {
            addCriterion("bed_cost >", value, "bedCost");
            return (Criteria) this;
        }

        public Criteria andBedCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("bed_cost >=", value, "bedCost");
            return (Criteria) this;
        }

        public Criteria andBedCostLessThan(Integer value) {
            addCriterion("bed_cost <", value, "bedCost");
            return (Criteria) this;
        }

        public Criteria andBedCostLessThanOrEqualTo(Integer value) {
            addCriterion("bed_cost <=", value, "bedCost");
            return (Criteria) this;
        }

        public Criteria andBedCostIn(List<Integer> values) {
            addCriterion("bed_cost in", values, "bedCost");
            return (Criteria) this;
        }

        public Criteria andBedCostNotIn(List<Integer> values) {
            addCriterion("bed_cost not in", values, "bedCost");
            return (Criteria) this;
        }

        public Criteria andBedCostBetween(Integer value1, Integer value2) {
            addCriterion("bed_cost between", value1, value2, "bedCost");
            return (Criteria) this;
        }

        public Criteria andBedCostNotBetween(Integer value1, Integer value2) {
            addCriterion("bed_cost not between", value1, value2, "bedCost");
            return (Criteria) this;
        }

        public Criteria andFoodCostIsNull() {
            addCriterion("food_cost is null");
            return (Criteria) this;
        }

        public Criteria andFoodCostIsNotNull() {
            addCriterion("food_cost is not null");
            return (Criteria) this;
        }

        public Criteria andFoodCostEqualTo(Integer value) {
            addCriterion("food_cost =", value, "foodCost");
            return (Criteria) this;
        }

        public Criteria andFoodCostNotEqualTo(Integer value) {
            addCriterion("food_cost <>", value, "foodCost");
            return (Criteria) this;
        }

        public Criteria andFoodCostGreaterThan(Integer value) {
            addCriterion("food_cost >", value, "foodCost");
            return (Criteria) this;
        }

        public Criteria andFoodCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("food_cost >=", value, "foodCost");
            return (Criteria) this;
        }

        public Criteria andFoodCostLessThan(Integer value) {
            addCriterion("food_cost <", value, "foodCost");
            return (Criteria) this;
        }

        public Criteria andFoodCostLessThanOrEqualTo(Integer value) {
            addCriterion("food_cost <=", value, "foodCost");
            return (Criteria) this;
        }

        public Criteria andFoodCostIn(List<Integer> values) {
            addCriterion("food_cost in", values, "foodCost");
            return (Criteria) this;
        }

        public Criteria andFoodCostNotIn(List<Integer> values) {
            addCriterion("food_cost not in", values, "foodCost");
            return (Criteria) this;
        }

        public Criteria andFoodCostBetween(Integer value1, Integer value2) {
            addCriterion("food_cost between", value1, value2, "foodCost");
            return (Criteria) this;
        }

        public Criteria andFoodCostNotBetween(Integer value1, Integer value2) {
            addCriterion("food_cost not between", value1, value2, "foodCost");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Integer value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Integer value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Integer value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Integer value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Integer value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Integer> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Integer> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Integer value1, Integer value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("total not between", value1, value2, "total");
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