package com.wfb.framework.domain.vo;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 * 〈产品Vo类〉
 *
 * @author hyz
 * @create 2018/11/26 0026
 * @since 1.0.0
 */
@Data
@ToString
public class ProductInformationVo {
    /**
     * 订单id
     */
    private String orderID;
    /**
     * 交易时间
     */
    private Date createTime;
    /**
     * 交易金额
     */
    private BigDecimal price;
    /**
     * 产品名称
     */
    private String productName;
    /**
     * 服务商名称
     */
    private String providerName;
}
