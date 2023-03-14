package com.example.Spring.Boot.dto;

import com.example.Spring.Boot.repository.entity.Student;

import java.time.LocalDate;

public class StudentDTO {
    private String name;
    private String lastName;
    private LocalDate birthDate;
    private String id;
    private Integer age;
    private CourseDTO courseDTO;

    public StudentDTO(){
    }
    public StudentDTO(String name, String lastName, LocalDate birthDate, String id, Integer age, CourseDTO courseDTO) {
        this.name = name;
        this.lastName= lastName;
        this.birthDate = birthDate;
        this.id = id;
        this.age = age;
        this.courseDTO = courseDTO;
    }

    public StudentDTO(Student student){
        this.name = student.getName();
        this.lastName = student.getLastName();
        this.birthDate = student.getBirthDate();
        this.id = student.getId();
        this.age = student.getAge();
        this.courseDTO = CourseDTO.CourseFromCourse(student.getCourse());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public CourseDTO getCourseDTO() {
        return courseDTO;
    }

    public void setCourseDTO(CourseDTO courseDTO) {
        this.courseDTO = courseDTO;
    }

    public static StudentDTO studentfromDTO(StudentDTO studentDTO){
        StudentDTO value = new StudentDTO();
        value.setName(studentDTO.getName());
        value.setLastName(studentDTO.getLastName());
        value.setBirthDate(studentDTO.getBirthDate());
        value.setId(studentDTO.getId());
        value.setAge(studentDTO.getAge());
        value.setCourseDTO(studentDTO.getCourseDTO());
        return value;
    }
}


