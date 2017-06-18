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

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNull() {
            addCriterion("login_name is null");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNotNull() {
            addCriterion("login_name is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNameEqualTo(String value) {
            addCriterion("login_name =", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotEqualTo(String value) {
            addCriterion("login_name <>", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThan(String value) {
            addCriterion("login_name >", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("login_name >=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThan(String value) {
            addCriterion("login_name <", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("login_name <=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLike(String value) {
            addCriterion("login_name like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotLike(String value) {
            addCriterion("login_name not like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIn(List<String> values) {
            addCriterion("login_name in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotIn(List<String> values) {
            addCriterion("login_name not in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameBetween(String value1, String value2) {
            addCriterion("login_name between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("login_name not between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordIsNull() {
            addCriterion("login_password is null");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordIsNotNull() {
            addCriterion("login_password is not null");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordEqualTo(String value) {
            addCriterion("login_password =", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordNotEqualTo(String value) {
            addCriterion("login_password <>", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordGreaterThan(String value) {
            addCriterion("login_password >", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("login_password >=", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordLessThan(String value) {
            addCriterion("login_password <", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordLessThanOrEqualTo(String value) {
            addCriterion("login_password <=", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordLike(String value) {
            addCriterion("login_password like", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordNotLike(String value) {
            addCriterion("login_password not like", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordIn(List<String> values) {
            addCriterion("login_password in", values, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordNotIn(List<String> values) {
            addCriterion("login_password not in", values, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordBetween(String value1, String value2) {
            addCriterion("login_password between", value1, value2, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordNotBetween(String value1, String value2) {
            addCriterion("login_password not between", value1, value2, "loginPassword");
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

        public Criteria andRenewalDateIsNull() {
            addCriterion("renewal_date is null");
            return (Criteria) this;
        }

        public Criteria andRenewalDateIsNotNull() {
            addCriterion("renewal_date is not null");
            return (Criteria) this;
        }

        public Criteria andRenewalDateEqualTo(Date value) {
            addCriterion("renewal_date =", value, "renewalDate");
            return (Criteria) this;
        }

        public Criteria andRenewalDateNotEqualTo(Date value) {
            addCriterion("renewal_date <>", value, "renewalDate");
            return (Criteria) this;
        }

        public Criteria andRenewalDateGreaterThan(Date value) {
            addCriterion("renewal_date >", value, "renewalDate");
            return (Criteria) this;
        }

        public Criteria andRenewalDateGreaterThanOrEqualTo(Date value) {
            addCriterion("renewal_date >=", value, "renewalDate");
            return (Criteria) this;
        }

        public Criteria andRenewalDateLessThan(Date value) {
            addCriterion("renewal_date <", value, "renewalDate");
            return (Criteria) this;
        }

        public Criteria andRenewalDateLessThanOrEqualTo(Date value) {
            addCriterion("renewal_date <=", value, "renewalDate");
            return (Criteria) this;
        }

        public Criteria andRenewalDateIn(List<Date> values) {
            addCriterion("renewal_date in", values, "renewalDate");
            return (Criteria) this;
        }

        public Criteria andRenewalDateNotIn(List<Date> values) {
            addCriterion("renewal_date not in", values, "renewalDate");
            return (Criteria) this;
        }

        public Criteria andRenewalDateBetween(Date value1, Date value2) {
            addCriterion("renewal_date between", value1, value2, "renewalDate");
            return (Criteria) this;
        }

        public Criteria andRenewalDateNotBetween(Date value1, Date value2) {
            addCriterion("renewal_date not between", value1, value2, "renewalDate");
            return (Criteria) this;
        }

        public Criteria andRedemptionDateIsNull() {
            addCriterion("redemption_date is null");
            return (Criteria) this;
        }

        public Criteria andRedemptionDateIsNotNull() {
            addCriterion("redemption_date is not null");
            return (Criteria) this;
        }

        public Criteria andRedemptionDateEqualTo(Date value) {
            addCriterion("redemption_date =", value, "redemptionDate");
            return (Criteria) this;
        }

        public Criteria andRedemptionDateNotEqualTo(Date value) {
            addCriterion("redemption_date <>", value, "redemptionDate");
            return (Criteria) this;
        }

        public Criteria andRedemptionDateGreaterThan(Date value) {
            addCriterion("redemption_date >", value, "redemptionDate");
            return (Criteria) this;
        }

        public Criteria andRedemptionDateGreaterThanOrEqualTo(Date value) {
            addCriterion("redemption_date >=", value, "redemptionDate");
            return (Criteria) this;
        }

        public Criteria andRedemptionDateLessThan(Date value) {
            addCriterion("redemption_date <", value, "redemptionDate");
            return (Criteria) this;
        }

        public Criteria andRedemptionDateLessThanOrEqualTo(Date value) {
            addCriterion("redemption_date <=", value, "redemptionDate");
            return (Criteria) this;
        }

        public Criteria andRedemptionDateIn(List<Date> values) {
            addCriterion("redemption_date in", values, "redemptionDate");
            return (Criteria) this;
        }

        public Criteria andRedemptionDateNotIn(List<Date> values) {
            addCriterion("redemption_date not in", values, "redemptionDate");
            return (Criteria) this;
        }

        public Criteria andRedemptionDateBetween(Date value1, Date value2) {
            addCriterion("redemption_date between", value1, value2, "redemptionDate");
            return (Criteria) this;
        }

        public Criteria andRedemptionDateNotBetween(Date value1, Date value2) {
            addCriterion("redemption_date not between", value1, value2, "redemptionDate");
            return (Criteria) this;
        }

        public Criteria andClickDateIsNull() {
            addCriterion("click_date is null");
            return (Criteria) this;
        }

        public Criteria andClickDateIsNotNull() {
            addCriterion("click_date is not null");
            return (Criteria) this;
        }

        public Criteria andClickDateEqualTo(Date value) {
            addCriterion("click_date =", value, "clickDate");
            return (Criteria) this;
        }

        public Criteria andClickDateNotEqualTo(Date value) {
            addCriterion("click_date <>", value, "clickDate");
            return (Criteria) this;
        }

        public Criteria andClickDateGreaterThan(Date value) {
            addCriterion("click_date >", value, "clickDate");
            return (Criteria) this;
        }

        public Criteria andClickDateGreaterThanOrEqualTo(Date value) {
            addCriterion("click_date >=", value, "clickDate");
            return (Criteria) this;
        }

        public Criteria andClickDateLessThan(Date value) {
            addCriterion("click_date <", value, "clickDate");
            return (Criteria) this;
        }

        public Criteria andClickDateLessThanOrEqualTo(Date value) {
            addCriterion("click_date <=", value, "clickDate");
            return (Criteria) this;
        }

        public Criteria andClickDateIn(List<Date> values) {
            addCriterion("click_date in", values, "clickDate");
            return (Criteria) this;
        }

        public Criteria andClickDateNotIn(List<Date> values) {
            addCriterion("click_date not in", values, "clickDate");
            return (Criteria) this;
        }

        public Criteria andClickDateBetween(Date value1, Date value2) {
            addCriterion("click_date between", value1, value2, "clickDate");
            return (Criteria) this;
        }

        public Criteria andClickDateNotBetween(Date value1, Date value2) {
            addCriterion("click_date not between", value1, value2, "clickDate");
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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