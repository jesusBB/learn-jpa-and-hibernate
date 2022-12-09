package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;


import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJDBCRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static String INSERT_QUERY = """
          insert into course (id, name, author)
          values (?, ?, ?);
      """;

    private static String DELETE_QUERY = """
        delete FROM course where ID = ?
        """;

    public void insert(Course course){
      jdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
    }

    public void delete(long id){
        jdbcTemplate.update(DELETE_QUERY, id);
    }
}
