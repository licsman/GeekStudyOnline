package com.geekstudy.orange.db.mapper;

import com.geekstudy.orange.db.example.GeekAdminExample;
import com.geekstudy.orange.db.model.GeekAdmin;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GeekAdminMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_admin
     *
     * @mbg.generated
     */
    long countByExample(GeekAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_admin
     *
     * @mbg.generated
     */
    int deleteByExample(GeekAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_admin
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer adminId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_admin
     *
     * @mbg.generated
     */
    int insert(GeekAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_admin
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int insertSelective(@Param("record") GeekAdmin record, @Param("selective") GeekAdmin.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_admin
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    GeekAdmin selectOneByExample(GeekAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_admin
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    GeekAdmin selectOneByExampleSelective(@Param("example") GeekAdminExample example, @Param("selective") GeekAdmin.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_admin
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<GeekAdmin> selectByExampleSelective(@Param("example") GeekAdminExample example, @Param("selective") GeekAdmin.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_admin
     *
     * @mbg.generated
     */
    List<GeekAdmin> selectByExample(GeekAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_admin
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    GeekAdmin selectByPrimaryKeySelective(@Param("adminId") Integer adminId, @Param("selective") GeekAdmin.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_admin
     *
     * @mbg.generated
     */
    GeekAdmin selectByPrimaryKey(Integer adminId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_admin
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateByExampleSelective(@Param("record") GeekAdmin record, @Param("example") GeekAdminExample example, @Param("selective") GeekAdmin.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_admin
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") GeekAdmin record, @Param("example") GeekAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_admin
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateByPrimaryKeySelective(@Param("record") GeekAdmin record, @Param("selective") GeekAdmin.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_admin
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(GeekAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_admin
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsert(@Param("list") List<GeekAdmin> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_admin
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsertSelective(@Param("list") List<GeekAdmin> list, @Param("selective") GeekAdmin.Column ... selective);
}