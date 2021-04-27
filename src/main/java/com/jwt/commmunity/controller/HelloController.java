package com.jwt.commmunity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ProjectName: commmunity
 * @ClassName: HelloController
 * @Description: 请描述该类的功能
 * @Author: 86132
 * @Date: 2021/4/27 20:43
 * @version v1.0
 * Copyright (c) All Rights Reserved,. 
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("name",name);
        return "hello";
    }
}

