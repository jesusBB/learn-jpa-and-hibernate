package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

  @Autowired
  private CourseJDBCRepository courseJDBCRepository;

  @Override
  public void run(String... args) throws Exception {
      courseJDBCRepository.insert(new Course(1, "Learn AWS!", "in28minutes"));
      courseJDBCRepository.insert(new Course(2, "Learn AWS 22!", "in28minutes"));
      courseJDBCRepository.insert(new Course(3, "Learn AWS 333!", "in28minutes"));
      courseJDBCRepository.delete(2);
  }
}
