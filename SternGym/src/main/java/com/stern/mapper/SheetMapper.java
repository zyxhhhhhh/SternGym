package com.stern.mapper;

import com.stern.pojo.Sheet;
import com.stern.pojo.SheetExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 课表 -数据访问层
 */
@Component
public interface SheetMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sheet
     *
     * @mbg.generated
     */
    long countByExample(SheetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sheet
     *
     * @mbg.generated
     */
    int deleteByExample(SheetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sheet
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sheet
     *
     * @mbg.generated
     */
    int insert(Sheet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sheet
     *
     * @mbg.generated
     */
    int insertSelective(Sheet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sheet
     *
     * @mbg.generated
     */
    List<Sheet> selectByExample(SheetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sheet
     *
     * @mbg.generated
     */
    Sheet selectByPrimaryKey(Integer sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sheet
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Sheet record, @Param("example") SheetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sheet
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Sheet record, @Param("example") SheetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sheet
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Sheet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sheet
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Sheet record);
}