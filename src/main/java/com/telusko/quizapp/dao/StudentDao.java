package com.telusko.quizapp.dao;

import com.telusko.quizapp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student,Integer> {
}
