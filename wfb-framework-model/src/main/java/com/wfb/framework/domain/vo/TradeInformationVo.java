package com.wfb.framework.domain.vo;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 * 〈交易信息Vo〉
 *
 * @author hyz
 * @create 2018/11/27 0027
 * @since 1.0.0
 */
@Data
@ToString
public class TradeInformationVo {
    /**
     * 产品名称
     */
    private String productName;
    /**
     * 订单号
     */
    private String orderID;
    /**
     * 订单交易时间
     */
    private Date orderCreateTime;
    /**
     * 订单交易金额
     */
    private BigDecimal price;
    /**
     * 企业名
     */
    private String companyName;
    /**
     * 企业注册时间
     */
    private Date registerDate;
    /**
     * 企业注册电话
     */
    private String ownerMobile;
    /**
     * 企业星级
     */
    private Integer companyCredit;
    /**
     * 企业信用券申领时间
     */
    private Date companyCouponCreateTime;
    /**
     * 企业信用券是否使用
     */
    private Boolean isUse;
    /**
     * 服务商名称
     */
    private String providerName;
    /**
     * 服务商注册时间
     */
    private Date providerCreateTime;
    /**
     * 服务商注册电话
     */
    private String providerRegistPhone;
    /**
     * 服务商星级
     */
    private Integer providerCredit;
    /**
     * 服务商信用券兑现时间
     */
    private Date providerCouponCreateTime;
    /**
     * 服务商信用券状态
     */
    private String providerStatus;
    /**
     * 信用券编号
     */
    private String couponID;
    /**
     * 信用券发放时间
     */
    private Date couponCreateTime;
    /**
     * 信用券审核人
     */
    private String auditAdmin;
    /**
     * 信用券审核状态
     */
    private String statusName;
    /**
     * 信用券审核时间
     */
    private Date auditTime;
    /**
     * 信用券审核是否通过
     */
    private Boolean isDelete;

}
