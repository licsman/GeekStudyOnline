package com.geekstudy.orange.controller.v1;

import com.geekstudy.orange.db.model.GeekTeacher;
import com.geekstudy.orange.entity.LoginForm;
import com.geekstudy.orange.service.teacher.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.Map;

@Api(value = "TeacherController", description = "Restful api to query/get/create/delete teacher")
@RestController("v1.TeacherController")
@RequestMapping("/v1/teacher")
public class TeacherController {
    private final TeacherService teacherService;

    private static final Logger logger = LoggerFactory.getLogger(TeacherController.class);

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @ApiOperation(value = "add new teacher", notes = "add new teacher")
    @PostMapping(value = "addTeacher", produces = MediaType.APPLICATION_JSON_VALUE)
    public String addTeacher(@RequestBody @Valid GeekTeacher geekTeacher) {
        return teacherService.addTeacher(geekTeacher);
    }

    @ApiOperation(value = "query teacher info")
    @GetMapping(value = "{teacherId}")
    public GeekTeacher queryTeacher(@PathVariable int teacherId) {
        return teacherService.queryTeacher(teacherId);
    }

    @ApiOperation(value = "delete teacher info")
    @DeleteMapping(value = "{teacherId}")
    public String deleteTeacher(@PathVariable int teacherId) {
        return teacherService.deleteTeacher(teacherId);
    }

    @ApiOperation(value = "update teacher info")
    @PutMapping(value = "{teacherId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String updateTeacher(@PathVariable int teacherId, @RequestBody @Valid GeekTeacher geekTeacher) {
        geekTeacher.setTeacherId(teacherId);
        return teacherService.updateTeacher(geekTeacher);
    }

    @ApiOperation(value = "Login Manage System", notes = "Login System")
    @PostMapping(value = "login/{userId}")
    public String login( @PathVariable int userId, HttpSession httpSession) {
        if (httpSession.isNew()){
            GeekTeacher geekTeacher = teacherService.queryTeacher(userId);
            httpSession.setAttribute("userInfo", geekTeacher);
            return "第一次登录：" + "用户信息:" + geekTeacher;
        } else {
            GeekTeacher geekTeacher = (GeekTeacher) httpSession.getAttribute("userInfo");
            return "欢迎回来：" + "从session中读取到的用户信息:" + geekTeacher;
        }
    }

    @ApiOperation(value = "administrator login")
    @PostMapping(value = "adminLogin", produces = MediaType.APPLICATION_JSON_VALUE)
    public String adminLogin(@RequestBody LoginForm loginInfo) {
        logger.info(String.valueOf(loginInfo));
        return "success";
    }


}