package com.wfb.framework.domain.member.response;

import com.wfb.framework.domain.member.User;
import com.wfb.framework.model.response.ResponseResult;
import com.wfb.framework.model.response.ResultCode;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户响应类〉
 *
 * @author hyz
 * @create 2018/11/22 0022
 * @since 1.0.0
 */
public class UserResult extends ResponseResult {
    User user;

    public UserResult(ResultCode resultCode, User user) {
        super(resultCode);
        this.user = user;
    }
}
