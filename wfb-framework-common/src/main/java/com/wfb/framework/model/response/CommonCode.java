package com.wfb.framework.model.response;

import lombok.ToString;

/**
 * 〈一句话功能简述〉<br>
 * 〈响应代码通用类〉
 *
 * @author hyz
 * @create 2018/11/22 0022
 * @since 1.0.0
 */
@ToString
public enum CommonCode implements ResultCode{

    /**
     * 操作成功
     */
    SUCCESS(true,10000,"操作成功！"),
    FAIL(false,11111,"操作失败！"),
    UNAUTHENTICATED(false,10001,"此操作需要登陆系统！"),
    UNAUTHORISE(false,10002,"权限不足，无权操作！"),
    EXISTUSER(false,10003,"用户名已存在！"),
    SERVER_ERROR(false,99999,"抱歉，系统繁忙，请稍后重试！"),
    INVALID_PARAM(false,10003,"参数非法!");
//    private static ImmutableMap<Integer, CommonCode> codes ;
    /**
     * 操作是否成功
     */
    boolean success;
    /**
     * 操作代码
     */
    int code;
    /**
     * 提示信息
     */
    String message;
    private CommonCode(boolean success,int code, String message){
        this.success = success;
        this.code = code;
        this.message = message;
    }

    @Override
    public boolean success() {
        return success;
    }
    @Override
    public int code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }


}
