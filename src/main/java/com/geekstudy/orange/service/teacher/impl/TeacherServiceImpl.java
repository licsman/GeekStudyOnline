package com.geekstudy.orange.service.teacher.impl;

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
        return res > 0 ? geekTeacher.toString() : "添加失败！";
    }
}
