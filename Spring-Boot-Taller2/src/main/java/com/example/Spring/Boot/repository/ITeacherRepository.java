package com.example.Spring.Boot.repository;

import com.example.Spring.Boot.repository.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITeacherRepository extends JpaRepository<Teacher, Integer> {
}
