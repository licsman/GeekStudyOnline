package com.geekstudy.orange.service.teacher;

import com.geekstudy.orange.apiResponse.OgResult;
import com.geekstudy.orange.db.model.GeekTeacher;

public interface TeacherService {
    public String addTeacher(GeekTeacher geekTeacher);
    public GeekTeacher queryTeacher(int teacherId);
    public String deleteTeacher(int teacherId);
    public String updateTeacher(GeekTeacher geekTeacher);
}
