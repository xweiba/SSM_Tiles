package com.jnshu.service.impl;

import com.jnshu.mapper.ProfessionDao;
import com.jnshu.mapper.StudentDao;
import com.jnshu.modle.Profession;
import com.jnshu.modle.Student;
import com.jnshu.modle.StudentStatistics;
import com.jnshu.modle.StundetCustom;
import com.jnshu.service.ServiceManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public Student findByIdStudent(Integer id) {
        return null;
    }

    public List<StundetCustom> findListStudent() {
        return studentDao.findListStudent();
    }

    public boolean insertStudent(Student student) {
        return false;
    }

    public boolean deleteStudent(Integer id) {
        return false;
    }

    public boolean updateStudent(Student student) {
        return false;
    }

    public StudentStatistics countStudent() {
        Integer countStudent = studentDao.countStudent();
        Integer countWork = studentDao.countWork();
        StudentStatistics studentStatistics = new StudentStatistics();
        studentStatistics.setCountStudent(countStudent);
        studentStatistics.setWorkStundet(countWork);
        return studentStatistics;
    }

    public List<Profession> findByListProfession() {
        return professionDao.findByListProfession();
    }

}
