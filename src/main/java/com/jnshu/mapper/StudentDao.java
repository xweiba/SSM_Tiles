package com.jnshu.mapper;

import com.jnshu.modle.Student;

import java.util.List;

public interface StudentDao {
    Student findByIdStudent(int id);
    List<Student> findListStudent();
    boolean insertStudent(Student student);
    boolean deleteStrudent(int id);
}
