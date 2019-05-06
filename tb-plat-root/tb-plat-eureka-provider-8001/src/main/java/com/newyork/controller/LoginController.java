package com.newyork.controller;

import com.newyork.Employee;
import com.newyork.JsonResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)

    public JsonResult login(@RequestBody Employee employee){
        if("admin".equals(employee.getName())&&"1".equals(employee.getPassword()))return JsonResult.getMe();
        return JsonResult.getMe().setSuccess(false).setMsg("用户名或者密码错误");
    }
}
