package com.wfb.framework.domain.market;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 * 〈公司〉
 *
 * @author hyz
 * @create 2018/11/26 0026
 * @since 1.0.0
 */
@Data
@ToString
@Entity
@Table(name="company")
public class Company implements Serializable {
    @Id
    @ApiModelProperty("公司ID")
    private Integer companyID;
    @ApiModelProperty("用户ID")
    private String userID;
    private Integer industryID;
    @ApiModelProperty("公司名称")
    private String companyName;
    @ApiModelProperty("拥有者姓名")
    private String ownerName;
    @ApiModelProperty("拥有者电话")
    private String ownerMobile;
    @ApiModelProperty("联系人姓名")
    private String contactName;
    @ApiModelProperty("联系人电话")
    private String contactMobile;
    @ApiModelProperty("是否企业")
    private Boolean isEnterprise;
    @ApiModelProperty("投资金额")
    private BigDecimal investMoney;
    @ApiModelProperty("业绩")
    private String achievement;
    private Integer typeID;
    @ApiModelProperty("注册省会")
    private BigDecimal registeredCapital;
    @ApiModelProperty("投入资本")
    private BigDecimal contributedCapital;
    @ApiModelProperty("注册日期")
    private Date registerDate;
    @ApiModelProperty("注册地址")
    private String registerAddress;
    @Column(name = "activityCount")
    private Integer activityCount;
    private String CUSCC;
    private Integer credit;
    @ApiModelProperty("是否审计")
    private Boolean isAudit;
    @ApiModelProperty("是否删除")
    private Boolean isDelete;

}
