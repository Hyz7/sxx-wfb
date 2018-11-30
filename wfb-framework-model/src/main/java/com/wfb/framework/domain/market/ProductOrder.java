package com.wfb.framework.domain.market;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 * 〈订单〉
 *
 * @author hyz
 * @create 2018/11/26 0026
 * @since 1.0.0
 */
@Data
@ToString
@Entity
@Table(name="productorder")
public class ProductOrder implements Serializable {
    @Id
    @ApiModelProperty("订单id")
    private String orderID;
    @ApiModelProperty("用户id")
    private String userID;
    @ApiModelProperty("公司id")
    private Integer companyID;
    @ApiModelProperty("订单创建时间")
    private Date createTime;
    @ApiModelProperty("费用")
    private BigDecimal fee;
    @ApiModelProperty("付款")
    private BigDecimal pay;
    private Boolean payTypeID;
    @ApiModelProperty("交款期限")
    private Date payLimitTime;
    private String remark;
    @ApiModelProperty("状态id")
    private Integer statusID;
    private Date statusTime;
    @ApiModelProperty("是否删除")
    private Boolean isDelete;
    @ApiModelProperty("是否使用")
    private Boolean isUse;
    private String transactionId;


}
