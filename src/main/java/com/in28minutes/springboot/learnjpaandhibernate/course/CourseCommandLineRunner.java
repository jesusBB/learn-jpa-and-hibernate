package com.in28minutes.springboot.learnjpaandhibernate.course;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
import com.in28minutes.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

  //@Autowired
  //private CourseJDBCRepository repository;

  @Autowired
  private CourseJpaRepository repository;

  //@Autowired
  //private CourseSpringDataJpaRepository repository;

  @Override
  public void run(String... args) throws Exception {
      repository.insert(new Course(1, "Learn AWS!", "in28minutes"));
      repository.insert(new Course(2, "Learn AWS 22!", "in28minutes"));
      repository.insert(new Course(3, "Learn AWS 333!", "in28minutes"));
      repository.deleteById(2l);

      System.out.println(repository.findById(1l));
      System.out.println(repository.findById(3l));

      System.out.println();
  }
}
