package com.wfb.framework.domain.market;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 申报信息
 */
@Entity
@Data
@ToString
@Table(name = "sc_company_info")
public class ScCompanyInfo {
    @Id
    private Long id;
    @Column(name = "declare_policy_name", columnDefinition = "varchar(200) comment '申报政策名称'")
    private String declarePolicyName;
    @Column(name = "declare_no", columnDefinition = "varchar(100) comment '申报单号'")
    private String declareNo;
    @Column(name = "declare_time", columnDefinition = "varchar(100) comment '申报时间'")
    private String declareTime;
    @Column(name = "policy_department", columnDefinition = "varchar(200) comment '政策归属部门'")
    private String policyDepartment;
    @Column(name = "company_id", columnDefinition = "varchar(200) comment '企业id'")
    private String companyId;
    @Column(name = "company_name", columnDefinition = "varchar(200) comment '企业名称'")
    private String companyName;
    @Column(name = "register_time", columnDefinition = "varchar(100) comment '注册时间'")
    private String registerTime;
    @Column(name = "register_phone", columnDefinition = "varchar(100) comment '注册电话'")
    private String registerPhone;
    @Column(name = "star_level", columnDefinition = "int(3) comment '星级'")
    private Integer starLevel;
    @Column(name = "credit_card_apply_time", columnDefinition = "varchar(100) comment '信用券申领时间'")
    private String creditCardApplyTime;
    @Column(name = "credit_card_type", columnDefinition = "varchar(50) comment '信用券状态'")
    private String creditCardType;
    @Column(name = "credit_card_no", columnDefinition = "varchar(50) comment '信用券编号'")
    private String creditCardNo;
    @Column(name = "credit_card_grant_time", columnDefinition = "varchar(100) comment '信用券发放时间'")
    private String creditCardGrantTime;
    @Column(name = "apply_name", columnDefinition = "varchar(100) comment '申报人'")
    private String applyName;
    @Column(name = "audit_status", columnDefinition = "varchar(50) comment '审核状态'")
    private String auditStatus;
    @Column(name = "audit_time", columnDefinition = "varchar(100) comment '审核时间'")
    private String auditTime;
    @Column(name = "audit_pass", columnDefinition = "varchar(100) comment '审核是否通过'")
    private String auditPass;
}
