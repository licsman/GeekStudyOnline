package com.geekstudy.orange.service.teacher;

import com.geekstudy.orange.apiResponse.OgResult;
import com.geekstudy.orange.db.model.GeekTeacher;

public interface TeacherService {
    String addTeacher(GeekTeacher geekTeacher);
    GeekTeacher queryTeacher(int teacherId);
    String deleteTeacher(int teacherId);
    String updateTeacher(GeekTeacher geekTeacher);
}
