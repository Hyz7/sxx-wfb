package com.wfb.manage.controller;

import com.wfb.api.member.UserRegistAndLoginControllerApi;
import com.wfb.framework.domain.member.UserLogin;
import com.wfb.framework.domain.member.response.UserLoginResult;
import com.wfb.manage.service.UserRegistAndLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户注册登录〉
 *
 * @author hyz
 * @create 2018/11/23 0023
 * @since 1.0.0
 */
@RestController
@RequestMapping("/user")
public class UserRegistAndLoginController implements UserRegistAndLoginControllerApi {

    @Autowired
    private UserRegistAndLoginService userRegistAndLoginService;

    @Override
    @PostMapping("/regist")
    public UserLoginResult userRegist(UserLogin userLogin) {
        return userRegistAndLoginService.userRegist(userLogin);
    }

    @Override
    @PostMapping("/login")
    public UserLoginResult userLogin(UserLogin userLogin) {
        return userRegistAndLoginService.userLogin(userLogin);
    }


}
