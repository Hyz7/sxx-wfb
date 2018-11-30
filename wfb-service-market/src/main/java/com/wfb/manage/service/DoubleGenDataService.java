package com.wfb.manage.service;

import com.wfb.framework.domain.data.doublegen.Office;
import com.wfb.framework.domain.data.doublegen.info.VehicleInfo;
import com.wfb.framework.domain.data.doublegen.info.response.VehicleInfoResult;
import com.wfb.manage.dao.DoubleGenDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述〉<br>
 * 〈双创数据展示业务层〉
 *
 * @author hyz
 * @create 2018/11/28 0028
 * @since 1.0.0
 */
@Service
public class DoubleGenDataService {
    @Autowired
    private DoubleGenDataMapper doubleGenDataMapper;

    public VehicleInfoResult showVehicleInfo() {
        // 创建载体实体
        VehicleInfo vehicleInfo = new VehicleInfo();
        // 保存孵化器数量
        vehicleInfo.setOfficeCount(doubleGenDataMapper.findOfficeCount());
        // 保存孵化器总面积
        vehicleInfo.setAcreage(doubleGenDataMapper.findAcreage());
        // 保存孵化企业数量
        vehicleInfo.setTeamCount(doubleGenDataMapper.findOfficeCount());
        return null;
    }
}
