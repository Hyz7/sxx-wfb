package com.wfb.framework.domain.market.response;

import com.wfb.framework.domain.market.vo.CompanyInfoVo;
import com.wfb.framework.model.response.ResponseResult;
import com.wfb.framework.model.response.ResultCode;
import lombok.Data;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈申报信息结果集〉
 *
 * @author hyz
 * @create 2018/11/28 0028
 * @since 1.0.0
 */
@Data
public class CompanyInfoResult extends ResponseResult {
    List<CompanyInfoVo> companyInfoVos;

    public CompanyInfoResult(ResultCode resultCode, List<CompanyInfoVo> companyInfoVos) {
        super(resultCode);
        this.companyInfoVos = companyInfoVos;
    }
}
