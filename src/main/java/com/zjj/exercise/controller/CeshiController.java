package com.zjj.exercise.controller;

import com.zjj.exercise.model.UserModel;
import com.zjj.exercise.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/thymeleaf")
@Controller
public class CeshiController {
    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public String list(Model model){
        System.out.println("测试展示controller");
        List<UserModel> ud = userService.queryAll();
        model.addAttribute("users",ud);
        return "ceshi";
    }
    @RequestMapping("/toDelete")
    public String delete(String username){
        System.out.println("测试删除controller");
        userService.removeUser(username);
        //model.addAttribute("users",ud);
        return "redirect:/thymeleaf/list";
    }
    @RequestMapping("/toAdd")
    public String add(Model model){
        System.out.println("测试增加controller");
        UserModel ud = new UserModel();
        ud.setUsername("zjj");
        ud.setPassword("888888");
        ud.setAge(25);
        userService.addUser(ud);
        return "redirect:/thymeleaf/list";
    }

}
