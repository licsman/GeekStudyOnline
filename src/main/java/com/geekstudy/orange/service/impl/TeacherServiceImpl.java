package com.geekstudy.orange.service.impl;

import com.geekstudy.orange.db.example.GeekTeacherExample;
import com.geekstudy.orange.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements BaseService {

    @Override
    public String addTeacher() {
        GeekTeacherExample gte = new GeekTeacherExample()
                .createCriteria()
                .example();
        return null;
    }
}
