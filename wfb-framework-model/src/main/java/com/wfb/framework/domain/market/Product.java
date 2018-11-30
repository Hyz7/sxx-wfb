package com.wfb.framework.domain.market;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 〈一句话功能简述〉<br>
 * 〈产品〉
 *
 * @author hyz
 * @create 2018/11/26 0026
 * @since 1.0.0
 */
@Data
@ToString
@Entity
@Table(name="product")
public class Product implements Serializable {
    @Id
    @ApiModelProperty("产品id")
    private Integer productID;
    @ApiModelProperty("公司名称")
    private String productName;
    @ApiModelProperty("分组ID")
    private Integer categoryID;
    @ApiModelProperty("活动")
    private String activity;
    @ApiModelProperty("图片")
    private String imagesJSON;
    private Integer providerID;
    private Integer saleCount;
    private BigDecimal price;
    private String serviceContent;
    private String serviceFlow;
    private String deliveryResult;
    private Integer quality;
    private Integer qualityCount;
    private BigDecimal qualityAvg;
    private Integer speed;
    private Integer speedCount;
    private BigDecimal speedAvg;
    private Integer service;
    private Integer serviceCount;
    private BigDecimal serviceAvg;
    private Boolean isCompany;
    private Boolean isDelete;
    private Boolean isAudit;
    private Boolean isAllow;

}
