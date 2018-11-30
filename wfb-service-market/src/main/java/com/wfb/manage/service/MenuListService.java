package com.wfb.manage.service;

import com.wfb.framework.domain.market.Menu;
import com.wfb.manage.dao.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author hyz
 * @create 2018/11/23 0023
 * @since 1.0.0
 */
@Service
public class MenuListService {
    @Autowired
    private MenuRepository menuRepository;

    /**
     * 展示菜单列表
     * @return 菜单
     */
    public List<Menu> showMenuList() {
        return menuRepository.findAll();
    }
}
