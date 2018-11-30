package com.wfb.framework.domain.market.vo;

import lombok.Data;
import lombok.ToString;

/**
 * 〈一句话功能简述〉<br>
 * 〈基本企业信息〉
 *
 * @author hyz
 * @create 2018/11/29 0029
 * @since 1.0.0
 */
@Data
@ToString
public class ScCorporateCenterVo {
    /**
     * 企业id
     */
    private Long id;
    /**
     * 企业名称
     */
    private String corporateName;
    /**
     * 星级
     */
    private String state;
}
