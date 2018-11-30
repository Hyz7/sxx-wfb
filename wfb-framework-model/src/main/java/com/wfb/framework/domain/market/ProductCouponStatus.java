package com.wfb.framework.domain.market;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br>
 * 〈信用券状态〉
 *
 * @author hyz
 * @create 2018/11/26 0026
 * @since 1.0.0
 */
@Data
@ToString
@Entity
@Table(name="productcouponstatus")
public class ProductCouponStatus implements Serializable {
    @Id
    @ApiModelProperty("状态id")
    private Integer statusID;
    @ApiModelProperty("状态")
    private String statusName;
}
