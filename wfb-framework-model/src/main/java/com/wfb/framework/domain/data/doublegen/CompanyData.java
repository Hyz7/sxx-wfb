package com.wfb.framework.domain.data.doublegen;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 * 〈公司数据〉
 *
 * @author hyz
 * @create 2018/11/28 0028
 * @since 1.0.0
 */
@Data
@ToString
@Entity
@Table(name="companydata")
public class CompanyData {
    @Id
    private Integer companyID;
    private Integer rjzzq;
    private Integer gd;
    private BigDecimal yhdkje;
    private Date yhdksj;
    private BigDecimal gqrzje;
    private String gqrzlc;
    private Date gqrzsj;
    private BigDecimal sfyrzxq;
    private String zz;
    private Integer sb;
    private Integer fmzl;
    private Integer xxzl;
    private Integer wgzl;
    private Integer staffCount;


}
