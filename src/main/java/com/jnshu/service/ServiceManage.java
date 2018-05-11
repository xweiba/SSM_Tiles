package com.jnshu.service;

import com.jnshu.modle.Student;

import java.util.List;

public interface ServiceManage {
    Student findByIdStudent(Integer id);
    List<Student> findListStudent();
    boolean insertStudent(Student student);
    boolean deleteStudent(Integer id);
    boolean updateStudent(Student student);
    Integer countStudent(Student student);
}
