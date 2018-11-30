package com.wfb.manage.dao;

import com.wfb.framework.domain.market.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 〈一句话功能简述〉<br>
 * 〈菜单持久层〉
 *
 * @author hyz
 * @create 2018/11/23 0023
 * @since 1.0.0
 */
public interface MenuRepository extends JpaRepository<Menu,Integer> {
}
