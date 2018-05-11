package com.jnshu.controller;

import com.jnshu.service.ServiceManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: SSM_Tiles
 * @description: Controller层
 * @author: Mr.xweiba
 * @create: 2018-05-11 00:04
 **/
@Controller
public class ControllerMain {
    @Autowired
    ServiceManage serviceManage;

    @RequestMapping("/home")
    public String index(Model model) {
        return "home";
    }

    @RequestMapping("/profession")
    public String home(Model model) {
        return "profession";

    }
}
