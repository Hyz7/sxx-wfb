package com.wfb.framework.domain.vo.response;

import com.wfb.framework.domain.vo.ProductInformationVo;
import com.wfb.framework.model.response.ResponseResult;
import com.wfb.framework.model.response.ResultCode;
import lombok.Data;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈结果集〉
 *
 * @author hyz
 * @create 2018/11/26 0026
 * @since 1.0.0
 */
@Data
public class ProductInformationVoResult extends ResponseResult {
    List<ProductInformationVo> productInformationVo;

    public ProductInformationVoResult(ResultCode resultCode, List<ProductInformationVo> productInformationVo) {
        super(resultCode);
        this.productInformationVo = productInformationVo;
    }
}
