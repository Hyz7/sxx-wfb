package com.wfb.framework.domain.member.response;

import com.wfb.framework.domain.member.User;
import com.wfb.framework.domain.member.UserLogin;
import com.wfb.framework.model.response.ResponseResult;
import com.wfb.framework.model.response.ResultCode;
import lombok.Data;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户响应类〉
 *
 * @author hyz
 * @create 2018/11/22 0022
 * @since 1.0.0
 */
@Data
public class UserLoginResult extends ResponseResult {
    UserLogin userLogin;

    public UserLoginResult(ResultCode resultCode, UserLogin userLogin) {
        super(resultCode);
        this.userLogin = userLogin;
    }
}
