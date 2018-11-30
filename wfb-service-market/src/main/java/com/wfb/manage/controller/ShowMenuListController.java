package com.wfb.manage.controller;

import com.wfb.api.market.ShowMenuListApi;
import com.wfb.framework.domain.market.Menu;
import com.wfb.manage.service.MenuListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈菜单栏展示〉
 *
 * @author hyz
 * @create 2018/11/23 0023
 * @since 1.0.0
 */
@RestController
@RequestMapping("/show/menu")
public class ShowMenuListController implements ShowMenuListApi {

    @Autowired
    private MenuListService menuListService;
    @Override
    @GetMapping("/list")
    public List<Menu> showMenuList() {
        return menuListService.showMenuList();
    }
}
