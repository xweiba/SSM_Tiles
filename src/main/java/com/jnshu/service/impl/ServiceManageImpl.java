package com.jnshu.service.impl;

import com.jnshu.mapper.ProfessionDao;
import com.jnshu.mapper.StudentDao;
import com.jnshu.modle.Profession;
import com.jnshu.modle.Student;
import com.jnshu.service.ServiceManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: SSM_Tiles
 * @description: Service实现
 * @author: Mr.xweiba
 * @create: 2018-05-11 00:01
 **/

@Service("serviceManageImpl")
public class ServiceManageImpl implements ServiceManage{
    @Autowired
    StudentDao studentDao;
    @Autowired
    ProfessionDao professionDao;
}
