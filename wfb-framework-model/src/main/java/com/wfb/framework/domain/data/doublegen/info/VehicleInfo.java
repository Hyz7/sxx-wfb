package com.wfb.framework.domain.data.doublegen.info;

import lombok.Data;
import lombok.ToString;

/**
 * 〈一句话功能简述〉<br>
 * 〈孵化载体信息Vo〉
 *
 * @author hyz
 * @create 2018/11/28 0028
 * @since 1.0.0
 */
@Data
@ToString
public class VehicleInfo {
    /**
     * 孵化器数量
     */
    private Integer officeCount;
    /**
     * 孵化空间面积
     */
    private Integer acreage;
    /**
     * 孵化企业数量
     */
    private Integer teamCount;



}
