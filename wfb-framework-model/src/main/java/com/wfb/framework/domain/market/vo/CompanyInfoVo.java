package com.wfb.framework.domain.market.vo;

import lombok.Data;
import lombok.ToString;

/**
 * 〈一句话功能简述〉<br>
 * 〈申报订单基本信息〉
 *
 * @author hyz
 * @create 2018/11/29 0029
 * @since 1.0.0
 */
@Data
@ToString
public class CompanyInfoVo {
    /**
     * 申报政策名称
     */
    private String declarePolicyName;
    /**
     * 申报单号
     */
    private String declareNo;
    /**
     * 申报时间
     */
    private String declareTime;
}
