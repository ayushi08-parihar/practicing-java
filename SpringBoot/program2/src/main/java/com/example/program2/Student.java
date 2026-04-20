package com.example.program2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Student {
  @Autowired
  private Course course;
  public Student(Course course)
  {
    this.course=course;
  }
  public void study()
  {
    System.out.println("I am studying "+course.getCourseName());
  }
    
}
