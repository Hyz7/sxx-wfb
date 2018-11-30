package com.wfb.framework.domain.data.doublegen;

import io.swagger.models.auth.In;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 * 〈楼宇〉
 *
 * @author hyz
 * @create 2018/11/28 0028
 * @since 1.0.0
 */
@Data
@ToString
@Entity
@Table(name="building")
public class Building {
    @Id
    private Integer buildingID;
    private String buildingName;
    private Integer areaSubID;
    private Integer subwaySubID;
    private String address;
    private Integer houseCount;
    private String rentCount;
    private Integer freeCount;
    private Integer visitCount;
    private BigDecimal minAcreage;
    private BigDecimal maxAcreage;
    private BigDecimal minPrice;
    private BigDecimal maxPrice;
    private String imagesJSON;
    private String introduction;
    private String subway;
    private String bus;
    private Double longitude;
    private Double latitude;
    private BigDecimal waterPrice;
    private BigDecimal networkPrice;
    private BigDecimal electricPrice;
    private Boolean isDelete;
    private Integer companyCount;
    private Integer companyITCount;
    private Date createDate;





}
