package com.geekstudy.orange.db.mapper;

import com.geekstudy.orange.db.example.GeekStudywayExample;
import com.geekstudy.orange.db.model.GeekStudyway;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GeekStudywayMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_studyway
     *
     * @mbg.generated
     */
    long countByExample(GeekStudywayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_studyway
     *
     * @mbg.generated
     */
    int deleteByExample(GeekStudywayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_studyway
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer studywayId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_studyway
     *
     * @mbg.generated
     */
    int insert(GeekStudyway record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_studyway
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int insertSelective(@Param("record") GeekStudyway record, @Param("selective") GeekStudyway.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_studyway
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    GeekStudyway selectOneByExample(GeekStudywayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_studyway
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    GeekStudyway selectOneByExampleSelective(@Param("example") GeekStudywayExample example, @Param("selective") GeekStudyway.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_studyway
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    GeekStudyway selectOneByExampleWithBLOBs(GeekStudywayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_studyway
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<GeekStudyway> selectByExampleSelective(@Param("example") GeekStudywayExample example, @Param("selective") GeekStudyway.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_studyway
     *
     * @mbg.generated
     */
    List<GeekStudyway> selectByExampleWithBLOBs(GeekStudywayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_studyway
     *
     * @mbg.generated
     */
    List<GeekStudyway> selectByExample(GeekStudywayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_studyway
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    GeekStudyway selectByPrimaryKeySelective(@Param("studywayId") Integer studywayId, @Param("selective") GeekStudyway.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_studyway
     *
     * @mbg.generated
     */
    GeekStudyway selectByPrimaryKey(Integer studywayId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_studyway
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateByExampleSelective(@Param("record") GeekStudyway record, @Param("example") GeekStudywayExample example, @Param("selective") GeekStudyway.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_studyway
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") GeekStudyway record, @Param("example") GeekStudywayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_studyway
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") GeekStudyway record, @Param("example") GeekStudywayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_studyway
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateByPrimaryKeySelective(@Param("record") GeekStudyway record, @Param("selective") GeekStudyway.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_studyway
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(GeekStudyway record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_studyway
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(GeekStudyway record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_studyway
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsert(@Param("list") List<GeekStudyway> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_studyway
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsertSelective(@Param("list") List<GeekStudyway> list, @Param("selective") GeekStudyway.Column ... selective);
}