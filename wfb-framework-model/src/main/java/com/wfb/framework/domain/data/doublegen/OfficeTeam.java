package com.wfb.framework.domain.data.doublegen;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 * 〈孵化器入驻团队〉
 *
 * @author hyz
 * @create 2018/11/28 0028
 * @since 1.0.0
 */
@Data
@ToString
@Entity
@Table(name="office_team")
public class OfficeTeam implements Serializable {
    @Id
    @Column(name = "ID")
    private Integer id;
    private String orderID;
    private Integer teamID;
    private Integer officeID;
    private String position;
    private Boolean isDelete;
    private Date inDate;
    private Boolean isOnline;
    private BigDecimal acreage;


}
