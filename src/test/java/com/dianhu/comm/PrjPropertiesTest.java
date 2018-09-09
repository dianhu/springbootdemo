package com.dianhu.comm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Time : 18-8-29 下午11:30
 * Author : hcy
 * Description :
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PrjPropertiesTest {
    @Resource
    private PrjProperties prjProperties;

    @Test
    public void testProperties() throws Exception {
        System.out.println("title:"+prjProperties.getTitle());
        System.out.println("description:"+prjProperties.getDescription());
    }
}
