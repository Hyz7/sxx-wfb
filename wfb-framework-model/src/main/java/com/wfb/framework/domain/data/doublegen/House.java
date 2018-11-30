package com.wfb.framework.domain.data.doublegen;

import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * 〈一句话功能简述〉<br>
 * 〈写字楼〉
 *
 * @author hyz
 * @create 2018/11/28 0028
 * @since 1.0.0
 */
@Data
@ToString
@Entity
@Table(name="house")
public class House {
    @Id
    private Integer houseID;
    private String houseName;
    private Integer typeID;
    private Integer buildingID;
    private Integer decorationID;
    private BigDecimal price;
    private Integer acreage;
    private String houseLocation;
    private Integer seatCount;
    private Integer floor;
    private Boolean canRegister;
    private String premises;
    private String imagesJSON;
    private Integer usage;
    private Integer freeMonths;
    private Integer payRuleID;
    private String visitNote;
    private Integer minMonths;
    private String minData;
    private String contactName;
    private String contactAvator;
    private String contactPhone;
    private Boolean isDelete;
    private BigDecimal priceTotal;
    private Integer visitCount;
    private String introduce;
    private Integer previewCount;
    private Integer rentCount;
    private Boolean isRent;
    private Integer statusID;




}
