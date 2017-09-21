package com.example.Dao;

import com.example.Entity.Student;

import java.util.Collection;

/**
 * Created by sergiosilva on 9/21/17.
 */
public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void updateStudent(Student student);

    void createStudent(Student student);
}
