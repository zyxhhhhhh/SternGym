package com.stern.mapper;

import com.stern.pojo.Member;
import com.stern.pojo.MemberExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface MemberMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated
     */
    long countByExample(MemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated
     */
    int deleteByExample(MemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer mid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated
     */
    int insert(Member record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated
     */
    int insertSelective(Member record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated
     */
    List<Member> selectByExample(MemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated
     */
    Member selectByPrimaryKey(Integer mid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Member record, @Param("example") MemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Member record, @Param("example") MemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Member record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Member record);
}