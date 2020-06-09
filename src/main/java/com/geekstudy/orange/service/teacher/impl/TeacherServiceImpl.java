package com.geekstudy.orange.service.teacher.impl;

import com.geekstudy.orange.apiResponse.OgResult;
import com.geekstudy.orange.db.mapper.GeekTeacherMapper;
import com.geekstudy.orange.db.model.GeekTeacher;
import com.geekstudy.orange.service.teacher.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private GeekTeacherMapper geekTeacherMapper;

    @Override
    public String addTeacher(GeekTeacher geekTeacher) {
        geekTeacher.setTeacherCreatetime(LocalDate.now());
        int res = geekTeacherMapper.insert(geekTeacher);
        return res > 0 ? "添加成功！" : "添加失败！";
    }

    @Override
    public GeekTeacher queryTeacher(int teacherId) {
        return geekTeacherMapper.selectByPrimaryKey(teacherId);
    }

    @Override
    public String deleteTeacher(int teacherId) {
        int res = geekTeacherMapper.deleteByPrimaryKey(teacherId);
        return res > 0 ? "删除成功！" : "删除失败！";
    }

    @Override
    public String updateTeacher(GeekTeacher geekTeacher) {
        LocalDate date = geekTeacherMapper.selectByPrimaryKey(geekTeacher.getTeacherId()).getTeacherCreatetime();
        geekTeacher.setTeacherCreatetime(date);
        int res = geekTeacherMapper.updateByPrimaryKey(geekTeacher);
        return res > 0 ? "信息更新成功！" : "信息更新失败！";
    }
}
