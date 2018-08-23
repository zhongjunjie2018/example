package com.zjj.exercise.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    private static Logger logger = Logger.getLogger(HomeController.class);

    @RequestMapping("/")
    public String hime(){
        logger.info("访问空白页面controller");
        return "index";
    }
    @RequestMapping("/index")
    public String index(){
        logger.info("index controller");
        return "index";
    }
    @RequestMapping("/home2")
    @ResponseBody
    public String home2(){
        System.out.println("this is home Controller");
        return "index";
    }
}
