package com.wfb.framework.domain.data.doublegen.info.response;

import com.wfb.framework.domain.data.doublegen.info.CompanyInfo;
import com.wfb.framework.model.response.ResponseResult;
import com.wfb.framework.model.response.ResultCode;
import lombok.Data;

/**
 * 〈一句话功能简述〉<br>
 * 〈企业信息结果集〉
 *
 * @author hyz
 * @create 2018/11/28 0028
 * @since 1.0.0
 */
@Data
public class CompanyInfoResult extends ResponseResult {
    CompanyInfo companyInfo;

    public CompanyInfoResult(ResultCode resultCode, CompanyInfo companyInfo) {
        super(resultCode);
        this.companyInfo = companyInfo;
    }
}
