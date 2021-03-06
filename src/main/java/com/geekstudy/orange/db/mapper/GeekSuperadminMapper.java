package com.geekstudy.orange.db.mapper;

import com.geekstudy.orange.db.example.GeekSuperadminExample;
import com.geekstudy.orange.db.model.GeekSuperadmin;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GeekSuperadminMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_superadmin
     *
     * @mbg.generated
     */
    long countByExample(GeekSuperadminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_superadmin
     *
     * @mbg.generated
     */
    int deleteByExample(GeekSuperadminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_superadmin
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer adminId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_superadmin
     *
     * @mbg.generated
     */
    int insert(GeekSuperadmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_superadmin
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int insertSelective(@Param("record") GeekSuperadmin record, @Param("selective") GeekSuperadmin.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_superadmin
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    GeekSuperadmin selectOneByExample(GeekSuperadminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_superadmin
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    GeekSuperadmin selectOneByExampleSelective(@Param("example") GeekSuperadminExample example, @Param("selective") GeekSuperadmin.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_superadmin
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<GeekSuperadmin> selectByExampleSelective(@Param("example") GeekSuperadminExample example, @Param("selective") GeekSuperadmin.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_superadmin
     *
     * @mbg.generated
     */
    List<GeekSuperadmin> selectByExample(GeekSuperadminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_superadmin
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    GeekSuperadmin selectByPrimaryKeySelective(@Param("adminId") Integer adminId, @Param("selective") GeekSuperadmin.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_superadmin
     *
     * @mbg.generated
     */
    GeekSuperadmin selectByPrimaryKey(Integer adminId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_superadmin
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateByExampleSelective(@Param("record") GeekSuperadmin record, @Param("example") GeekSuperadminExample example, @Param("selective") GeekSuperadmin.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_superadmin
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") GeekSuperadmin record, @Param("example") GeekSuperadminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_superadmin
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateByPrimaryKeySelective(@Param("record") GeekSuperadmin record, @Param("selective") GeekSuperadmin.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_superadmin
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(GeekSuperadmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_superadmin
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsert(@Param("list") List<GeekSuperadmin> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_superadmin
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsertSelective(@Param("list") List<GeekSuperadmin> list, @Param("selective") GeekSuperadmin.Column ... selective);
}