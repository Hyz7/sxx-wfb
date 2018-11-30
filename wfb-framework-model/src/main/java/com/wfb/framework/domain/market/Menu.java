package com.wfb.framework.domain.market;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br>
 * 〈菜单分类〉
 *
 * @author hyz
 * @create 2018/11/23 0023
 * @since 1.0.0
 */
@Data
@ToString
@Entity
@Table(name="menu")
public class Menu implements Serializable {
    @Id
    @ApiModelProperty("主键")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String id;
    @ApiModelProperty("分类")
    private String category;
}
