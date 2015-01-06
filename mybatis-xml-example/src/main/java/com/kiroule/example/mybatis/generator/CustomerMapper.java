package com.kiroule.example.mybatis.generator;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Fri Dec 27 16:10:16 EST 2013
     */
    int countByExample(CustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Fri Dec 27 16:10:16 EST 2013
     */
    int deleteByExample(CustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Fri Dec 27 16:10:16 EST 2013
     */
    int deleteByPrimaryKey(Short customerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Fri Dec 27 16:10:16 EST 2013
     */
    int insert(Customer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Fri Dec 27 16:10:16 EST 2013
     */
    int insertSelective(Customer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Fri Dec 27 16:10:16 EST 2013
     */
    List<Customer> selectByExample(CustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Fri Dec 27 16:10:16 EST 2013
     */
    Customer selectByPrimaryKey(Short customerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Fri Dec 27 16:10:16 EST 2013
     */
    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Fri Dec 27 16:10:16 EST 2013
     */
    int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Fri Dec 27 16:10:16 EST 2013
     */
    int updateByPrimaryKeySelective(Customer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbggenerated Fri Dec 27 16:10:16 EST 2013
     */
    int updateByPrimaryKey(Customer record);
}