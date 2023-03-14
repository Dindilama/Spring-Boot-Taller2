package com.example.Spring.Boot.repository;

import com.example.Spring.Boot.repository.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICourseRepository extends JpaRepository<Course, Integer> {

    Course findByIssue(String Issue);
}
