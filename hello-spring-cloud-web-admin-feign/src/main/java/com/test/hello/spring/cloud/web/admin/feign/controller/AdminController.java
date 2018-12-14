package com.test.hello.spring.cloud.web.admin.feign.controller;

import com.test.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "sayHi", method = RequestMethod.GET)
    public String sayHi(@RequestParam String message){
        System.out.println("------------------------------");
        System.out.println(adminService.getClass().getName());
        return adminService.sayHi(message);
    }
}
