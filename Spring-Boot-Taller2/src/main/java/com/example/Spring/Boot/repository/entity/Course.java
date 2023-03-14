package com.example.Spring.Boot.repository.entity;

import com.example.Spring.Boot.dto.CourseDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
import java.util.stream.Collectors;
@Entity
public class Course {
    @Id
    private Integer id;
    @Column (name = "LIST-STUDENT", nullable = false)
    private List<Student> student;
    @Column (name = "TEACHER", nullable = false)
    private Teacher teacher;
    @Column (name = "SCHEDULE", nullable = false)
    private String schedule;
    @Column (name = "SUBJECT", nullable = false)
    private String subject;


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Course(){
    }

    public Course(List<Student> student, Teacher teacher, String schedule, String subject, Integer id){
        this.student = student;
        this.teacher = teacher;
        this.schedule = schedule;
        this.subject = subject;
        this.id = id;
    }

    public Course(CourseDTO courseDTO){
        this.id = courseDTO.getId();
        this.student = courseDTO.getStudentDTO()
                .stream()
                .map(studentDTO -> Student.studentFromDTO(studentDTO)).collect(Collectors.toList());
        this.teacher = Teacher.teacherFromDTO(courseDTO.getTeacherDTO());
        this.schedule = courseDTO.getSchedule();
        this.subject = courseDTO.getSubject();
    }



    public List<Student> getStudent(){
        return this.student;
    }

    public void setStudent(List<Student> student){
        this.student = student;
    }

    public Teacher getTeacher(){
        return this.teacher;
    }

    public void setTeacher(Teacher teacher){
        this.teacher = teacher;
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

    public static Course CourseFromDTO(CourseDTO courseDTO){
        Course course = new Course();
        course.setSchedule(courseDTO.getSchedule());
        course.setSubject(courseDTO.getSubject());
        return course;
    }
}
