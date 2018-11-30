/**
 * 〈一句话功能简述〉<br>
 * 〈双创数据展示持久层〉
 *
 * @author hyz
 * @create 2018/11/28 0028
 * @since 1.0.0
 */
package com.wfb.manage.dao;

import com.wfb.framework.domain.data.doublegen.Office;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DoubleGenDataMapper {
    /**
     * @return 孵化器总数
     */
    @Select("select count(*) from office")
    Integer findOfficeCount();

    /**
     * @return 孵化器面积
     */
    @Select("select sum(acreage) from office")
    Integer findAcreage();

    /**
     * @return 孵化企业数量
     */
    @Select("select count(officeID) from office_team")
    Integer findTeamCount();
}
