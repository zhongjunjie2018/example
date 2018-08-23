package com.zjj.exercise;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestO {

    @Test
    public void testUrl(){

        String url = "/image/index";
        String str = "/image";
        Boolean boo = url.startsWith(str);

        System.out.println("是否正确："+boo);
    }

    @Test
    public void  testList(){

        List list = new ArrayList();

        String str = "zjj";
        String str2 = "zbl";



    }
}
