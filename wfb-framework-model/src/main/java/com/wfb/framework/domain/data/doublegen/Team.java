package com.wfb.framework.domain.data.doublegen;

import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 * 〈团队〉
 *
 * @author hyz
 * @create 2018/11/28 0028
 * @since 1.0.0
 */
@Data
@ToString
@Entity
@Table(name="team")
public class Team {
    @Id
    private Integer teamID;
    private String teamName;
    private Integer companyID;
    private String introduction;
    private Date createDate;
    private Integer memberCount;
    private BigDecimal rentBudget;
    private Integer industryID;
    private Boolean isDelete;
    private Integer planSeatCount;
    private Boolean companyCheck;

}
