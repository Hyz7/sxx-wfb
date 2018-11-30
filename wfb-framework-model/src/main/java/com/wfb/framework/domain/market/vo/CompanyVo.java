package com.wfb.framework.domain.market.vo;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 * 〈企业Vo类〉
 *
 * @author hyz
 * @create 2018/11/26 0026
 * @since 1.0.0
 */
@Data
@ToString
public class CompanyVo {
    private Integer companyID;
    private String companyName;
    private Integer credit;
}
