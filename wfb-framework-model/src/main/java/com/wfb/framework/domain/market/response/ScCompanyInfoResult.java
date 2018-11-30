package com.wfb.framework.domain.market.response;

import com.wfb.framework.domain.market.ScCompanyInfo;
import com.wfb.framework.model.response.ResponseResult;
import com.wfb.framework.model.response.ResultCode;
import lombok.Data;

/**
 * 〈一句话功能简述〉<br>
 * 〈申报信息结果集〉
 *
 * @author hyz
 * @create 2018/11/28 0028
 * @since 1.0.0
 */
@Data
public class ScCompanyInfoResult extends ResponseResult {
    ScCompanyInfo scCompanyInfo;

    public ScCompanyInfoResult(ResultCode resultCode, ScCompanyInfo scCompanyInfo) {
        super(resultCode);
        this.scCompanyInfo = scCompanyInfo;
    }
}
