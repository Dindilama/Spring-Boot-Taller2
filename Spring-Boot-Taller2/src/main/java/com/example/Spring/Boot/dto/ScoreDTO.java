package com.example.Spring.Boot.dto;

import com.example.Spring.Boot.dto.CourseDTO;
import com.example.Spring.Boot.dto.StudentDTO;

import javax.persistence.*;

public class ScoreDTO {
    @Id
    private Integer id;

    private Integer notas;

    private StudentDTO studentDTO;

    private CourseDTO courseDTO;

    public ScoreDTO() {

    }

    public ScoreDTO(Integer id, Integer notas, StudentDTO studentDTO, CourseDTO courseDTO) {
        this.id = id;
        this.notas = notas;
        this.studentDTO = studentDTO;
        this.courseDTO = courseDTO;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNotas() {
        return notas;
    }

    public void setNotas(Integer notas) {
        this.notas = notas;
    }

    public StudentDTO getStudentDTO() {
        return studentDTO;
    }

    public void setStudentDTO(StudentDTO studentDTO) {
        this.studentDTO = studentDTO;
    }

    public CourseDTO getCourseDTO() {
        return courseDTO;
    }

    public void setCourseDTO(CourseDTO courseDTO) {
        this.courseDTO = courseDTO;
    }
}

