package com.wfb.framework.domain.vo;

import com.wfb.framework.domain.market.Company;
import com.wfb.framework.domain.market.ProductProvider;
import com.wfb.framework.domain.market.vo.CompanyVo;
import com.wfb.framework.domain.market.vo.ProductProviderVo;
import lombok.Data;
import lombok.ToString;

import java.util.Date;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈企业和服务商〉
 *
 * @author hyz
 * @create 2018/11/26 0026
 * @since 1.0.0
 */
@Data
@ToString
public class CompanyAndProviderVo {
    private List<CompanyVo> company;
    private List<ProductProviderVo> productProvider;
}
