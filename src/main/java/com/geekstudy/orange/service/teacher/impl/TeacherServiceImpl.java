package com.geekstudy.orange.service.teacher.impl;

import com.geekstudy.orange.db.mapper.GeekTeacherMapper;
import com.geekstudy.orange.db.model.GeekTeacher;
import com.geekstudy.orange.service.teacher.TeacherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private GeekTeacherMapper geekTeacherMapper;

    private static final Logger logger = LoggerFactory.getLogger(TeacherServiceImpl.class);

    @Override
    public String addTeacher(GeekTeacher geekTeacher) {
        geekTeacher.setTeacherCreatetime(LocalDateTime.now());
        int res = geekTeacherMapper.insert(geekTeacher);
        return res > 0 ? "添加成功！" : "添加失败！";
    }

    @Override
    public GeekTeacher queryTeacher(int teacherId) {
        GeekTeacher geekTeacher = geekTeacherMapper.selectByPrimaryKey(teacherId);
        logger.info("查询的教师信息:{}", geekTeacher);
        return geekTeacher;
    }

    @Override
    public String deleteTeacher(int teacherId) {
        int res = geekTeacherMapper.deleteByPrimaryKey(teacherId);
        return res > 0 ? "删除成功！" : "删除失败！";
    }

    @Override
    public String updateTeacher(GeekTeacher geekTeacher) {
        LocalDateTime time = geekTeacherMapper.selectByPrimaryKey(geekTeacher.getTeacherId()).getTeacherCreatetime();
        geekTeacher.setTeacherCreatetime(time);
        int res = geekTeacherMapper.updateByPrimaryKey(geekTeacher);
        return res > 0 ? "信息更新成功！" : "信息更新失败！";
    }
}
