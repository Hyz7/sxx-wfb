/**
 * 〈一句话功能简述〉<br>
 * 〈双创数据展示接口〉
 *
 * @author hyz
 * @create 2018/11/28 0028
 * @since 1.0.0
 */
package com.wfb.api.market;

import com.wfb.framework.domain.data.doublegen.info.response.VehicleInfoResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="双创数据",description = "双创数据的展示")
public interface DoubleGenDataControllerApi {
    /**
     * @return 孵化载体结果集
     */
    @ApiOperation("显示孵化载体信息")
    VehicleInfoResult showVehicleInfo();
}
