package com.wfb.manage.controller;

import com.wfb.api.market.DoubleGenDataControllerApi;
import com.wfb.framework.domain.data.doublegen.info.response.VehicleInfoResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br>
 * 〈双创数据展示控制层〉
 *
 * @author hyz
 * @create 2018/11/28 0028
 * @since 1.0.0
 */
@RestController
@RequestMapping("/doubleGenData")
public class DoubleGenDataController implements DoubleGenDataControllerApi {

    @Override
    @GetMapping("/showVehicleInfo")
    public VehicleInfoResult showVehicleInfo() {
        return null;
    }
}
