package com.zjj.exercise;


import com.zjj.exercise.util.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRedis {
    @Autowired
    private RedisUtil redisUtil;

    @Test
    public void testRemove(){

        redisUtil.remove("time");
        //Object o = redisUtil.get("ceshi");
        //System.out.println(o);
    }

    @Test
    public void testRedisTime(){
        String key = "ceshi";
        String value = "ABCD";
        Long time = 60L;
       //Boolean bo = redisUtil.set(key,value,time);
       Boolean bo = redisUtil.set(key,value);
       System.out.println("设置时间："+bo);
    }
}
