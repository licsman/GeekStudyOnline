package com.geekstudy.orange.service.teacher;

import com.geekstudy.orange.apiResponse.OgResult;
import com.geekstudy.orange.db.model.GeekTeacher;

public interface TeacherService {
    public OgResult<String> addTeacher(GeekTeacher geekTeacher);
    public OgResult<GeekTeacher> queryTeacher(int teacherId);
    public OgResult<String> deleteTeacher(int teacherId);
    public OgResult<String> updateTeacher(GeekTeacher geekTeacher);
}
