package com.wfb.framework.domain.market.vo;

import lombok.Data;
import lombok.ToString;

/**
 * 〈一句话功能简述〉<br>
 * 〈服务商Vo类〉
 *
 * @author hyz
 * @create 2018/11/26 0026
 * @since 1.0.0
 */
@Data
@ToString
public class ProductProviderVo {
    /**
     * 服务商id
     */
    private Integer providerID;
    /**
     * 服务商名字
     */
    private String providerName;
    private Integer credit;
}
