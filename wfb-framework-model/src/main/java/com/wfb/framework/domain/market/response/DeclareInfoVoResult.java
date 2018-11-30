package com.wfb.framework.domain.market.response;

import com.wfb.framework.domain.market.vo.DeclareInfoVo;
import com.wfb.framework.model.response.ResponseResult;
import com.wfb.framework.model.response.ResultCode;
import lombok.Data;

/**
 * 〈一句话功能简述〉<br>
 * 〈申报信息列表结果集〉
 *
 * @author hyz
 * @create 2018/11/29 0029
 * @since 1.0.0
 */
@Data
public class DeclareInfoVoResult extends ResponseResult {
    private DeclareInfoVo declareInfoVo;

    public DeclareInfoVoResult(ResultCode resultCode, DeclareInfoVo declareInfoVo) {
        super(resultCode);
        this.declareInfoVo = declareInfoVo;
    }
}
