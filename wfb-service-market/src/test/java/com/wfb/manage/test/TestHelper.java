package com.wfb.manage.test;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wfb.framework.domain.market.Company;
import com.wfb.manage.dao.ProductMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈测试分页条件查询〉
 *
 * @author hyz
 * @create 2018/11/29 0029
 * @since 1.0.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestHelper {
    @Autowired
    private ProductMapper productMapper;

    @Test
    public void testQuery(){
        // 当前页数
        int page = 1;
        int pageSize = 10;
        Page page1 = PageHelper.startPage(page, pageSize);
        // 当前页记录数
        List<Company> companyList = productMapper.testHelper("成都");
        PageInfo<Company> companyPageInfo = new PageInfo<>(companyList,1);
        List<Company> list = companyPageInfo.getList();
        System.out.println("总记录数:"+companyPageInfo.getTotal());
        //System.out.println(companyPageInfo);
    }
}
