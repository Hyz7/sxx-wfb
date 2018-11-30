package com.wfb.framework.domain.market;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 企业信息
 * @author hyz
 * @date 2018-11-12
 */
@Entity
@Data
@Table(name = "sc_corporate_center")
public class ScCorporateCenter implements Serializable {
    @Id
    private Long id;
    /**
     * 企业名称
     */
    @Column(columnDefinition = "varchar(200) comment '企业名称'")
    private String corporateName;
    /**
     * 社会信用代码
     */
    @Column(columnDefinition = "varchar(200) comment '社会信用代码'")
    private String creditCode;
    /**
     *省
     */
    @Column(columnDefinition = "varchar(100) comment '省'")
    private String prince;
    /**
     * 市
     */
    @Column(columnDefinition = "varchar(100) comment '市'")
    private String city;
    /**
     * 区
     */
    @Column(columnDefinition = "varchar(100) comment '区'")
    private String area;
    /**
     * 用户ID
     */
    @Column(columnDefinition = "varchar(100) comment '用户ID'")
    private String userId;
    /**
     * 企业认证状态
     */
    @Column(columnDefinition = "varchar(100) comment '企业认证状态'")
    private String state;

    @CreatedDate
    @Column(columnDefinition = "datetime comment '创建时间'")
    private Date createDate;

    @LastModifiedDate
    @Column(columnDefinition = "datetime comment '修改时间'")
    private Date updateDate;
}
