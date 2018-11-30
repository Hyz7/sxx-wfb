package com.wfb.api.member;

import com.wfb.framework.domain.member.UserLogin;
import com.wfb.framework.domain.member.response.UserLoginResult;
import com.wfb.framework.domain.member.response.UserResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author hyz
 * @create 2018/11/22 0022
 * @since 1.0.0
 */
@Api(value="用户注册和登录接口",description = "用户注册和登录接口，提供用户注册、登录接口")
public interface UserRegistAndLoginControllerApi {
    /**
     * 用户登录
     * @param userLogin 用户
     * @return 结果集
     */
    @ApiOperation("用户登录")
    UserLoginResult userLogin(UserLogin userLogin);

    /**
     * 用户注册
     * @param userLogin 用户
     * @return 结果集
     */
    @ApiOperation("用户注册")
    UserLoginResult userRegist(UserLogin userLogin);
}
