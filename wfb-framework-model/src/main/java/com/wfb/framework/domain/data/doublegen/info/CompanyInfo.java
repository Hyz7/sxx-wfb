package com.wfb.framework.domain.data.doublegen.info;

import lombok.Data;
import lombok.ToString;

/**
 * 〈一句话功能简述〉<br>
 * 〈孵化企业信息〉
 *
 * @author hyz
 * @create 2018/11/28 0028
 * @since 1.0.0
 */
@Data
@ToString
public class CompanyInfo {
    /**
     * 种子企业
     */
    private Integer officeCount;
    /**
     * 登羚企业
     */
    private Integer acreage;
    /**
     * 独角兽企业
     */
    private Integer teamCount;
    /**
     * 龙头企业
     */



}
