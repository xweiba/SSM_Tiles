package com.jnshu.service;

import com.jnshu.modle.Profession;
import com.jnshu.modle.Student;
import com.jnshu.modle.StudentStatistics;
import com.jnshu.modle.StundetCustom;

import java.util.List;
/* Service 接口管理 */
public interface ServiceManage {
    // 根据id查找学员信息
    Student findByIdStudent(Integer id);
    // 输出所有学员信息
    List<StundetCustom> findListStudent();
    // 插入学员信息
    boolean insertStudent(Student student);
    // 删除学员信息
    boolean deleteStudent(Integer id);
    // 更新学员信息
    boolean updateStudent(Student student);
    // 统计学员信息
    StudentStatistics countStudent();

    // 输出所有职业信息
    List<Profession> findByListProfession();

}
