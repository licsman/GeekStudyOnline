package com.geekstudy.orange.db.mapper;

import com.geekstudy.orange.db.example.GeekCoursevideoExample;
import com.geekstudy.orange.db.model.GeekCoursevideo;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GeekCoursevideoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_coursevideo
     *
     * @mbg.generated
     */
    long countByExample(GeekCoursevideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_coursevideo
     *
     * @mbg.generated
     */
    int deleteByExample(GeekCoursevideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_coursevideo
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer videoId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_coursevideo
     *
     * @mbg.generated
     */
    int insert(GeekCoursevideo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_coursevideo
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int insertSelective(@Param("record") GeekCoursevideo record, @Param("selective") GeekCoursevideo.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_coursevideo
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    GeekCoursevideo selectOneByExample(GeekCoursevideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_coursevideo
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    GeekCoursevideo selectOneByExampleSelective(@Param("example") GeekCoursevideoExample example, @Param("selective") GeekCoursevideo.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_coursevideo
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    GeekCoursevideo selectOneByExampleWithBLOBs(GeekCoursevideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_coursevideo
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<GeekCoursevideo> selectByExampleSelective(@Param("example") GeekCoursevideoExample example, @Param("selective") GeekCoursevideo.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_coursevideo
     *
     * @mbg.generated
     */
    List<GeekCoursevideo> selectByExampleWithBLOBs(GeekCoursevideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_coursevideo
     *
     * @mbg.generated
     */
    List<GeekCoursevideo> selectByExample(GeekCoursevideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_coursevideo
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    GeekCoursevideo selectByPrimaryKeySelective(@Param("videoId") Integer videoId, @Param("selective") GeekCoursevideo.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_coursevideo
     *
     * @mbg.generated
     */
    GeekCoursevideo selectByPrimaryKey(Integer videoId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_coursevideo
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateByExampleSelective(@Param("record") GeekCoursevideo record, @Param("example") GeekCoursevideoExample example, @Param("selective") GeekCoursevideo.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_coursevideo
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") GeekCoursevideo record, @Param("example") GeekCoursevideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_coursevideo
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") GeekCoursevideo record, @Param("example") GeekCoursevideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_coursevideo
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateByPrimaryKeySelective(@Param("record") GeekCoursevideo record, @Param("selective") GeekCoursevideo.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_coursevideo
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(GeekCoursevideo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_coursevideo
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(GeekCoursevideo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_coursevideo
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsert(@Param("list") List<GeekCoursevideo> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table geek_coursevideo
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsertSelective(@Param("list") List<GeekCoursevideo> list, @Param("selective") GeekCoursevideo.Column ... selective);
}