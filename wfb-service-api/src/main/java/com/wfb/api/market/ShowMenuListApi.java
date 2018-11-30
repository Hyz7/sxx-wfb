package com.wfb.api.market;

import com.wfb.framework.domain.market.Menu;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈展示菜单〉
 *
 * @author hyz
 * @create 2018/11/23 0023
 * @since 1.0.0
 */
@Api(value="菜单展示")
public interface ShowMenuListApi {
    /**
     * @return 菜单列表
     */
    @ApiOperation("显示菜单")
    List<Menu> showMenuList();
}
