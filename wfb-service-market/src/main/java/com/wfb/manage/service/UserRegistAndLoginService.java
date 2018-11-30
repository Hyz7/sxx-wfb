package com.wfb.manage.service;

import com.wfb.framework.domain.member.UserLogin;
import com.wfb.framework.domain.member.response.UserLoginResult;
import com.wfb.framework.model.response.CommonCode;
import com.wfb.framework.utils.MD5Util;
import com.wfb.manage.dao.UserRegistAndLoginRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户注册登录〉
 *
 * @author hyz
 * @create 2018/11/23 0023
 * @since 1.0.0
 */
@Service
public class UserRegistAndLoginService {
    @Autowired
    private UserRegistAndLoginRepository userRegistAndLoginRepository;

    /**
     * 用户注册
     *
     * @param userLogin 用户
     * @return 结果集
     */
    public UserLoginResult userRegist(UserLogin userLogin) {
        // 获取用户输入id
        String userID = userLogin.getUserID();
        // 判断用户书否存在
        Optional<UserLogin> optional = userRegistAndLoginRepository.findById(userID);
        if (optional.isPresent()) {
            return new UserLoginResult(CommonCode.EXISTUSER, optional.get());
        }
        // 对密码加盐后进行md5加密
        String password = userLogin.getPassword();
        String salt = UUID.randomUUID().toString().substring(0, 10);
        String md5Password = MD5Util.getStringMD5(password + salt);
        userLogin.setSalt(salt);
        userLogin.setPassword(md5Password);
        UserLogin login = userRegistAndLoginRepository.save(userLogin);
        return new UserLoginResult(CommonCode.SUCCESS, login);
    }

    /**
     * 用户登录
     *
     * @param userLogin 用户
     * @return 结果集
     */
    public UserLoginResult userLogin(UserLogin userLogin) {
        // 获得用户id
        String userID = userLogin.getUserID();
        if (userID == null){
            return null;
        }
        // 查询用户是否存在
        Optional<UserLogin> optional = userRegistAndLoginRepository.findById(userID);
        String password = null;
        UserLogin existUser = null;
        if (optional.isPresent()) {
            UserLogin login = optional.get();
            // 根据加密规则对用户密码进行解析
            password = MD5Util.getStringMD5(userLogin.getPassword() + login.getSalt());
            // 判断用户名密码是否正确
            existUser = userRegistAndLoginRepository.findByUserIDAndPassword(userID, password);
            if (existUser == null) {
                return new UserLoginResult(CommonCode.FAIL, null);
            }
            String token = UUID.randomUUID().toString();
            existUser.setToken(token);
            userRegistAndLoginRepository.save(existUser);
            return new UserLoginResult(CommonCode.SUCCESS, existUser);
        }
        return new UserLoginResult(CommonCode.FAIL, null);
    }


}
