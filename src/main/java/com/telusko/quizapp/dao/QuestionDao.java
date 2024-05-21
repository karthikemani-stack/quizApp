package com.telusko.quizapp.dao;
import com.telusko.quizapp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import java.util.Map;

public interface QuestionDao extends JpaRepository<Question,Integer> {

    List<Question> findByCategory(String category);
    @Query(value= "select * from questions q where  q.category=:category order by RANDOM() limit :numQ",nativeQuery = true)
    List<Question> findRandomQuestionsByCategory(String category, int numQ);
   
}
