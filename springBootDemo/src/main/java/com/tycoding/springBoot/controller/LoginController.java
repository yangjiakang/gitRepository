package com.tycoding.springBoot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sun.applet.Main;
import sun.security.util.AuthResources_pt_BR;

/**
 * @Description:
 * @Author: YJK
 * @CreateDate: 2018/10/24$ 11:08$
 * @UpdateUser: yc
 * @UpdateDate: 2018/10/24$ 11:08$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@RestController
public class LoginController {

    @RequestMapping("/login")
    public String login(@RequestParam("userName") String userName,@RequestParam("password") String password){
        System.out.println("username111:" + userName + ", password:" + password);
        return "username:" + userName + ", password:" + password;
    }
}
