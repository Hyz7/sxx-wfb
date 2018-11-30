package com.wfb.manage.dao;

import com.wfb.framework.domain.member.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户登录〉
 *
 * @author hyz
 * @create 2018/11/23 0023
 * @since 1.0.0
 */
public interface UserRegistAndLoginRepository extends JpaRepository<UserLogin,String> {
    /**
     * 根据用户名密码查询用户
     * @param userID 用户名
     * @param password 密码
     * @return 用户
     */
    UserLogin findByUserIDAndPassword(String userID,String password);
}
