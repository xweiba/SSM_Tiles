package com.jnshu.controller;

import com.jnshu.modle.*;
import com.jnshu.service.ServiceManage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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

    private static Logger logger = LoggerFactory.getLogger(ControllerMain.class);
    private StudentQV studentQV = new StudentQV();

    @RequestMapping("/home")
    public String index(Model model) {
        StudentStatistics studentStatistics = serviceManage.countStudent();
        List<StundetCustom> studentList = serviceManage.findListStudent();
        logger.info(studentList.toString());
        logger.info(studentStatistics.toString());
        studentQV.setStudentStatistics(studentStatistics);
        studentQV.setStudentList(studentList);
        model.addAttribute("studentQV", studentQV);
        return "home";
    }

    @RequestMapping("/profession")
    public String home(Model model) {
        List<Profession> professionList = serviceManage.findByListProfession();
        System.out.println(professionList.toString());
        studentQV.setProfession(professionList);
        model.addAttribute("studentQV", studentQV);
        return "profession";
    }
}
