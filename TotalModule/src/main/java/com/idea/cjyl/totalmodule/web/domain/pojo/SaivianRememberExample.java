package com.idea.cjyl.totalmodule.web.domain.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaivianRememberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaivianRememberExample() {
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

        public Criteria andSaivianIdIsNull() {
            addCriterion("saivian_id is null");
            return (Criteria) this;
        }

        public Criteria andSaivianIdIsNotNull() {
            addCriterion("saivian_id is not null");
            return (Criteria) this;
        }

        public Criteria andSaivianIdEqualTo(Long value) {
            addCriterion("saivian_id =", value, "saivianId");
            return (Criteria) this;
        }

        public Criteria andSaivianIdNotEqualTo(Long value) {
            addCriterion("saivian_id <>", value, "saivianId");
            return (Criteria) this;
        }

        public Criteria andSaivianIdGreaterThan(Long value) {
            addCriterion("saivian_id >", value, "saivianId");
            return (Criteria) this;
        }

        public Criteria andSaivianIdGreaterThanOrEqualTo(Long value) {
            addCriterion("saivian_id >=", value, "saivianId");
            return (Criteria) this;
        }

        public Criteria andSaivianIdLessThan(Long value) {
            addCriterion("saivian_id <", value, "saivianId");
            return (Criteria) this;
        }

        public Criteria andSaivianIdLessThanOrEqualTo(Long value) {
            addCriterion("saivian_id <=", value, "saivianId");
            return (Criteria) this;
        }

        public Criteria andSaivianIdIn(List<Long> values) {
            addCriterion("saivian_id in", values, "saivianId");
            return (Criteria) this;
        }

        public Criteria andSaivianIdNotIn(List<Long> values) {
            addCriterion("saivian_id not in", values, "saivianId");
            return (Criteria) this;
        }

        public Criteria andSaivianIdBetween(Long value1, Long value2) {
            addCriterion("saivian_id between", value1, value2, "saivianId");
            return (Criteria) this;
        }

        public Criteria andSaivianIdNotBetween(Long value1, Long value2) {
            addCriterion("saivian_id not between", value1, value2, "saivianId");
            return (Criteria) this;
        }

        public Criteria andSaivianUserNameIsNull() {
            addCriterion("saivian_user_name is null");
            return (Criteria) this;
        }

        public Criteria andSaivianUserNameIsNotNull() {
            addCriterion("saivian_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andSaivianUserNameEqualTo(String value) {
            addCriterion("saivian_user_name =", value, "saivianUserName");
            return (Criteria) this;
        }

        public Criteria andSaivianUserNameNotEqualTo(String value) {
            addCriterion("saivian_user_name <>", value, "saivianUserName");
            return (Criteria) this;
        }

        public Criteria andSaivianUserNameGreaterThan(String value) {
            addCriterion("saivian_user_name >", value, "saivianUserName");
            return (Criteria) this;
        }

        public Criteria andSaivianUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("saivian_user_name >=", value, "saivianUserName");
            return (Criteria) this;
        }

        public Criteria andSaivianUserNameLessThan(String value) {
            addCriterion("saivian_user_name <", value, "saivianUserName");
            return (Criteria) this;
        }

        public Criteria andSaivianUserNameLessThanOrEqualTo(String value) {
            addCriterion("saivian_user_name <=", value, "saivianUserName");
            return (Criteria) this;
        }

        public Criteria andSaivianUserNameLike(String value) {
            addCriterion("saivian_user_name like", value, "saivianUserName");
            return (Criteria) this;
        }

        public Criteria andSaivianUserNameNotLike(String value) {
            addCriterion("saivian_user_name not like", value, "saivianUserName");
            return (Criteria) this;
        }

        public Criteria andSaivianUserNameIn(List<String> values) {
            addCriterion("saivian_user_name in", values, "saivianUserName");
            return (Criteria) this;
        }

        public Criteria andSaivianUserNameNotIn(List<String> values) {
            addCriterion("saivian_user_name not in", values, "saivianUserName");
            return (Criteria) this;
        }

        public Criteria andSaivianUserNameBetween(String value1, String value2) {
            addCriterion("saivian_user_name between", value1, value2, "saivianUserName");
            return (Criteria) this;
        }

        public Criteria andSaivianUserNameNotBetween(String value1, String value2) {
            addCriterion("saivian_user_name not between", value1, value2, "saivianUserName");
            return (Criteria) this;
        }

        public Criteria andSaivianLoginNameIsNull() {
            addCriterion("saivian_login_name is null");
            return (Criteria) this;
        }

        public Criteria andSaivianLoginNameIsNotNull() {
            addCriterion("saivian_login_name is not null");
            return (Criteria) this;
        }

        public Criteria andSaivianLoginNameEqualTo(String value) {
            addCriterion("saivian_login_name =", value, "saivianLoginName");
            return (Criteria) this;
        }

        public Criteria andSaivianLoginNameNotEqualTo(String value) {
            addCriterion("saivian_login_name <>", value, "saivianLoginName");
            return (Criteria) this;
        }

        public Criteria andSaivianLoginNameGreaterThan(String value) {
            addCriterion("saivian_login_name >", value, "saivianLoginName");
            return (Criteria) this;
        }

        public Criteria andSaivianLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("saivian_login_name >=", value, "saivianLoginName");
            return (Criteria) this;
        }

        public Criteria andSaivianLoginNameLessThan(String value) {
            addCriterion("saivian_login_name <", value, "saivianLoginName");
            return (Criteria) this;
        }

        public Criteria andSaivianLoginNameLessThanOrEqualTo(String value) {
            addCriterion("saivian_login_name <=", value, "saivianLoginName");
            return (Criteria) this;
        }

        public Criteria andSaivianLoginNameLike(String value) {
            addCriterion("saivian_login_name like", value, "saivianLoginName");
            return (Criteria) this;
        }

        public Criteria andSaivianLoginNameNotLike(String value) {
            addCriterion("saivian_login_name not like", value, "saivianLoginName");
            return (Criteria) this;
        }

        public Criteria andSaivianLoginNameIn(List<String> values) {
            addCriterion("saivian_login_name in", values, "saivianLoginName");
            return (Criteria) this;
        }

        public Criteria andSaivianLoginNameNotIn(List<String> values) {
            addCriterion("saivian_login_name not in", values, "saivianLoginName");
            return (Criteria) this;
        }

        public Criteria andSaivianLoginNameBetween(String value1, String value2) {
            addCriterion("saivian_login_name between", value1, value2, "saivianLoginName");
            return (Criteria) this;
        }

        public Criteria andSaivianLoginNameNotBetween(String value1, String value2) {
            addCriterion("saivian_login_name not between", value1, value2, "saivianLoginName");
            return (Criteria) this;
        }

        public Criteria andSaivianLoginPasswordIsNull() {
            addCriterion("saivian_login_password is null");
            return (Criteria) this;
        }

        public Criteria andSaivianLoginPasswordIsNotNull() {
            addCriterion("saivian_login_password is not null");
            return (Criteria) this;
        }

        public Criteria andSaivianLoginPasswordEqualTo(String value) {
            addCriterion("saivian_login_password =", value, "saivianLoginPassword");
            return (Criteria) this;
        }

        public Criteria andSaivianLoginPasswordNotEqualTo(String value) {
            addCriterion("saivian_login_password <>", value, "saivianLoginPassword");
            return (Criteria) this;
        }

        public Criteria andSaivianLoginPasswordGreaterThan(String value) {
            addCriterion("saivian_login_password >", value, "saivianLoginPassword");
            return (Criteria) this;
        }

        public Criteria andSaivianLoginPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("saivian_login_password >=", value, "saivianLoginPassword");
            return (Criteria) this;
        }

        public Criteria andSaivianLoginPasswordLessThan(String value) {
            addCriterion("saivian_login_password <", value, "saivianLoginPassword");
            return (Criteria) this;
        }

        public Criteria andSaivianLoginPasswordLessThanOrEqualTo(String value) {
            addCriterion("saivian_login_password <=", value, "saivianLoginPassword");
            return (Criteria) this;
        }

        public Criteria andSaivianLoginPasswordLike(String value) {
            addCriterion("saivian_login_password like", value, "saivianLoginPassword");
            return (Criteria) this;
        }

        public Criteria andSaivianLoginPasswordNotLike(String value) {
            addCriterion("saivian_login_password not like", value, "saivianLoginPassword");
            return (Criteria) this;
        }

        public Criteria andSaivianLoginPasswordIn(List<String> values) {
            addCriterion("saivian_login_password in", values, "saivianLoginPassword");
            return (Criteria) this;
        }

        public Criteria andSaivianLoginPasswordNotIn(List<String> values) {
            addCriterion("saivian_login_password not in", values, "saivianLoginPassword");
            return (Criteria) this;
        }

        public Criteria andSaivianLoginPasswordBetween(String value1, String value2) {
            addCriterion("saivian_login_password between", value1, value2, "saivianLoginPassword");
            return (Criteria) this;
        }

        public Criteria andSaivianLoginPasswordNotBetween(String value1, String value2) {
            addCriterion("saivian_login_password not between", value1, value2, "saivianLoginPassword");
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

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailPwdIsNull() {
            addCriterion("email_pwd is null");
            return (Criteria) this;
        }

        public Criteria andEmailPwdIsNotNull() {
            addCriterion("email_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andEmailPwdEqualTo(String value) {
            addCriterion("email_pwd =", value, "emailPwd");
            return (Criteria) this;
        }

        public Criteria andEmailPwdNotEqualTo(String value) {
            addCriterion("email_pwd <>", value, "emailPwd");
            return (Criteria) this;
        }

        public Criteria andEmailPwdGreaterThan(String value) {
            addCriterion("email_pwd >", value, "emailPwd");
            return (Criteria) this;
        }

        public Criteria andEmailPwdGreaterThanOrEqualTo(String value) {
            addCriterion("email_pwd >=", value, "emailPwd");
            return (Criteria) this;
        }

        public Criteria andEmailPwdLessThan(String value) {
            addCriterion("email_pwd <", value, "emailPwd");
            return (Criteria) this;
        }

        public Criteria andEmailPwdLessThanOrEqualTo(String value) {
            addCriterion("email_pwd <=", value, "emailPwd");
            return (Criteria) this;
        }

        public Criteria andEmailPwdLike(String value) {
            addCriterion("email_pwd like", value, "emailPwd");
            return (Criteria) this;
        }

        public Criteria andEmailPwdNotLike(String value) {
            addCriterion("email_pwd not like", value, "emailPwd");
            return (Criteria) this;
        }

        public Criteria andEmailPwdIn(List<String> values) {
            addCriterion("email_pwd in", values, "emailPwd");
            return (Criteria) this;
        }

        public Criteria andEmailPwdNotIn(List<String> values) {
            addCriterion("email_pwd not in", values, "emailPwd");
            return (Criteria) this;
        }

        public Criteria andEmailPwdBetween(String value1, String value2) {
            addCriterion("email_pwd between", value1, value2, "emailPwd");
            return (Criteria) this;
        }

        public Criteria andEmailPwdNotBetween(String value1, String value2) {
            addCriterion("email_pwd not between", value1, value2, "emailPwd");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankTypeIsNull() {
            addCriterion("bank_type is null");
            return (Criteria) this;
        }

        public Criteria andBankTypeIsNotNull() {
            addCriterion("bank_type is not null");
            return (Criteria) this;
        }

        public Criteria andBankTypeEqualTo(Byte value) {
            addCriterion("bank_type =", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeNotEqualTo(Byte value) {
            addCriterion("bank_type <>", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeGreaterThan(Byte value) {
            addCriterion("bank_type >", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("bank_type >=", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeLessThan(Byte value) {
            addCriterion("bank_type <", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeLessThanOrEqualTo(Byte value) {
            addCriterion("bank_type <=", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeIn(List<Byte> values) {
            addCriterion("bank_type in", values, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeNotIn(List<Byte> values) {
            addCriterion("bank_type not in", values, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeBetween(Byte value1, Byte value2) {
            addCriterion("bank_type between", value1, value2, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("bank_type not between", value1, value2, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankCardNumIsNull() {
            addCriterion("bank_card_num is null");
            return (Criteria) this;
        }

        public Criteria andBankCardNumIsNotNull() {
            addCriterion("bank_card_num is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardNumEqualTo(String value) {
            addCriterion("bank_card_num =", value, "bankCardNum");
            return (Criteria) this;
        }

        public Criteria andBankCardNumNotEqualTo(String value) {
            addCriterion("bank_card_num <>", value, "bankCardNum");
            return (Criteria) this;
        }

        public Criteria andBankCardNumGreaterThan(String value) {
            addCriterion("bank_card_num >", value, "bankCardNum");
            return (Criteria) this;
        }

        public Criteria andBankCardNumGreaterThanOrEqualTo(String value) {
            addCriterion("bank_card_num >=", value, "bankCardNum");
            return (Criteria) this;
        }

        public Criteria andBankCardNumLessThan(String value) {
            addCriterion("bank_card_num <", value, "bankCardNum");
            return (Criteria) this;
        }

        public Criteria andBankCardNumLessThanOrEqualTo(String value) {
            addCriterion("bank_card_num <=", value, "bankCardNum");
            return (Criteria) this;
        }

        public Criteria andBankCardNumLike(String value) {
            addCriterion("bank_card_num like", value, "bankCardNum");
            return (Criteria) this;
        }

        public Criteria andBankCardNumNotLike(String value) {
            addCriterion("bank_card_num not like", value, "bankCardNum");
            return (Criteria) this;
        }

        public Criteria andBankCardNumIn(List<String> values) {
            addCriterion("bank_card_num in", values, "bankCardNum");
            return (Criteria) this;
        }

        public Criteria andBankCardNumNotIn(List<String> values) {
            addCriterion("bank_card_num not in", values, "bankCardNum");
            return (Criteria) this;
        }

        public Criteria andBankCardNumBetween(String value1, String value2) {
            addCriterion("bank_card_num between", value1, value2, "bankCardNum");
            return (Criteria) this;
        }

        public Criteria andBankCardNumNotBetween(String value1, String value2) {
            addCriterion("bank_card_num not between", value1, value2, "bankCardNum");
            return (Criteria) this;
        }

        public Criteria andBankEffectiveDateIsNull() {
            addCriterion("bank_effective_date is null");
            return (Criteria) this;
        }

        public Criteria andBankEffectiveDateIsNotNull() {
            addCriterion("bank_effective_date is not null");
            return (Criteria) this;
        }

        public Criteria andBankEffectiveDateEqualTo(String value) {
            addCriterion("bank_effective_date =", value, "bankEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andBankEffectiveDateNotEqualTo(String value) {
            addCriterion("bank_effective_date <>", value, "bankEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andBankEffectiveDateGreaterThan(String value) {
            addCriterion("bank_effective_date >", value, "bankEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andBankEffectiveDateGreaterThanOrEqualTo(String value) {
            addCriterion("bank_effective_date >=", value, "bankEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andBankEffectiveDateLessThan(String value) {
            addCriterion("bank_effective_date <", value, "bankEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andBankEffectiveDateLessThanOrEqualTo(String value) {
            addCriterion("bank_effective_date <=", value, "bankEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andBankEffectiveDateLike(String value) {
            addCriterion("bank_effective_date like", value, "bankEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andBankEffectiveDateNotLike(String value) {
            addCriterion("bank_effective_date not like", value, "bankEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andBankEffectiveDateIn(List<String> values) {
            addCriterion("bank_effective_date in", values, "bankEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andBankEffectiveDateNotIn(List<String> values) {
            addCriterion("bank_effective_date not in", values, "bankEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andBankEffectiveDateBetween(String value1, String value2) {
            addCriterion("bank_effective_date between", value1, value2, "bankEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andBankEffectiveDateNotBetween(String value1, String value2) {
            addCriterion("bank_effective_date not between", value1, value2, "bankEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andBindDateIsNull() {
            addCriterion("bind_date is null");
            return (Criteria) this;
        }

        public Criteria andBindDateIsNotNull() {
            addCriterion("bind_date is not null");
            return (Criteria) this;
        }

        public Criteria andBindDateEqualTo(Date value) {
            addCriterion("bind_date =", value, "bindDate");
            return (Criteria) this;
        }

        public Criteria andBindDateNotEqualTo(Date value) {
            addCriterion("bind_date <>", value, "bindDate");
            return (Criteria) this;
        }

        public Criteria andBindDateGreaterThan(Date value) {
            addCriterion("bind_date >", value, "bindDate");
            return (Criteria) this;
        }

        public Criteria andBindDateGreaterThanOrEqualTo(Date value) {
            addCriterion("bind_date >=", value, "bindDate");
            return (Criteria) this;
        }

        public Criteria andBindDateLessThan(Date value) {
            addCriterion("bind_date <", value, "bindDate");
            return (Criteria) this;
        }

        public Criteria andBindDateLessThanOrEqualTo(Date value) {
            addCriterion("bind_date <=", value, "bindDate");
            return (Criteria) this;
        }

        public Criteria andBindDateIn(List<Date> values) {
            addCriterion("bind_date in", values, "bindDate");
            return (Criteria) this;
        }

        public Criteria andBindDateNotIn(List<Date> values) {
            addCriterion("bind_date not in", values, "bindDate");
            return (Criteria) this;
        }

        public Criteria andBindDateBetween(Date value1, Date value2) {
            addCriterion("bind_date between", value1, value2, "bindDate");
            return (Criteria) this;
        }

        public Criteria andBindDateNotBetween(Date value1, Date value2) {
            addCriterion("bind_date not between", value1, value2, "bindDate");
            return (Criteria) this;
        }

        public Criteria andSaivianRenewalDateIsNull() {
            addCriterion("saivian_renewal_date is null");
            return (Criteria) this;
        }

        public Criteria andSaivianRenewalDateIsNotNull() {
            addCriterion("saivian_renewal_date is not null");
            return (Criteria) this;
        }

        public Criteria andSaivianRenewalDateEqualTo(Date value) {
            addCriterion("saivian_renewal_date =", value, "saivianRenewalDate");
            return (Criteria) this;
        }

        public Criteria andSaivianRenewalDateNotEqualTo(Date value) {
            addCriterion("saivian_renewal_date <>", value, "saivianRenewalDate");
            return (Criteria) this;
        }

        public Criteria andSaivianRenewalDateGreaterThan(Date value) {
            addCriterion("saivian_renewal_date >", value, "saivianRenewalDate");
            return (Criteria) this;
        }

        public Criteria andSaivianRenewalDateGreaterThanOrEqualTo(Date value) {
            addCriterion("saivian_renewal_date >=", value, "saivianRenewalDate");
            return (Criteria) this;
        }

        public Criteria andSaivianRenewalDateLessThan(Date value) {
            addCriterion("saivian_renewal_date <", value, "saivianRenewalDate");
            return (Criteria) this;
        }

        public Criteria andSaivianRenewalDateLessThanOrEqualTo(Date value) {
            addCriterion("saivian_renewal_date <=", value, "saivianRenewalDate");
            return (Criteria) this;
        }

        public Criteria andSaivianRenewalDateIn(List<Date> values) {
            addCriterion("saivian_renewal_date in", values, "saivianRenewalDate");
            return (Criteria) this;
        }

        public Criteria andSaivianRenewalDateNotIn(List<Date> values) {
            addCriterion("saivian_renewal_date not in", values, "saivianRenewalDate");
            return (Criteria) this;
        }

        public Criteria andSaivianRenewalDateBetween(Date value1, Date value2) {
            addCriterion("saivian_renewal_date between", value1, value2, "saivianRenewalDate");
            return (Criteria) this;
        }

        public Criteria andSaivianRenewalDateNotBetween(Date value1, Date value2) {
            addCriterion("saivian_renewal_date not between", value1, value2, "saivianRenewalDate");
            return (Criteria) this;
        }

        public Criteria andRebateOpenDateIsNull() {
            addCriterion("rebate_open_date is null");
            return (Criteria) this;
        }

        public Criteria andRebateOpenDateIsNotNull() {
            addCriterion("rebate_open_date is not null");
            return (Criteria) this;
        }

        public Criteria andRebateOpenDateEqualTo(Date value) {
            addCriterion("rebate_open_date =", value, "rebateOpenDate");
            return (Criteria) this;
        }

        public Criteria andRebateOpenDateNotEqualTo(Date value) {
            addCriterion("rebate_open_date <>", value, "rebateOpenDate");
            return (Criteria) this;
        }

        public Criteria andRebateOpenDateGreaterThan(Date value) {
            addCriterion("rebate_open_date >", value, "rebateOpenDate");
            return (Criteria) this;
        }

        public Criteria andRebateOpenDateGreaterThanOrEqualTo(Date value) {
            addCriterion("rebate_open_date >=", value, "rebateOpenDate");
            return (Criteria) this;
        }

        public Criteria andRebateOpenDateLessThan(Date value) {
            addCriterion("rebate_open_date <", value, "rebateOpenDate");
            return (Criteria) this;
        }

        public Criteria andRebateOpenDateLessThanOrEqualTo(Date value) {
            addCriterion("rebate_open_date <=", value, "rebateOpenDate");
            return (Criteria) this;
        }

        public Criteria andRebateOpenDateIn(List<Date> values) {
            addCriterion("rebate_open_date in", values, "rebateOpenDate");
            return (Criteria) this;
        }

        public Criteria andRebateOpenDateNotIn(List<Date> values) {
            addCriterion("rebate_open_date not in", values, "rebateOpenDate");
            return (Criteria) this;
        }

        public Criteria andRebateOpenDateBetween(Date value1, Date value2) {
            addCriterion("rebate_open_date between", value1, value2, "rebateOpenDate");
            return (Criteria) this;
        }

        public Criteria andRebateOpenDateNotBetween(Date value1, Date value2) {
            addCriterion("rebate_open_date not between", value1, value2, "rebateOpenDate");
            return (Criteria) this;
        }

        public Criteria andRedeemOpenDateIsNull() {
            addCriterion("redeem_open_date is null");
            return (Criteria) this;
        }

        public Criteria andRedeemOpenDateIsNotNull() {
            addCriterion("redeem_open_date is not null");
            return (Criteria) this;
        }

        public Criteria andRedeemOpenDateEqualTo(Date value) {
            addCriterion("redeem_open_date =", value, "redeemOpenDate");
            return (Criteria) this;
        }

        public Criteria andRedeemOpenDateNotEqualTo(Date value) {
            addCriterion("redeem_open_date <>", value, "redeemOpenDate");
            return (Criteria) this;
        }

        public Criteria andRedeemOpenDateGreaterThan(Date value) {
            addCriterion("redeem_open_date >", value, "redeemOpenDate");
            return (Criteria) this;
        }

        public Criteria andRedeemOpenDateGreaterThanOrEqualTo(Date value) {
            addCriterion("redeem_open_date >=", value, "redeemOpenDate");
            return (Criteria) this;
        }

        public Criteria andRedeemOpenDateLessThan(Date value) {
            addCriterion("redeem_open_date <", value, "redeemOpenDate");
            return (Criteria) this;
        }

        public Criteria andRedeemOpenDateLessThanOrEqualTo(Date value) {
            addCriterion("redeem_open_date <=", value, "redeemOpenDate");
            return (Criteria) this;
        }

        public Criteria andRedeemOpenDateIn(List<Date> values) {
            addCriterion("redeem_open_date in", values, "redeemOpenDate");
            return (Criteria) this;
        }

        public Criteria andRedeemOpenDateNotIn(List<Date> values) {
            addCriterion("redeem_open_date not in", values, "redeemOpenDate");
            return (Criteria) this;
        }

        public Criteria andRedeemOpenDateBetween(Date value1, Date value2) {
            addCriterion("redeem_open_date between", value1, value2, "redeemOpenDate");
            return (Criteria) this;
        }

        public Criteria andRedeemOpenDateNotBetween(Date value1, Date value2) {
            addCriterion("redeem_open_date not between", value1, value2, "redeemOpenDate");
            return (Criteria) this;
        }

        public Criteria andArriveCodeDateIsNull() {
            addCriterion("arrive_code_date is null");
            return (Criteria) this;
        }

        public Criteria andArriveCodeDateIsNotNull() {
            addCriterion("arrive_code_date is not null");
            return (Criteria) this;
        }

        public Criteria andArriveCodeDateEqualTo(Date value) {
            addCriterion("arrive_code_date =", value, "arriveCodeDate");
            return (Criteria) this;
        }

        public Criteria andArriveCodeDateNotEqualTo(Date value) {
            addCriterion("arrive_code_date <>", value, "arriveCodeDate");
            return (Criteria) this;
        }

        public Criteria andArriveCodeDateGreaterThan(Date value) {
            addCriterion("arrive_code_date >", value, "arriveCodeDate");
            return (Criteria) this;
        }

        public Criteria andArriveCodeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("arrive_code_date >=", value, "arriveCodeDate");
            return (Criteria) this;
        }

        public Criteria andArriveCodeDateLessThan(Date value) {
            addCriterion("arrive_code_date <", value, "arriveCodeDate");
            return (Criteria) this;
        }

        public Criteria andArriveCodeDateLessThanOrEqualTo(Date value) {
            addCriterion("arrive_code_date <=", value, "arriveCodeDate");
            return (Criteria) this;
        }

        public Criteria andArriveCodeDateIn(List<Date> values) {
            addCriterion("arrive_code_date in", values, "arriveCodeDate");
            return (Criteria) this;
        }

        public Criteria andArriveCodeDateNotIn(List<Date> values) {
            addCriterion("arrive_code_date not in", values, "arriveCodeDate");
            return (Criteria) this;
        }

        public Criteria andArriveCodeDateBetween(Date value1, Date value2) {
            addCriterion("arrive_code_date between", value1, value2, "arriveCodeDate");
            return (Criteria) this;
        }

        public Criteria andArriveCodeDateNotBetween(Date value1, Date value2) {
            addCriterion("arrive_code_date not between", value1, value2, "arriveCodeDate");
            return (Criteria) this;
        }

        public Criteria andParentIsNull() {
            addCriterion("parent is null");
            return (Criteria) this;
        }

        public Criteria andParentIsNotNull() {
            addCriterion("parent is not null");
            return (Criteria) this;
        }

        public Criteria andParentEqualTo(Long value) {
            addCriterion("parent =", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentNotEqualTo(Long value) {
            addCriterion("parent <>", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentGreaterThan(Long value) {
            addCriterion("parent >", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentGreaterThanOrEqualTo(Long value) {
            addCriterion("parent >=", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentLessThan(Long value) {
            addCriterion("parent <", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentLessThanOrEqualTo(Long value) {
            addCriterion("parent <=", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentIn(List<Long> values) {
            addCriterion("parent in", values, "parent");
            return (Criteria) this;
        }

        public Criteria andParentNotIn(List<Long> values) {
            addCriterion("parent not in", values, "parent");
            return (Criteria) this;
        }

        public Criteria andParentBetween(Long value1, Long value2) {
            addCriterion("parent between", value1, value2, "parent");
            return (Criteria) this;
        }

        public Criteria andParentNotBetween(Long value1, Long value2) {
            addCriterion("parent not between", value1, value2, "parent");
            return (Criteria) this;
        }

        public Criteria andWageIsNull() {
            addCriterion("wage is null");
            return (Criteria) this;
        }

        public Criteria andWageIsNotNull() {
            addCriterion("wage is not null");
            return (Criteria) this;
        }

        public Criteria andWageEqualTo(Byte value) {
            addCriterion("wage =", value, "wage");
            return (Criteria) this;
        }

        public Criteria andWageNotEqualTo(Byte value) {
            addCriterion("wage <>", value, "wage");
            return (Criteria) this;
        }

        public Criteria andWageGreaterThan(Byte value) {
            addCriterion("wage >", value, "wage");
            return (Criteria) this;
        }

        public Criteria andWageGreaterThanOrEqualTo(Byte value) {
            addCriterion("wage >=", value, "wage");
            return (Criteria) this;
        }

        public Criteria andWageLessThan(Byte value) {
            addCriterion("wage <", value, "wage");
            return (Criteria) this;
        }

        public Criteria andWageLessThanOrEqualTo(Byte value) {
            addCriterion("wage <=", value, "wage");
            return (Criteria) this;
        }

        public Criteria andWageIn(List<Byte> values) {
            addCriterion("wage in", values, "wage");
            return (Criteria) this;
        }

        public Criteria andWageNotIn(List<Byte> values) {
            addCriterion("wage not in", values, "wage");
            return (Criteria) this;
        }

        public Criteria andWageBetween(Byte value1, Byte value2) {
            addCriterion("wage between", value1, value2, "wage");
            return (Criteria) this;
        }

        public Criteria andWageNotBetween(Byte value1, Byte value2) {
            addCriterion("wage not between", value1, value2, "wage");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIsNull() {
            addCriterion("total_money is null");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIsNotNull() {
            addCriterion("total_money is not null");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyEqualTo(String value) {
            addCriterion("total_money =", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotEqualTo(String value) {
            addCriterion("total_money <>", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyGreaterThan(String value) {
            addCriterion("total_money >", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("total_money >=", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyLessThan(String value) {
            addCriterion("total_money <", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyLessThanOrEqualTo(String value) {
            addCriterion("total_money <=", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyLike(String value) {
            addCriterion("total_money like", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotLike(String value) {
            addCriterion("total_money not like", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIn(List<String> values) {
            addCriterion("total_money in", values, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotIn(List<String> values) {
            addCriterion("total_money not in", values, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyBetween(String value1, String value2) {
            addCriterion("total_money between", value1, value2, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotBetween(String value1, String value2) {
            addCriterion("total_money not between", value1, value2, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andServiceUserIdIsNull() {
            addCriterion("service_user_id is null");
            return (Criteria) this;
        }

        public Criteria andServiceUserIdIsNotNull() {
            addCriterion("service_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andServiceUserIdEqualTo(Long value) {
            addCriterion("service_user_id =", value, "serviceUserId");
            return (Criteria) this;
        }

        public Criteria andServiceUserIdNotEqualTo(Long value) {
            addCriterion("service_user_id <>", value, "serviceUserId");
            return (Criteria) this;
        }

        public Criteria andServiceUserIdGreaterThan(Long value) {
            addCriterion("service_user_id >", value, "serviceUserId");
            return (Criteria) this;
        }

        public Criteria andServiceUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("service_user_id >=", value, "serviceUserId");
            return (Criteria) this;
        }

        public Criteria andServiceUserIdLessThan(Long value) {
            addCriterion("service_user_id <", value, "serviceUserId");
            return (Criteria) this;
        }

        public Criteria andServiceUserIdLessThanOrEqualTo(Long value) {
            addCriterion("service_user_id <=", value, "serviceUserId");
            return (Criteria) this;
        }

        public Criteria andServiceUserIdIn(List<Long> values) {
            addCriterion("service_user_id in", values, "serviceUserId");
            return (Criteria) this;
        }

        public Criteria andServiceUserIdNotIn(List<Long> values) {
            addCriterion("service_user_id not in", values, "serviceUserId");
            return (Criteria) this;
        }

        public Criteria andServiceUserIdBetween(Long value1, Long value2) {
            addCriterion("service_user_id between", value1, value2, "serviceUserId");
            return (Criteria) this;
        }

        public Criteria andServiceUserIdNotBetween(Long value1, Long value2) {
            addCriterion("service_user_id not between", value1, value2, "serviceUserId");
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