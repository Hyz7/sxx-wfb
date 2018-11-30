package com.wfb.framework.domain.market.vo;

import com.wfb.framework.domain.market.ScCompanyInfo;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈申报信息〉
 *
 * @author hyz
 * @create 2018/11/29 0029
 * @since 1.0.0
 */
@Data
@ToString
public class DeclareInfoVo {
    /**
     * 申报订单列表
     */
    private List<CompanyInfoVo> companyInfoVos;

    /**
     * 申报信息详情
     */
    private ScCompanyInfo companyInfo;
}
