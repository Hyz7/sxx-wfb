package com.wfb.framework.domain.market;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 * 〈服务商〉
 *
 * @author hyz
 * @create 2018/11/26 0026
 * @since 1.0.0
 */
@Data
@ToString
@Entity
@Table(name="productprovider")
public class ProductProvider implements Serializable {
    @Id
    @ApiModelProperty("服务商id")
    private Integer providerID;
    @ApiModelProperty("服务商名称")
    private String providerName;
    @ApiModelProperty("商标")
    private String logo;
    @ApiModelProperty("销售数量")
    private Integer saleCount;
    private Integer qualityAvg;
    private Integer speedAvg;
    private Integer serviceAvg;
    private Boolean isDelete;
    private String CUSCC;
    @ApiModelProperty("信用")
    private Integer credit;
    @ApiModelProperty("创建时间")
    private Date createDate;
    private String qq;
}
