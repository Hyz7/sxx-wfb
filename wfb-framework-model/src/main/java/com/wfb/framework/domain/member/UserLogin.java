package com.wfb.framework.domain.member;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户登录〉
 *
 * @author hyz
 * @create 2018/11/22 0022
 * @since 1.0.0
 */
@Data
@ToString
@Entity
@Table(name="userlogin")
public class UserLogin implements Serializable {
    @Id
    @Column(name="userID")
    @ApiModelProperty("用户ID")
    private String userID;
    @ApiModelProperty("用户密码")
    private String password;
    @ApiModelProperty("加盐")
    private String salt;
    @ApiModelProperty("用户登录token值")
    private String token;

}
