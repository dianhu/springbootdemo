package com.dianhu.service;

import com.alibaba.fastjson.JSON;
import com.dianhu.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Time : 18-9-9 下午9:15
 * Author : hcy
 * Description :
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisServiceTest {
    private static final Logger logger = LoggerFactory.getLogger(RedisServiceTest.class);

    @Resource
    private RedisService redisService;

    @Test
    public void testList() {
        //测试redis的list类型
        redisService.setList("list", "football");
        redisService.setList("list", "basketball");
        List<String> valList = redisService.getList("list",0,-1);
        for(String value :valList){
            logger.info("list中有：{}", value);
        }
    }

    @Test
    public void testString() {
        //测试Redis的string类型
        redisService.setString("weichat","程序员私房菜");
        logger.info("我的微信公众号为：{}", redisService.getString("weichat"));

        User user = new User("CSDN", "123456");
        redisService.setString("userInfo", JSON.toJSONString(user));
        logger.info("用户信息：{}", redisService.getString("userInfo"));
    }

    @Test
    public void testHash() {
        User user = new User("CSDN", "123456");
        //测试Redis的hash类型
        redisService.setHash("user", "name", JSON.toJSONString(user));
        logger.info("用户姓名：{}", redisService.getHash("user","name"));
    }
}
