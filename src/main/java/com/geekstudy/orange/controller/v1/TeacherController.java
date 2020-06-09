package com.geekstudy.orange.controller.v1;

import com.geekstudy.orange.apiResponse.OgResult;
import com.geekstudy.orange.db.model.GeekTeacher;
import com.geekstudy.orange.service.teacher.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Api(value = "TeacherController", description = "Restful api to query/get/create/delete teacher")
@RestController("v1.TeacherController")
@RequestMapping("/v1/teacher")
public class TeacherController {
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @ApiOperation(value = "add new teacher", notes = "add new teacher")
    @PostMapping(value = "/addTeacher", produces = MediaType.APPLICATION_JSON_VALUE)
    public OgResult<String> addTeacher(@RequestBody @Valid GeekTeacher geekTeacher) {
        return teacherService.addTeacher(geekTeacher);
    }

    @ApiOperation(value = "query new teacher")
    @GetMapping(value = "/getTeacher/{teacherId}")
    public OgResult<GeekTeacher> queryTeacher(@PathVariable int teacherId) {
        return teacherService.queryTeacher(teacherId);
    }
}