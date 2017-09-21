package com.example.Service;

import com.example.Dao.StudentDao;
import com.example.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by sergiosilva on 9/20/17.
 */

@Service
public class StudentService {

    @Autowired
    @Qualifier("mongoData")
    private StudentDao studentDao;

    public Collection<Student> getAllStudents(){
        return studentDao.getAllStudents();
    }

    public Student getStudentById(int id) {
        return studentDao.getStudentById(id);
    }

    public void removeStudentById(int id) {
        this.studentDao.removeStudentById(id);
    }

    public void updateStudent(Student student){
        this.studentDao.updateStudent(student);
    }

    public void createStudent(Student student) {
        this.studentDao.createStudent(student);
    }
}
