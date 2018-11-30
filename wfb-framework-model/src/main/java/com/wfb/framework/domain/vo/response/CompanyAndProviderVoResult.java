package com.wfb.framework.domain.vo.response;

import com.wfb.framework.domain.vo.CompanyAndProviderVo;
import com.wfb.framework.model.response.ResponseResult;
import com.wfb.framework.model.response.ResultCode;
import lombok.Data;

/**
 * 〈一句话功能简述〉<br>
 * 〈结果集〉
 *
 * @author hyz
 * @create 2018/11/26 0026
 * @since 1.0.0
 */
@Data
public class CompanyAndProviderVoResult extends ResponseResult {
    CompanyAndProviderVo companyAndProviderVo;

    public CompanyAndProviderVoResult(ResultCode resultCode, CompanyAndProviderVo companyAndProviderVo) {
        super(resultCode);
        this.companyAndProviderVo = companyAndProviderVo;
    }
}
