package com.wfb.framework.domain.data.doublegen;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;
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
 * 〈孵化器表〉
 *
 * @author hyz
 * @create 2018/11/28 0028
 * @since 1.0.0
 */
@Data
@ToString
@Entity
@Table(name="office")
public class Office implements Serializable {
    @Id
    @ApiModelProperty("分店ID")
    private Integer officeID;
    private String officeName;
    private Integer brandID;
    private Integer buildingID;
    private Integer typeID;
    private String location;
    private String slogan;
    private String imagesJSON;
    private String contactAvator;
    private String contactName;
    private String contactPhone;
    private Boolean canRegister;
    private BigDecimal price;
    private Integer seatCount;
    private Integer seatFreeCount;
    private Integer roomCount;
    private Integer roomFreeCount;
    private Boolean isDelete;
    private Integer rentCount;
    private Date createDate;
    private BigDecimal acreage;
    private Integer projectCount;
    private Integer seatUsedCount;
    private Boolean isPark;
    private Integer parkID;



}
