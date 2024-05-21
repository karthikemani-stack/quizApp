package com.telusko.quizapp.controller;

import com.telusko.quizapp.model.MyConfiguration;
import com.telusko.quizapp.model.Student;
import com.telusko.quizapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    StudentService studentService;
    @Autowired
    MyConfiguration myConfiguration;
    @GetMapping("allStudents")
    public ResponseEntity<List<Student>> getAllStudents(){
         return studentService.getAllStudents();
    }
    @PostMapping("addStudent")
    public ResponseEntity<String> addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
    @GetMapping("configuredValue")
    public String addconfiguredValue(){
        String str = myConfiguration.doSomething();
        return str;
    }

}
