package com.wfb.framework.domain.data.doublegen.info.response;

import com.wfb.framework.domain.data.doublegen.info.CompanyInfo;
import com.wfb.framework.domain.data.doublegen.info.VehicleInfo;
import com.wfb.framework.model.response.ResponseResult;
import com.wfb.framework.model.response.ResultCode;
import lombok.Data;

/**
 * 〈一句话功能简述〉<br>
 * 〈载体信息结果集〉
 *
 * @author hyz
 * @create 2018/11/28 0028
 * @since 1.0.0
 */
@Data
public class VehicleInfoResult extends ResponseResult {
    VehicleInfo vehicleInfo;

    public VehicleInfoResult(ResultCode resultCode, VehicleInfo vehicleInfo) {
        super(resultCode);
        this.vehicleInfo = vehicleInfo;
    }
}
