package com.wfb.framework.domain.data.doublegen;

import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Table(name="house_team")
public class HouseTeam {
    @Id
    @Column(name = "ID")
    private Integer id;
    private Integer teamID;
    private Integer position;
    private String houseID;
    private Boolean isDelete;
}
