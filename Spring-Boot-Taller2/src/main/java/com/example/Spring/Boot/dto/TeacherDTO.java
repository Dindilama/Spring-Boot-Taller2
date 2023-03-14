package com.example.Spring.Boot.dto;

import com.example.Spring.Boot.repository.entity.Teacher;

import java.util.List;
import java.util.stream.Collectors;

public class TeacherDTO {
    private String name;
    private String lastName;
    private String id;
    private Integer age;
    private List<CourseDTO> courseDTO;

    public TeacherDTO(){
    }

    public TeacherDTO(String name, String lastName, String id, Integer age, List<CourseDTO> courseDTO){
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
        this.courseDTO = courseDTO;
    }

    public TeacherDTO(Teacher teacher){
        this.name = teacher.getName();
        this.lastName = teacher.getLastName();
        this.id = teacher.getId();
        this.age = teacher.getAge();
        this.courseDTO = teacher.getCourse()
                .stream()
                .map(p -> CourseDTO.CourseFromCourse(p))
                .collect(Collectors.toList());
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

    public List<CourseDTO> getCourseDTO() {
        return courseDTO;
    }

    public void setCourseDTO(List<CourseDTO> courseDTO) {
        this.courseDTO = courseDTO;
    }

    public static TeacherDTO teacherFromDTO(TeacherDTO teacherDTO){
        TeacherDTO profe = new TeacherDTO();
        profe.setName(teacherDTO.getName());
        profe.setLastName(teacherDTO.getLastName());
        profe.setId(teacherDTO.getId());
        return profe;
    }
}


