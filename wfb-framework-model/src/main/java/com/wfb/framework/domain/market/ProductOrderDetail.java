package com.wfb.framework.domain.market;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 〈一句话功能简述〉<br>
 * 〈订单追加信〉
 *
 * @author hyz
 * @create 2018/11/26 0026
 * @since 1.0.0
 */
@Data
@ToString
@Entity
@Table(name="productorderdetail")
public class ProductOrderDetail implements Serializable {
    @Id
    @Column(name = "ID")
    @ApiModelProperty("订单追加信id")
    private Integer id;
    @ApiModelProperty("订单id")
    private String orderID;
    @ApiModelProperty("产品id")
    private Integer productID;
    private Integer number;
    @ApiModelProperty("价格")
    private BigDecimal price;
}
