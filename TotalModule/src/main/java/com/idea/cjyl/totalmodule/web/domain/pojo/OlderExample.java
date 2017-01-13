package com.idea.cjyl.totalmodule.web.domain.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OlderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OlderExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Long value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Long value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Long value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Long value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Long value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Long value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Long> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Long> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Long value1, Long value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Long value1, Long value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andCheckInDateIsNull() {
            addCriterion("check_in_date is null");
            return (Criteria) this;
        }

        public Criteria andCheckInDateIsNotNull() {
            addCriterion("check_in_date is not null");
            return (Criteria) this;
        }

        public Criteria andCheckInDateEqualTo(Date value) {
            addCriterion("check_in_date =", value, "checkInDate");
            return (Criteria) this;
        }

        public Criteria andCheckInDateNotEqualTo(Date value) {
            addCriterion("check_in_date <>", value, "checkInDate");
            return (Criteria) this;
        }

        public Criteria andCheckInDateGreaterThan(Date value) {
            addCriterion("check_in_date >", value, "checkInDate");
            return (Criteria) this;
        }

        public Criteria andCheckInDateGreaterThanOrEqualTo(Date value) {
            addCriterion("check_in_date >=", value, "checkInDate");
            return (Criteria) this;
        }

        public Criteria andCheckInDateLessThan(Date value) {
            addCriterion("check_in_date <", value, "checkInDate");
            return (Criteria) this;
        }

        public Criteria andCheckInDateLessThanOrEqualTo(Date value) {
            addCriterion("check_in_date <=", value, "checkInDate");
            return (Criteria) this;
        }

        public Criteria andCheckInDateIn(List<Date> values) {
            addCriterion("check_in_date in", values, "checkInDate");
            return (Criteria) this;
        }

        public Criteria andCheckInDateNotIn(List<Date> values) {
            addCriterion("check_in_date not in", values, "checkInDate");
            return (Criteria) this;
        }

        public Criteria andCheckInDateBetween(Date value1, Date value2) {
            addCriterion("check_in_date between", value1, value2, "checkInDate");
            return (Criteria) this;
        }

        public Criteria andCheckInDateNotBetween(Date value1, Date value2) {
            addCriterion("check_in_date not between", value1, value2, "checkInDate");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNull() {
            addCriterion("card_id is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("card_id is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(String value) {
            addCriterion("card_id =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(String value) {
            addCriterion("card_id <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(String value) {
            addCriterion("card_id >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("card_id >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(String value) {
            addCriterion("card_id <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(String value) {
            addCriterion("card_id <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLike(String value) {
            addCriterion("card_id like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotLike(String value) {
            addCriterion("card_id not like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<String> values) {
            addCriterion("card_id in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<String> values) {
            addCriterion("card_id not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(String value1, String value2) {
            addCriterion("card_id between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(String value1, String value2) {
            addCriterion("card_id not between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
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

        public Criteria andCensusRegisterIsNull() {
            addCriterion("census_register is null");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterIsNotNull() {
            addCriterion("census_register is not null");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterEqualTo(String value) {
            addCriterion("census_register =", value, "censusRegister");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterNotEqualTo(String value) {
            addCriterion("census_register <>", value, "censusRegister");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterGreaterThan(String value) {
            addCriterion("census_register >", value, "censusRegister");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterGreaterThanOrEqualTo(String value) {
            addCriterion("census_register >=", value, "censusRegister");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterLessThan(String value) {
            addCriterion("census_register <", value, "censusRegister");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterLessThanOrEqualTo(String value) {
            addCriterion("census_register <=", value, "censusRegister");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterLike(String value) {
            addCriterion("census_register like", value, "censusRegister");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterNotLike(String value) {
            addCriterion("census_register not like", value, "censusRegister");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterIn(List<String> values) {
            addCriterion("census_register in", values, "censusRegister");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterNotIn(List<String> values) {
            addCriterion("census_register not in", values, "censusRegister");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterBetween(String value1, String value2) {
            addCriterion("census_register between", value1, value2, "censusRegister");
            return (Criteria) this;
        }

        public Criteria andCensusRegisterNotBetween(String value1, String value2) {
            addCriterion("census_register not between", value1, value2, "censusRegister");
            return (Criteria) this;
        }

        public Criteria andBeliefIsNull() {
            addCriterion("belief is null");
            return (Criteria) this;
        }

        public Criteria andBeliefIsNotNull() {
            addCriterion("belief is not null");
            return (Criteria) this;
        }

        public Criteria andBeliefEqualTo(Long value) {
            addCriterion("belief =", value, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefNotEqualTo(Long value) {
            addCriterion("belief <>", value, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefGreaterThan(Long value) {
            addCriterion("belief >", value, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefGreaterThanOrEqualTo(Long value) {
            addCriterion("belief >=", value, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefLessThan(Long value) {
            addCriterion("belief <", value, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefLessThanOrEqualTo(Long value) {
            addCriterion("belief <=", value, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefIn(List<Long> values) {
            addCriterion("belief in", values, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefNotIn(List<Long> values) {
            addCriterion("belief not in", values, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefBetween(Long value1, Long value2) {
            addCriterion("belief between", value1, value2, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefNotBetween(Long value1, Long value2) {
            addCriterion("belief not between", value1, value2, "belief");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(Long value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(Long value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(Long value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(Long value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(Long value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(Long value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<Long> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<Long> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(Long value1, Long value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(Long value1, Long value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusIsNull() {
            addCriterion("politics_status is null");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusIsNotNull() {
            addCriterion("politics_status is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusEqualTo(Long value) {
            addCriterion("politics_status =", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusNotEqualTo(Long value) {
            addCriterion("politics_status <>", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusGreaterThan(Long value) {
            addCriterion("politics_status >", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusGreaterThanOrEqualTo(Long value) {
            addCriterion("politics_status >=", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusLessThan(Long value) {
            addCriterion("politics_status <", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusLessThanOrEqualTo(Long value) {
            addCriterion("politics_status <=", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusIn(List<Long> values) {
            addCriterion("politics_status in", values, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusNotIn(List<Long> values) {
            addCriterion("politics_status not in", values, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusBetween(Long value1, Long value2) {
            addCriterion("politics_status between", value1, value2, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusNotBetween(Long value1, Long value2) {
            addCriterion("politics_status not between", value1, value2, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andSelfIngredientIsNull() {
            addCriterion("self_ingredient is null");
            return (Criteria) this;
        }

        public Criteria andSelfIngredientIsNotNull() {
            addCriterion("self_ingredient is not null");
            return (Criteria) this;
        }

        public Criteria andSelfIngredientEqualTo(Long value) {
            addCriterion("self_ingredient =", value, "selfIngredient");
            return (Criteria) this;
        }

        public Criteria andSelfIngredientNotEqualTo(Long value) {
            addCriterion("self_ingredient <>", value, "selfIngredient");
            return (Criteria) this;
        }

        public Criteria andSelfIngredientGreaterThan(Long value) {
            addCriterion("self_ingredient >", value, "selfIngredient");
            return (Criteria) this;
        }

        public Criteria andSelfIngredientGreaterThanOrEqualTo(Long value) {
            addCriterion("self_ingredient >=", value, "selfIngredient");
            return (Criteria) this;
        }

        public Criteria andSelfIngredientLessThan(Long value) {
            addCriterion("self_ingredient <", value, "selfIngredient");
            return (Criteria) this;
        }

        public Criteria andSelfIngredientLessThanOrEqualTo(Long value) {
            addCriterion("self_ingredient <=", value, "selfIngredient");
            return (Criteria) this;
        }

        public Criteria andSelfIngredientIn(List<Long> values) {
            addCriterion("self_ingredient in", values, "selfIngredient");
            return (Criteria) this;
        }

        public Criteria andSelfIngredientNotIn(List<Long> values) {
            addCriterion("self_ingredient not in", values, "selfIngredient");
            return (Criteria) this;
        }

        public Criteria andSelfIngredientBetween(Long value1, Long value2) {
            addCriterion("self_ingredient between", value1, value2, "selfIngredient");
            return (Criteria) this;
        }

        public Criteria andSelfIngredientNotBetween(Long value1, Long value2) {
            addCriterion("self_ingredient not between", value1, value2, "selfIngredient");
            return (Criteria) this;
        }

        public Criteria andTakeCareOfOneselfIsNull() {
            addCriterion("take_care_of_oneself is null");
            return (Criteria) this;
        }

        public Criteria andTakeCareOfOneselfIsNotNull() {
            addCriterion("take_care_of_oneself is not null");
            return (Criteria) this;
        }

        public Criteria andTakeCareOfOneselfEqualTo(Long value) {
            addCriterion("take_care_of_oneself =", value, "takeCareOfOneself");
            return (Criteria) this;
        }

        public Criteria andTakeCareOfOneselfNotEqualTo(Long value) {
            addCriterion("take_care_of_oneself <>", value, "takeCareOfOneself");
            return (Criteria) this;
        }

        public Criteria andTakeCareOfOneselfGreaterThan(Long value) {
            addCriterion("take_care_of_oneself >", value, "takeCareOfOneself");
            return (Criteria) this;
        }

        public Criteria andTakeCareOfOneselfGreaterThanOrEqualTo(Long value) {
            addCriterion("take_care_of_oneself >=", value, "takeCareOfOneself");
            return (Criteria) this;
        }

        public Criteria andTakeCareOfOneselfLessThan(Long value) {
            addCriterion("take_care_of_oneself <", value, "takeCareOfOneself");
            return (Criteria) this;
        }

        public Criteria andTakeCareOfOneselfLessThanOrEqualTo(Long value) {
            addCriterion("take_care_of_oneself <=", value, "takeCareOfOneself");
            return (Criteria) this;
        }

        public Criteria andTakeCareOfOneselfIn(List<Long> values) {
            addCriterion("take_care_of_oneself in", values, "takeCareOfOneself");
            return (Criteria) this;
        }

        public Criteria andTakeCareOfOneselfNotIn(List<Long> values) {
            addCriterion("take_care_of_oneself not in", values, "takeCareOfOneself");
            return (Criteria) this;
        }

        public Criteria andTakeCareOfOneselfBetween(Long value1, Long value2) {
            addCriterion("take_care_of_oneself between", value1, value2, "takeCareOfOneself");
            return (Criteria) this;
        }

        public Criteria andTakeCareOfOneselfNotBetween(Long value1, Long value2) {
            addCriterion("take_care_of_oneself not between", value1, value2, "takeCareOfOneself");
            return (Criteria) this;
        }

        public Criteria andMindIsNull() {
            addCriterion("mind is null");
            return (Criteria) this;
        }

        public Criteria andMindIsNotNull() {
            addCriterion("mind is not null");
            return (Criteria) this;
        }

        public Criteria andMindEqualTo(Long value) {
            addCriterion("mind =", value, "mind");
            return (Criteria) this;
        }

        public Criteria andMindNotEqualTo(Long value) {
            addCriterion("mind <>", value, "mind");
            return (Criteria) this;
        }

        public Criteria andMindGreaterThan(Long value) {
            addCriterion("mind >", value, "mind");
            return (Criteria) this;
        }

        public Criteria andMindGreaterThanOrEqualTo(Long value) {
            addCriterion("mind >=", value, "mind");
            return (Criteria) this;
        }

        public Criteria andMindLessThan(Long value) {
            addCriterion("mind <", value, "mind");
            return (Criteria) this;
        }

        public Criteria andMindLessThanOrEqualTo(Long value) {
            addCriterion("mind <=", value, "mind");
            return (Criteria) this;
        }

        public Criteria andMindIn(List<Long> values) {
            addCriterion("mind in", values, "mind");
            return (Criteria) this;
        }

        public Criteria andMindNotIn(List<Long> values) {
            addCriterion("mind not in", values, "mind");
            return (Criteria) this;
        }

        public Criteria andMindBetween(Long value1, Long value2) {
            addCriterion("mind between", value1, value2, "mind");
            return (Criteria) this;
        }

        public Criteria andMindNotBetween(Long value1, Long value2) {
            addCriterion("mind not between", value1, value2, "mind");
            return (Criteria) this;
        }

        public Criteria andPluseIsNull() {
            addCriterion("pluse is null");
            return (Criteria) this;
        }

        public Criteria andPluseIsNotNull() {
            addCriterion("pluse is not null");
            return (Criteria) this;
        }

        public Criteria andPluseEqualTo(String value) {
            addCriterion("pluse =", value, "pluse");
            return (Criteria) this;
        }

        public Criteria andPluseNotEqualTo(String value) {
            addCriterion("pluse <>", value, "pluse");
            return (Criteria) this;
        }

        public Criteria andPluseGreaterThan(String value) {
            addCriterion("pluse >", value, "pluse");
            return (Criteria) this;
        }

        public Criteria andPluseGreaterThanOrEqualTo(String value) {
            addCriterion("pluse >=", value, "pluse");
            return (Criteria) this;
        }

        public Criteria andPluseLessThan(String value) {
            addCriterion("pluse <", value, "pluse");
            return (Criteria) this;
        }

        public Criteria andPluseLessThanOrEqualTo(String value) {
            addCriterion("pluse <=", value, "pluse");
            return (Criteria) this;
        }

        public Criteria andPluseLike(String value) {
            addCriterion("pluse like", value, "pluse");
            return (Criteria) this;
        }

        public Criteria andPluseNotLike(String value) {
            addCriterion("pluse not like", value, "pluse");
            return (Criteria) this;
        }

        public Criteria andPluseIn(List<String> values) {
            addCriterion("pluse in", values, "pluse");
            return (Criteria) this;
        }

        public Criteria andPluseNotIn(List<String> values) {
            addCriterion("pluse not in", values, "pluse");
            return (Criteria) this;
        }

        public Criteria andPluseBetween(String value1, String value2) {
            addCriterion("pluse between", value1, value2, "pluse");
            return (Criteria) this;
        }

        public Criteria andPluseNotBetween(String value1, String value2) {
            addCriterion("pluse not between", value1, value2, "pluse");
            return (Criteria) this;
        }

        public Criteria andBloodPressureIsNull() {
            addCriterion("blood_pressure is null");
            return (Criteria) this;
        }

        public Criteria andBloodPressureIsNotNull() {
            addCriterion("blood_pressure is not null");
            return (Criteria) this;
        }

        public Criteria andBloodPressureEqualTo(String value) {
            addCriterion("blood_pressure =", value, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureNotEqualTo(String value) {
            addCriterion("blood_pressure <>", value, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureGreaterThan(String value) {
            addCriterion("blood_pressure >", value, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureGreaterThanOrEqualTo(String value) {
            addCriterion("blood_pressure >=", value, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureLessThan(String value) {
            addCriterion("blood_pressure <", value, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureLessThanOrEqualTo(String value) {
            addCriterion("blood_pressure <=", value, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureLike(String value) {
            addCriterion("blood_pressure like", value, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureNotLike(String value) {
            addCriterion("blood_pressure not like", value, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureIn(List<String> values) {
            addCriterion("blood_pressure in", values, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureNotIn(List<String> values) {
            addCriterion("blood_pressure not in", values, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureBetween(String value1, String value2) {
            addCriterion("blood_pressure between", value1, value2, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andBloodPressureNotBetween(String value1, String value2) {
            addCriterion("blood_pressure not between", value1, value2, "bloodPressure");
            return (Criteria) this;
        }

        public Criteria andAllergicDrugIsNull() {
            addCriterion("allergic_drug is null");
            return (Criteria) this;
        }

        public Criteria andAllergicDrugIsNotNull() {
            addCriterion("allergic_drug is not null");
            return (Criteria) this;
        }

        public Criteria andAllergicDrugEqualTo(String value) {
            addCriterion("allergic_drug =", value, "allergicDrug");
            return (Criteria) this;
        }

        public Criteria andAllergicDrugNotEqualTo(String value) {
            addCriterion("allergic_drug <>", value, "allergicDrug");
            return (Criteria) this;
        }

        public Criteria andAllergicDrugGreaterThan(String value) {
            addCriterion("allergic_drug >", value, "allergicDrug");
            return (Criteria) this;
        }

        public Criteria andAllergicDrugGreaterThanOrEqualTo(String value) {
            addCriterion("allergic_drug >=", value, "allergicDrug");
            return (Criteria) this;
        }

        public Criteria andAllergicDrugLessThan(String value) {
            addCriterion("allergic_drug <", value, "allergicDrug");
            return (Criteria) this;
        }

        public Criteria andAllergicDrugLessThanOrEqualTo(String value) {
            addCriterion("allergic_drug <=", value, "allergicDrug");
            return (Criteria) this;
        }

        public Criteria andAllergicDrugLike(String value) {
            addCriterion("allergic_drug like", value, "allergicDrug");
            return (Criteria) this;
        }

        public Criteria andAllergicDrugNotLike(String value) {
            addCriterion("allergic_drug not like", value, "allergicDrug");
            return (Criteria) this;
        }

        public Criteria andAllergicDrugIn(List<String> values) {
            addCriterion("allergic_drug in", values, "allergicDrug");
            return (Criteria) this;
        }

        public Criteria andAllergicDrugNotIn(List<String> values) {
            addCriterion("allergic_drug not in", values, "allergicDrug");
            return (Criteria) this;
        }

        public Criteria andAllergicDrugBetween(String value1, String value2) {
            addCriterion("allergic_drug between", value1, value2, "allergicDrug");
            return (Criteria) this;
        }

        public Criteria andAllergicDrugNotBetween(String value1, String value2) {
            addCriterion("allergic_drug not between", value1, value2, "allergicDrug");
            return (Criteria) this;
        }

        public Criteria andIndicationHospitalIsNull() {
            addCriterion("indication_hospital is null");
            return (Criteria) this;
        }

        public Criteria andIndicationHospitalIsNotNull() {
            addCriterion("indication_hospital is not null");
            return (Criteria) this;
        }

        public Criteria andIndicationHospitalEqualTo(String value) {
            addCriterion("indication_hospital =", value, "indicationHospital");
            return (Criteria) this;
        }

        public Criteria andIndicationHospitalNotEqualTo(String value) {
            addCriterion("indication_hospital <>", value, "indicationHospital");
            return (Criteria) this;
        }

        public Criteria andIndicationHospitalGreaterThan(String value) {
            addCriterion("indication_hospital >", value, "indicationHospital");
            return (Criteria) this;
        }

        public Criteria andIndicationHospitalGreaterThanOrEqualTo(String value) {
            addCriterion("indication_hospital >=", value, "indicationHospital");
            return (Criteria) this;
        }

        public Criteria andIndicationHospitalLessThan(String value) {
            addCriterion("indication_hospital <", value, "indicationHospital");
            return (Criteria) this;
        }

        public Criteria andIndicationHospitalLessThanOrEqualTo(String value) {
            addCriterion("indication_hospital <=", value, "indicationHospital");
            return (Criteria) this;
        }

        public Criteria andIndicationHospitalLike(String value) {
            addCriterion("indication_hospital like", value, "indicationHospital");
            return (Criteria) this;
        }

        public Criteria andIndicationHospitalNotLike(String value) {
            addCriterion("indication_hospital not like", value, "indicationHospital");
            return (Criteria) this;
        }

        public Criteria andIndicationHospitalIn(List<String> values) {
            addCriterion("indication_hospital in", values, "indicationHospital");
            return (Criteria) this;
        }

        public Criteria andIndicationHospitalNotIn(List<String> values) {
            addCriterion("indication_hospital not in", values, "indicationHospital");
            return (Criteria) this;
        }

        public Criteria andIndicationHospitalBetween(String value1, String value2) {
            addCriterion("indication_hospital between", value1, value2, "indicationHospital");
            return (Criteria) this;
        }

        public Criteria andIndicationHospitalNotBetween(String value1, String value2) {
            addCriterion("indication_hospital not between", value1, value2, "indicationHospital");
            return (Criteria) this;
        }

        public Criteria andIndicationDoctorIsNull() {
            addCriterion("indication_doctor is null");
            return (Criteria) this;
        }

        public Criteria andIndicationDoctorIsNotNull() {
            addCriterion("indication_doctor is not null");
            return (Criteria) this;
        }

        public Criteria andIndicationDoctorEqualTo(String value) {
            addCriterion("indication_doctor =", value, "indicationDoctor");
            return (Criteria) this;
        }

        public Criteria andIndicationDoctorNotEqualTo(String value) {
            addCriterion("indication_doctor <>", value, "indicationDoctor");
            return (Criteria) this;
        }

        public Criteria andIndicationDoctorGreaterThan(String value) {
            addCriterion("indication_doctor >", value, "indicationDoctor");
            return (Criteria) this;
        }

        public Criteria andIndicationDoctorGreaterThanOrEqualTo(String value) {
            addCriterion("indication_doctor >=", value, "indicationDoctor");
            return (Criteria) this;
        }

        public Criteria andIndicationDoctorLessThan(String value) {
            addCriterion("indication_doctor <", value, "indicationDoctor");
            return (Criteria) this;
        }

        public Criteria andIndicationDoctorLessThanOrEqualTo(String value) {
            addCriterion("indication_doctor <=", value, "indicationDoctor");
            return (Criteria) this;
        }

        public Criteria andIndicationDoctorLike(String value) {
            addCriterion("indication_doctor like", value, "indicationDoctor");
            return (Criteria) this;
        }

        public Criteria andIndicationDoctorNotLike(String value) {
            addCriterion("indication_doctor not like", value, "indicationDoctor");
            return (Criteria) this;
        }

        public Criteria andIndicationDoctorIn(List<String> values) {
            addCriterion("indication_doctor in", values, "indicationDoctor");
            return (Criteria) this;
        }

        public Criteria andIndicationDoctorNotIn(List<String> values) {
            addCriterion("indication_doctor not in", values, "indicationDoctor");
            return (Criteria) this;
        }

        public Criteria andIndicationDoctorBetween(String value1, String value2) {
            addCriterion("indication_doctor between", value1, value2, "indicationDoctor");
            return (Criteria) this;
        }

        public Criteria andIndicationDoctorNotBetween(String value1, String value2) {
            addCriterion("indication_doctor not between", value1, value2, "indicationDoctor");
            return (Criteria) this;
        }

        public Criteria andPrincipalDiseaseIsNull() {
            addCriterion("principal_disease is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalDiseaseIsNotNull() {
            addCriterion("principal_disease is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalDiseaseEqualTo(String value) {
            addCriterion("principal_disease =", value, "principalDisease");
            return (Criteria) this;
        }

        public Criteria andPrincipalDiseaseNotEqualTo(String value) {
            addCriterion("principal_disease <>", value, "principalDisease");
            return (Criteria) this;
        }

        public Criteria andPrincipalDiseaseGreaterThan(String value) {
            addCriterion("principal_disease >", value, "principalDisease");
            return (Criteria) this;
        }

        public Criteria andPrincipalDiseaseGreaterThanOrEqualTo(String value) {
            addCriterion("principal_disease >=", value, "principalDisease");
            return (Criteria) this;
        }

        public Criteria andPrincipalDiseaseLessThan(String value) {
            addCriterion("principal_disease <", value, "principalDisease");
            return (Criteria) this;
        }

        public Criteria andPrincipalDiseaseLessThanOrEqualTo(String value) {
            addCriterion("principal_disease <=", value, "principalDisease");
            return (Criteria) this;
        }

        public Criteria andPrincipalDiseaseLike(String value) {
            addCriterion("principal_disease like", value, "principalDisease");
            return (Criteria) this;
        }

        public Criteria andPrincipalDiseaseNotLike(String value) {
            addCriterion("principal_disease not like", value, "principalDisease");
            return (Criteria) this;
        }

        public Criteria andPrincipalDiseaseIn(List<String> values) {
            addCriterion("principal_disease in", values, "principalDisease");
            return (Criteria) this;
        }

        public Criteria andPrincipalDiseaseNotIn(List<String> values) {
            addCriterion("principal_disease not in", values, "principalDisease");
            return (Criteria) this;
        }

        public Criteria andPrincipalDiseaseBetween(String value1, String value2) {
            addCriterion("principal_disease between", value1, value2, "principalDisease");
            return (Criteria) this;
        }

        public Criteria andPrincipalDiseaseNotBetween(String value1, String value2) {
            addCriterion("principal_disease not between", value1, value2, "principalDisease");
            return (Criteria) this;
        }

        public Criteria andDiseasesHistoryIsNull() {
            addCriterion("diseases_history is null");
            return (Criteria) this;
        }

        public Criteria andDiseasesHistoryIsNotNull() {
            addCriterion("diseases_history is not null");
            return (Criteria) this;
        }

        public Criteria andDiseasesHistoryEqualTo(String value) {
            addCriterion("diseases_history =", value, "diseasesHistory");
            return (Criteria) this;
        }

        public Criteria andDiseasesHistoryNotEqualTo(String value) {
            addCriterion("diseases_history <>", value, "diseasesHistory");
            return (Criteria) this;
        }

        public Criteria andDiseasesHistoryGreaterThan(String value) {
            addCriterion("diseases_history >", value, "diseasesHistory");
            return (Criteria) this;
        }

        public Criteria andDiseasesHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("diseases_history >=", value, "diseasesHistory");
            return (Criteria) this;
        }

        public Criteria andDiseasesHistoryLessThan(String value) {
            addCriterion("diseases_history <", value, "diseasesHistory");
            return (Criteria) this;
        }

        public Criteria andDiseasesHistoryLessThanOrEqualTo(String value) {
            addCriterion("diseases_history <=", value, "diseasesHistory");
            return (Criteria) this;
        }

        public Criteria andDiseasesHistoryLike(String value) {
            addCriterion("diseases_history like", value, "diseasesHistory");
            return (Criteria) this;
        }

        public Criteria andDiseasesHistoryNotLike(String value) {
            addCriterion("diseases_history not like", value, "diseasesHistory");
            return (Criteria) this;
        }

        public Criteria andDiseasesHistoryIn(List<String> values) {
            addCriterion("diseases_history in", values, "diseasesHistory");
            return (Criteria) this;
        }

        public Criteria andDiseasesHistoryNotIn(List<String> values) {
            addCriterion("diseases_history not in", values, "diseasesHistory");
            return (Criteria) this;
        }

        public Criteria andDiseasesHistoryBetween(String value1, String value2) {
            addCriterion("diseases_history between", value1, value2, "diseasesHistory");
            return (Criteria) this;
        }

        public Criteria andDiseasesHistoryNotBetween(String value1, String value2) {
            addCriterion("diseases_history not between", value1, value2, "diseasesHistory");
            return (Criteria) this;
        }

        public Criteria andHospitalTelIsNull() {
            addCriterion("hospital_tel is null");
            return (Criteria) this;
        }

        public Criteria andHospitalTelIsNotNull() {
            addCriterion("hospital_tel is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalTelEqualTo(String value) {
            addCriterion("hospital_tel =", value, "hospitalTel");
            return (Criteria) this;
        }

        public Criteria andHospitalTelNotEqualTo(String value) {
            addCriterion("hospital_tel <>", value, "hospitalTel");
            return (Criteria) this;
        }

        public Criteria andHospitalTelGreaterThan(String value) {
            addCriterion("hospital_tel >", value, "hospitalTel");
            return (Criteria) this;
        }

        public Criteria andHospitalTelGreaterThanOrEqualTo(String value) {
            addCriterion("hospital_tel >=", value, "hospitalTel");
            return (Criteria) this;
        }

        public Criteria andHospitalTelLessThan(String value) {
            addCriterion("hospital_tel <", value, "hospitalTel");
            return (Criteria) this;
        }

        public Criteria andHospitalTelLessThanOrEqualTo(String value) {
            addCriterion("hospital_tel <=", value, "hospitalTel");
            return (Criteria) this;
        }

        public Criteria andHospitalTelLike(String value) {
            addCriterion("hospital_tel like", value, "hospitalTel");
            return (Criteria) this;
        }

        public Criteria andHospitalTelNotLike(String value) {
            addCriterion("hospital_tel not like", value, "hospitalTel");
            return (Criteria) this;
        }

        public Criteria andHospitalTelIn(List<String> values) {
            addCriterion("hospital_tel in", values, "hospitalTel");
            return (Criteria) this;
        }

        public Criteria andHospitalTelNotIn(List<String> values) {
            addCriterion("hospital_tel not in", values, "hospitalTel");
            return (Criteria) this;
        }

        public Criteria andHospitalTelBetween(String value1, String value2) {
            addCriterion("hospital_tel between", value1, value2, "hospitalTel");
            return (Criteria) this;
        }

        public Criteria andHospitalTelNotBetween(String value1, String value2) {
            addCriterion("hospital_tel not between", value1, value2, "hospitalTel");
            return (Criteria) this;
        }

        public Criteria andDietCharacteristicsIsNull() {
            addCriterion("diet_characteristics is null");
            return (Criteria) this;
        }

        public Criteria andDietCharacteristicsIsNotNull() {
            addCriterion("diet_characteristics is not null");
            return (Criteria) this;
        }

        public Criteria andDietCharacteristicsEqualTo(String value) {
            addCriterion("diet_characteristics =", value, "dietCharacteristics");
            return (Criteria) this;
        }

        public Criteria andDietCharacteristicsNotEqualTo(String value) {
            addCriterion("diet_characteristics <>", value, "dietCharacteristics");
            return (Criteria) this;
        }

        public Criteria andDietCharacteristicsGreaterThan(String value) {
            addCriterion("diet_characteristics >", value, "dietCharacteristics");
            return (Criteria) this;
        }

        public Criteria andDietCharacteristicsGreaterThanOrEqualTo(String value) {
            addCriterion("diet_characteristics >=", value, "dietCharacteristics");
            return (Criteria) this;
        }

        public Criteria andDietCharacteristicsLessThan(String value) {
            addCriterion("diet_characteristics <", value, "dietCharacteristics");
            return (Criteria) this;
        }

        public Criteria andDietCharacteristicsLessThanOrEqualTo(String value) {
            addCriterion("diet_characteristics <=", value, "dietCharacteristics");
            return (Criteria) this;
        }

        public Criteria andDietCharacteristicsLike(String value) {
            addCriterion("diet_characteristics like", value, "dietCharacteristics");
            return (Criteria) this;
        }

        public Criteria andDietCharacteristicsNotLike(String value) {
            addCriterion("diet_characteristics not like", value, "dietCharacteristics");
            return (Criteria) this;
        }

        public Criteria andDietCharacteristicsIn(List<String> values) {
            addCriterion("diet_characteristics in", values, "dietCharacteristics");
            return (Criteria) this;
        }

        public Criteria andDietCharacteristicsNotIn(List<String> values) {
            addCriterion("diet_characteristics not in", values, "dietCharacteristics");
            return (Criteria) this;
        }

        public Criteria andDietCharacteristicsBetween(String value1, String value2) {
            addCriterion("diet_characteristics between", value1, value2, "dietCharacteristics");
            return (Criteria) this;
        }

        public Criteria andDietCharacteristicsNotBetween(String value1, String value2) {
            addCriterion("diet_characteristics not between", value1, value2, "dietCharacteristics");
            return (Criteria) this;
        }

        public Criteria andDispositionIsNull() {
            addCriterion("disposition is null");
            return (Criteria) this;
        }

        public Criteria andDispositionIsNotNull() {
            addCriterion("disposition is not null");
            return (Criteria) this;
        }

        public Criteria andDispositionEqualTo(String value) {
            addCriterion("disposition =", value, "disposition");
            return (Criteria) this;
        }

        public Criteria andDispositionNotEqualTo(String value) {
            addCriterion("disposition <>", value, "disposition");
            return (Criteria) this;
        }

        public Criteria andDispositionGreaterThan(String value) {
            addCriterion("disposition >", value, "disposition");
            return (Criteria) this;
        }

        public Criteria andDispositionGreaterThanOrEqualTo(String value) {
            addCriterion("disposition >=", value, "disposition");
            return (Criteria) this;
        }

        public Criteria andDispositionLessThan(String value) {
            addCriterion("disposition <", value, "disposition");
            return (Criteria) this;
        }

        public Criteria andDispositionLessThanOrEqualTo(String value) {
            addCriterion("disposition <=", value, "disposition");
            return (Criteria) this;
        }

        public Criteria andDispositionLike(String value) {
            addCriterion("disposition like", value, "disposition");
            return (Criteria) this;
        }

        public Criteria andDispositionNotLike(String value) {
            addCriterion("disposition not like", value, "disposition");
            return (Criteria) this;
        }

        public Criteria andDispositionIn(List<String> values) {
            addCriterion("disposition in", values, "disposition");
            return (Criteria) this;
        }

        public Criteria andDispositionNotIn(List<String> values) {
            addCriterion("disposition not in", values, "disposition");
            return (Criteria) this;
        }

        public Criteria andDispositionBetween(String value1, String value2) {
            addCriterion("disposition between", value1, value2, "disposition");
            return (Criteria) this;
        }

        public Criteria andDispositionNotBetween(String value1, String value2) {
            addCriterion("disposition not between", value1, value2, "disposition");
            return (Criteria) this;
        }

        public Criteria andHobbyIsNull() {
            addCriterion("hobby is null");
            return (Criteria) this;
        }

        public Criteria andHobbyIsNotNull() {
            addCriterion("hobby is not null");
            return (Criteria) this;
        }

        public Criteria andHobbyEqualTo(String value) {
            addCriterion("hobby =", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotEqualTo(String value) {
            addCriterion("hobby <>", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyGreaterThan(String value) {
            addCriterion("hobby >", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyGreaterThanOrEqualTo(String value) {
            addCriterion("hobby >=", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLessThan(String value) {
            addCriterion("hobby <", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLessThanOrEqualTo(String value) {
            addCriterion("hobby <=", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLike(String value) {
            addCriterion("hobby like", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotLike(String value) {
            addCriterion("hobby not like", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyIn(List<String> values) {
            addCriterion("hobby in", values, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotIn(List<String> values) {
            addCriterion("hobby not in", values, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyBetween(String value1, String value2) {
            addCriterion("hobby between", value1, value2, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotBetween(String value1, String value2) {
            addCriterion("hobby not between", value1, value2, "hobby");
            return (Criteria) this;
        }

        public Criteria andSpecialRequirementsIsNull() {
            addCriterion("special_requirements is null");
            return (Criteria) this;
        }

        public Criteria andSpecialRequirementsIsNotNull() {
            addCriterion("special_requirements is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialRequirementsEqualTo(String value) {
            addCriterion("special_requirements =", value, "specialRequirements");
            return (Criteria) this;
        }

        public Criteria andSpecialRequirementsNotEqualTo(String value) {
            addCriterion("special_requirements <>", value, "specialRequirements");
            return (Criteria) this;
        }

        public Criteria andSpecialRequirementsGreaterThan(String value) {
            addCriterion("special_requirements >", value, "specialRequirements");
            return (Criteria) this;
        }

        public Criteria andSpecialRequirementsGreaterThanOrEqualTo(String value) {
            addCriterion("special_requirements >=", value, "specialRequirements");
            return (Criteria) this;
        }

        public Criteria andSpecialRequirementsLessThan(String value) {
            addCriterion("special_requirements <", value, "specialRequirements");
            return (Criteria) this;
        }

        public Criteria andSpecialRequirementsLessThanOrEqualTo(String value) {
            addCriterion("special_requirements <=", value, "specialRequirements");
            return (Criteria) this;
        }

        public Criteria andSpecialRequirementsLike(String value) {
            addCriterion("special_requirements like", value, "specialRequirements");
            return (Criteria) this;
        }

        public Criteria andSpecialRequirementsNotLike(String value) {
            addCriterion("special_requirements not like", value, "specialRequirements");
            return (Criteria) this;
        }

        public Criteria andSpecialRequirementsIn(List<String> values) {
            addCriterion("special_requirements in", values, "specialRequirements");
            return (Criteria) this;
        }

        public Criteria andSpecialRequirementsNotIn(List<String> values) {
            addCriterion("special_requirements not in", values, "specialRequirements");
            return (Criteria) this;
        }

        public Criteria andSpecialRequirementsBetween(String value1, String value2) {
            addCriterion("special_requirements between", value1, value2, "specialRequirements");
            return (Criteria) this;
        }

        public Criteria andSpecialRequirementsNotBetween(String value1, String value2) {
            addCriterion("special_requirements not between", value1, value2, "specialRequirements");
            return (Criteria) this;
        }

        public Criteria andAbnormalPatternsIsNull() {
            addCriterion("abnormal_patterns is null");
            return (Criteria) this;
        }

        public Criteria andAbnormalPatternsIsNotNull() {
            addCriterion("abnormal_patterns is not null");
            return (Criteria) this;
        }

        public Criteria andAbnormalPatternsEqualTo(String value) {
            addCriterion("abnormal_patterns =", value, "abnormalPatterns");
            return (Criteria) this;
        }

        public Criteria andAbnormalPatternsNotEqualTo(String value) {
            addCriterion("abnormal_patterns <>", value, "abnormalPatterns");
            return (Criteria) this;
        }

        public Criteria andAbnormalPatternsGreaterThan(String value) {
            addCriterion("abnormal_patterns >", value, "abnormalPatterns");
            return (Criteria) this;
        }

        public Criteria andAbnormalPatternsGreaterThanOrEqualTo(String value) {
            addCriterion("abnormal_patterns >=", value, "abnormalPatterns");
            return (Criteria) this;
        }

        public Criteria andAbnormalPatternsLessThan(String value) {
            addCriterion("abnormal_patterns <", value, "abnormalPatterns");
            return (Criteria) this;
        }

        public Criteria andAbnormalPatternsLessThanOrEqualTo(String value) {
            addCriterion("abnormal_patterns <=", value, "abnormalPatterns");
            return (Criteria) this;
        }

        public Criteria andAbnormalPatternsLike(String value) {
            addCriterion("abnormal_patterns like", value, "abnormalPatterns");
            return (Criteria) this;
        }

        public Criteria andAbnormalPatternsNotLike(String value) {
            addCriterion("abnormal_patterns not like", value, "abnormalPatterns");
            return (Criteria) this;
        }

        public Criteria andAbnormalPatternsIn(List<String> values) {
            addCriterion("abnormal_patterns in", values, "abnormalPatterns");
            return (Criteria) this;
        }

        public Criteria andAbnormalPatternsNotIn(List<String> values) {
            addCriterion("abnormal_patterns not in", values, "abnormalPatterns");
            return (Criteria) this;
        }

        public Criteria andAbnormalPatternsBetween(String value1, String value2) {
            addCriterion("abnormal_patterns between", value1, value2, "abnormalPatterns");
            return (Criteria) this;
        }

        public Criteria andAbnormalPatternsNotBetween(String value1, String value2) {
            addCriterion("abnormal_patterns not between", value1, value2, "abnormalPatterns");
            return (Criteria) this;
        }

        public Criteria andOlderStateIsNull() {
            addCriterion("older_state is null");
            return (Criteria) this;
        }

        public Criteria andOlderStateIsNotNull() {
            addCriterion("older_state is not null");
            return (Criteria) this;
        }

        public Criteria andOlderStateEqualTo(Byte value) {
            addCriterion("older_state =", value, "olderState");
            return (Criteria) this;
        }

        public Criteria andOlderStateNotEqualTo(Byte value) {
            addCriterion("older_state <>", value, "olderState");
            return (Criteria) this;
        }

        public Criteria andOlderStateGreaterThan(Byte value) {
            addCriterion("older_state >", value, "olderState");
            return (Criteria) this;
        }

        public Criteria andOlderStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("older_state >=", value, "olderState");
            return (Criteria) this;
        }

        public Criteria andOlderStateLessThan(Byte value) {
            addCriterion("older_state <", value, "olderState");
            return (Criteria) this;
        }

        public Criteria andOlderStateLessThanOrEqualTo(Byte value) {
            addCriterion("older_state <=", value, "olderState");
            return (Criteria) this;
        }

        public Criteria andOlderStateIn(List<Byte> values) {
            addCriterion("older_state in", values, "olderState");
            return (Criteria) this;
        }

        public Criteria andOlderStateNotIn(List<Byte> values) {
            addCriterion("older_state not in", values, "olderState");
            return (Criteria) this;
        }

        public Criteria andOlderStateBetween(Byte value1, Byte value2) {
            addCriterion("older_state between", value1, value2, "olderState");
            return (Criteria) this;
        }

        public Criteria andOlderStateNotBetween(Byte value1, Byte value2) {
            addCriterion("older_state not between", value1, value2, "olderState");
            return (Criteria) this;
        }

        public Criteria andOlderLeaveDateIsNull() {
            addCriterion("older_leave_date is null");
            return (Criteria) this;
        }

        public Criteria andOlderLeaveDateIsNotNull() {
            addCriterion("older_leave_date is not null");
            return (Criteria) this;
        }

        public Criteria andOlderLeaveDateEqualTo(Date value) {
            addCriterion("older_leave_date =", value, "olderLeaveDate");
            return (Criteria) this;
        }

        public Criteria andOlderLeaveDateNotEqualTo(Date value) {
            addCriterion("older_leave_date <>", value, "olderLeaveDate");
            return (Criteria) this;
        }

        public Criteria andOlderLeaveDateGreaterThan(Date value) {
            addCriterion("older_leave_date >", value, "olderLeaveDate");
            return (Criteria) this;
        }

        public Criteria andOlderLeaveDateGreaterThanOrEqualTo(Date value) {
            addCriterion("older_leave_date >=", value, "olderLeaveDate");
            return (Criteria) this;
        }

        public Criteria andOlderLeaveDateLessThan(Date value) {
            addCriterion("older_leave_date <", value, "olderLeaveDate");
            return (Criteria) this;
        }

        public Criteria andOlderLeaveDateLessThanOrEqualTo(Date value) {
            addCriterion("older_leave_date <=", value, "olderLeaveDate");
            return (Criteria) this;
        }

        public Criteria andOlderLeaveDateIn(List<Date> values) {
            addCriterion("older_leave_date in", values, "olderLeaveDate");
            return (Criteria) this;
        }

        public Criteria andOlderLeaveDateNotIn(List<Date> values) {
            addCriterion("older_leave_date not in", values, "olderLeaveDate");
            return (Criteria) this;
        }

        public Criteria andOlderLeaveDateBetween(Date value1, Date value2) {
            addCriterion("older_leave_date between", value1, value2, "olderLeaveDate");
            return (Criteria) this;
        }

        public Criteria andOlderLeaveDateNotBetween(Date value1, Date value2) {
            addCriterion("older_leave_date not between", value1, value2, "olderLeaveDate");
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