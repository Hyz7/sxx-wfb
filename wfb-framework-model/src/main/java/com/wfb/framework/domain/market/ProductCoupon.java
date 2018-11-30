package com.wfb.framework.domain.market;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 * 〈信用券〉
 *
 * @author hyz
 * @create 2018/11/26 0026
 * @since 1.0.0
 */
@Data
@ToString
@Entity
@Table(name="productcoupon")
public class ProductCoupon implements Serializable {
    @Id
    @ApiModelProperty("信用券id")
    private String couponID;
    @ApiModelProperty("用户id")
    private String userID;
    @ApiModelProperty("买家id")
    private Integer buyerID;
    @ApiModelProperty("卖家id")
    private Integer providerID;
    @ApiModelProperty("产品id")
    private Integer productID;
    @ApiModelProperty("订单id")
    private String orderID;
    @ApiModelProperty("状态")
    private Integer statusID;
    @ApiModelProperty("创建时间")
    private Date createTime;
    @ApiModelProperty("结束时间")
    private Date expireTime;
    @ApiModelProperty("折扣率")
    private BigDecimal discount;
    @ApiModelProperty("折扣金额")
    private BigDecimal discountMoney;
    @ApiModelProperty("是否删除")
    private Boolean isDelete;
    @ApiModelProperty("合同")
    private String contractImages;
    @ApiModelProperty("合同发牌")
    private String invoiceImages;
    @ApiModelProperty("审核时间")
    private Date auditTime;
    @ApiModelProperty("审核管理员")
    private String auditAdmin;

}
