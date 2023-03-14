package com.example.Spring.Boot.dto;

import com.example.Spring.Boot.repository.entity.Course;

import java.util.List;
import java.util.stream.Collectors;

public class CourseDTO {
    private List<StudentDTO> studentDTO;
    private TeacherDTO teacherDTO;
    private String schedule;
    private String subject;
    private Integer id;

    public CourseDTO(){
    }

    public CourseDTO(List<StudentDTO> studentDTO, TeacherDTO teacherDTO, String schedule, String subject, Integer id) {
        this.studentDTO = studentDTO;
        this.teacherDTO = teacherDTO;
        this.schedule = schedule;
        this.subject = subject;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CourseDTO(CourseDTO courseDTO){
        this.id = courseDTO.getId();
        this.studentDTO = courseDTO.getStudentDTO()
                .stream()
                .map(studentDTO -> StudentDTO.studentfromDTO(studentDTO)).collect(Collectors.toList());
        this.teacherDTO = TeacherDTO.teacherFromDTO(courseDTO.getTeacherDTO());
        this.schedule = courseDTO.getSchedule();
        this.subject = courseDTO.getSubject();
    }
        public List<StudentDTO> getStudentDTO(){
            return this.studentDTO;
        }

        public void setStudentDTO(List<StudentDTO> studentDTO){
            this.studentDTO = studentDTO;
        }

        public TeacherDTO getTeacherDTO(){
            return this.teacherDTO;
        }

        public void setTeacherDTO(TeacherDTO teacherDTO){
            this.teacherDTO = teacherDTO;
        }

        public String getSchedule(){
            return this.schedule;
        }

        public void setSchedule(String schedule){
            this.schedule = schedule;
        }

        public String getSubject(){
            return this.subject;
        }

        public void setSubject(String subject){
            this.subject = subject;
        }

        public static CourseDTO CourseFromCourse(Course course){
        CourseDTO course1 = new CourseDTO();
        course1.setSchedule(course.getSchedule());
        course1.setSubject(course.getSubject());
        return course1;
    }


}
