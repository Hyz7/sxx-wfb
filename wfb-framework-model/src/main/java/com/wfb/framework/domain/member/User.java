package com.wfb.framework.domain.member;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户基本信息〉
 *
 * @author hyz
 * @create 2018/11/22 0022
 * @since 1.0.0
 */
@Data
@ToString
@Document(collection = "controller")
@Table(name="wfb_user")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class User implements Serializable {
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(length = 32)
    @ApiModelProperty("用户ID")
    private String id;
    @Column(name = "user_id")
    private String userId;
    private String username;
    private String password;
    private String phone;
    private Date birthday;
    @Column(name = "last_time")
    private Date lastTime;
    private String status;
}
