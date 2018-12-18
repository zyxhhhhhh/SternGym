package com.stern.pojo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 课程 -实体类
 */
public class Course {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.cid
     *
     * @mbg.generated
     */
    private Integer cid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.cname
     *
     * @mbg.generated
     */
    private String cname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.trainer_id
     *
     * @mbg.generated
     */
    private Integer trainerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.ctime
     *
     * @mbg.generated
     */
    private Integer ctime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.cfunction_id
     *
     * @mbg.generated
     */
    private Integer cfunctionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.ccate_id
     *
     * @mbg.generated
     */
    private Integer ccateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.cpic
     *
     * @mbg.generated
     */
    private String cpic;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.ccreatetime
     *
     * @mbg.generated
     */
    private Date ccreatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.cprice
     *
     * @mbg.generated
     */
    private BigDecimal cprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.cdesc
     *
     * @mbg.generated
     */
    private String cdesc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.cid
     *
     * @return the value of course.cid
     *
     * @mbg.generated
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.cid
     *
     * @param cid the value for course.cid
     *
     * @mbg.generated
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.cname
     *
     * @return the value of course.cname
     *
     * @mbg.generated
     */
    public String getCname() {
        return cname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.cname
     *
     * @param cname the value for course.cname
     *
     * @mbg.generated
     */
    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.trainer_id
     *
     * @return the value of course.trainer_id
     *
     * @mbg.generated
     */
    public Integer getTrainerId() {
        return trainerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.trainer_id
     *
     * @param trainerId the value for course.trainer_id
     *
     * @mbg.generated
     */
    public void setTrainerId(Integer trainerId) {
        this.trainerId = trainerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.ctime
     *
     * @return the value of course.ctime
     *
     * @mbg.generated
     */
    public Integer getCtime() {
        return ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.ctime
     *
     * @param ctime the value for course.ctime
     *
     * @mbg.generated
     */
    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.cfunction_id
     *
     * @return the value of course.cfunction_id
     *
     * @mbg.generated
     */
    public Integer getCfunctionId() {
        return cfunctionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.cfunction_id
     *
     * @param cfunctionId the value for course.cfunction_id
     *
     * @mbg.generated
     */
    public void setCfunctionId(Integer cfunctionId) {
        this.cfunctionId = cfunctionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.ccate_id
     *
     * @return the value of course.ccate_id
     *
     * @mbg.generated
     */
    public Integer getCcateId() {
        return ccateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.ccate_id
     *
     * @param ccateId the value for course.ccate_id
     *
     * @mbg.generated
     */
    public void setCcateId(Integer ccateId) {
        this.ccateId = ccateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.cpic
     *
     * @return the value of course.cpic
     *
     * @mbg.generated
     */
    public String getCpic() {
        return cpic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.cpic
     *
     * @param cpic the value for course.cpic
     *
     * @mbg.generated
     */
    public void setCpic(String cpic) {
        this.cpic = cpic == null ? null : cpic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.ccreatetime
     *
     * @return the value of course.ccreatetime
     *
     * @mbg.generated
     */
    public Date getCcreatetime() {
        return ccreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.ccreatetime
     *
     * @param ccreatetime the value for course.ccreatetime
     *
     * @mbg.generated
     */
    public void setCcreatetime(Date ccreatetime) {
        this.ccreatetime = ccreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.cprice
     *
     * @return the value of course.cprice
     *
     * @mbg.generated
     */
    public BigDecimal getCprice() {
        return cprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.cprice
     *
     * @param cprice the value for course.cprice
     *
     * @mbg.generated
     */
    public void setCprice(BigDecimal cprice) {
        this.cprice = cprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.cdesc
     *
     * @return the value of course.cdesc
     *
     * @mbg.generated
     */
    public String getCdesc() {
        return cdesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.cdesc
     *
     * @param cdesc the value for course.cdesc
     *
     * @mbg.generated
     */
    public void setCdesc(String cdesc) {
        this.cdesc = cdesc == null ? null : cdesc.trim();
    }
}