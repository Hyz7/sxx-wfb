package com.wfb.framework.domain.market.vo;

import io.swagger.models.auth.In;
import lombok.Data;
import lombok.ToString;

/**
 * 〈一句话功能简述〉<br>
 * 〈交易数据〉
 *
 * @author hyz
 * @create 2018/11/28 0028
 * @since 1.0.0
 */
@Data
@ToString
public class TransactionData {
    /**
     * 交易次数
     */
    private Integer dealCount;
    /**
     * 交易金额
     */
    private Long amount;
    /**
     * 申请信用券次数(信用券申请总次数)
     */
    private Integer applicationCount;
    /**
     * 申请信用券金额(折扣金额总数)
     */
    private Integer discountMoney;
    /**
     * 服务商兑现次数(服务商兑现总次数)
     */
    private Integer changeCount;
    /**
     * 服务商兑现金额(服务商兑现总金额)
     */
    private Integer changeAmount;
    /**
     * 最大单笔交易额
     */
    private Integer maxAmount;
    /**
     * 最小单笔交易额
     */
    private Integer minAmount;
}
