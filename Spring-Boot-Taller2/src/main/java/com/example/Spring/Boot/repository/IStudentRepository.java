package com.example.Spring.Boot.repository;

import com.example.Spring.Boot.repository.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepository extends JpaRepository<Student, Integer> {
}
