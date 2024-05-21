package com.telusko.quizapp.service;

import com.telusko.quizapp.dao.StudentDao;
import com.telusko.quizapp.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentDao studentDao;
    public ResponseEntity<List<Student>> getAllStudents() {
        try {
            return new ResponseEntity<>(studentDao.findAll(), HttpStatus.OK);
        }catch(Exception e){
            e.printStackTrace();

        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> addStudent(Student student) {

        studentDao.save(student);
        return new ResponseEntity("success",HttpStatus.CREATED);
    }
}
