package com.stern.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table message
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table message
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table message
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated
     */
    public MessageExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table message
     *
     * @mbg.generated
     */
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

        public Criteria andMsgIdIsNull() {
            addCriterion("msg_id is null");
            return (Criteria) this;
        }

        public Criteria andMsgIdIsNotNull() {
            addCriterion("msg_id is not null");
            return (Criteria) this;
        }

        public Criteria andMsgIdEqualTo(Integer value) {
            addCriterion("msg_id =", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotEqualTo(Integer value) {
            addCriterion("msg_id <>", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdGreaterThan(Integer value) {
            addCriterion("msg_id >", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("msg_id >=", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdLessThan(Integer value) {
            addCriterion("msg_id <", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdLessThanOrEqualTo(Integer value) {
            addCriterion("msg_id <=", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdIn(List<Integer> values) {
            addCriterion("msg_id in", values, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotIn(List<Integer> values) {
            addCriterion("msg_id not in", values, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdBetween(Integer value1, Integer value2) {
            addCriterion("msg_id between", value1, value2, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("msg_id not between", value1, value2, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgMidIsNull() {
            addCriterion("msg_mid is null");
            return (Criteria) this;
        }

        public Criteria andMsgMidIsNotNull() {
            addCriterion("msg_mid is not null");
            return (Criteria) this;
        }

        public Criteria andMsgMidEqualTo(Integer value) {
            addCriterion("msg_mid =", value, "msgMid");
            return (Criteria) this;
        }

        public Criteria andMsgMidNotEqualTo(Integer value) {
            addCriterion("msg_mid <>", value, "msgMid");
            return (Criteria) this;
        }

        public Criteria andMsgMidGreaterThan(Integer value) {
            addCriterion("msg_mid >", value, "msgMid");
            return (Criteria) this;
        }

        public Criteria andMsgMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("msg_mid >=", value, "msgMid");
            return (Criteria) this;
        }

        public Criteria andMsgMidLessThan(Integer value) {
            addCriterion("msg_mid <", value, "msgMid");
            return (Criteria) this;
        }

        public Criteria andMsgMidLessThanOrEqualTo(Integer value) {
            addCriterion("msg_mid <=", value, "msgMid");
            return (Criteria) this;
        }

        public Criteria andMsgMidIn(List<Integer> values) {
            addCriterion("msg_mid in", values, "msgMid");
            return (Criteria) this;
        }

        public Criteria andMsgMidNotIn(List<Integer> values) {
            addCriterion("msg_mid not in", values, "msgMid");
            return (Criteria) this;
        }

        public Criteria andMsgMidBetween(Integer value1, Integer value2) {
            addCriterion("msg_mid between", value1, value2, "msgMid");
            return (Criteria) this;
        }

        public Criteria andMsgMidNotBetween(Integer value1, Integer value2) {
            addCriterion("msg_mid not between", value1, value2, "msgMid");
            return (Criteria) this;
        }

        public Criteria andMsgContentIsNull() {
            addCriterion("msg_content is null");
            return (Criteria) this;
        }

        public Criteria andMsgContentIsNotNull() {
            addCriterion("msg_content is not null");
            return (Criteria) this;
        }

        public Criteria andMsgContentEqualTo(String value) {
            addCriterion("msg_content =", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentNotEqualTo(String value) {
            addCriterion("msg_content <>", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentGreaterThan(String value) {
            addCriterion("msg_content >", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentGreaterThanOrEqualTo(String value) {
            addCriterion("msg_content >=", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentLessThan(String value) {
            addCriterion("msg_content <", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentLessThanOrEqualTo(String value) {
            addCriterion("msg_content <=", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentLike(String value) {
            addCriterion("msg_content like", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentNotLike(String value) {
            addCriterion("msg_content not like", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentIn(List<String> values) {
            addCriterion("msg_content in", values, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentNotIn(List<String> values) {
            addCriterion("msg_content not in", values, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentBetween(String value1, String value2) {
            addCriterion("msg_content between", value1, value2, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentNotBetween(String value1, String value2) {
            addCriterion("msg_content not between", value1, value2, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgRidIsNull() {
            addCriterion("msg_rid is null");
            return (Criteria) this;
        }

        public Criteria andMsgRidIsNotNull() {
            addCriterion("msg_rid is not null");
            return (Criteria) this;
        }

        public Criteria andMsgRidEqualTo(Integer value) {
            addCriterion("msg_rid =", value, "msgRid");
            return (Criteria) this;
        }

        public Criteria andMsgRidNotEqualTo(Integer value) {
            addCriterion("msg_rid <>", value, "msgRid");
            return (Criteria) this;
        }

        public Criteria andMsgRidGreaterThan(Integer value) {
            addCriterion("msg_rid >", value, "msgRid");
            return (Criteria) this;
        }

        public Criteria andMsgRidGreaterThanOrEqualTo(Integer value) {
            addCriterion("msg_rid >=", value, "msgRid");
            return (Criteria) this;
        }

        public Criteria andMsgRidLessThan(Integer value) {
            addCriterion("msg_rid <", value, "msgRid");
            return (Criteria) this;
        }

        public Criteria andMsgRidLessThanOrEqualTo(Integer value) {
            addCriterion("msg_rid <=", value, "msgRid");
            return (Criteria) this;
        }

        public Criteria andMsgRidIn(List<Integer> values) {
            addCriterion("msg_rid in", values, "msgRid");
            return (Criteria) this;
        }

        public Criteria andMsgRidNotIn(List<Integer> values) {
            addCriterion("msg_rid not in", values, "msgRid");
            return (Criteria) this;
        }

        public Criteria andMsgRidBetween(Integer value1, Integer value2) {
            addCriterion("msg_rid between", value1, value2, "msgRid");
            return (Criteria) this;
        }

        public Criteria andMsgRidNotBetween(Integer value1, Integer value2) {
            addCriterion("msg_rid not between", value1, value2, "msgRid");
            return (Criteria) this;
        }

        public Criteria andMsgDateIsNull() {
            addCriterion("msg_date is null");
            return (Criteria) this;
        }

        public Criteria andMsgDateIsNotNull() {
            addCriterion("msg_date is not null");
            return (Criteria) this;
        }

        public Criteria andMsgDateEqualTo(Date value) {
            addCriterion("msg_date =", value, "msgDate");
            return (Criteria) this;
        }

        public Criteria andMsgDateNotEqualTo(Date value) {
            addCriterion("msg_date <>", value, "msgDate");
            return (Criteria) this;
        }

        public Criteria andMsgDateGreaterThan(Date value) {
            addCriterion("msg_date >", value, "msgDate");
            return (Criteria) this;
        }

        public Criteria andMsgDateGreaterThanOrEqualTo(Date value) {
            addCriterion("msg_date >=", value, "msgDate");
            return (Criteria) this;
        }

        public Criteria andMsgDateLessThan(Date value) {
            addCriterion("msg_date <", value, "msgDate");
            return (Criteria) this;
        }

        public Criteria andMsgDateLessThanOrEqualTo(Date value) {
            addCriterion("msg_date <=", value, "msgDate");
            return (Criteria) this;
        }

        public Criteria andMsgDateIn(List<Date> values) {
            addCriterion("msg_date in", values, "msgDate");
            return (Criteria) this;
        }

        public Criteria andMsgDateNotIn(List<Date> values) {
            addCriterion("msg_date not in", values, "msgDate");
            return (Criteria) this;
        }

        public Criteria andMsgDateBetween(Date value1, Date value2) {
            addCriterion("msg_date between", value1, value2, "msgDate");
            return (Criteria) this;
        }

        public Criteria andMsgDateNotBetween(Date value1, Date value2) {
            addCriterion("msg_date not between", value1, value2, "msgDate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table message
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table message
     *
     * @mbg.generated
     */
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