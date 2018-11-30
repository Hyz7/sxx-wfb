package com.wfb.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com.wfb.framework.domain")//扫描实体类
@ComponentScan(basePackages = {"com.wfb.api"})//扫描接口
@ComponentScan(basePackages = {"com.wfb.framework"})//扫描common
@ComponentScan(basePackages = {"com.wfb.manage"})//扫描本项目下的所有类
/**
 * 〈一句话功能简述〉<br>
 * 〈启动类〉
 *
 * @author hyz
 * @create 2018/11/23 0023
 * @since 1.0.0
 */
public class ManageApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManageApplication.class, args);
    }

}
