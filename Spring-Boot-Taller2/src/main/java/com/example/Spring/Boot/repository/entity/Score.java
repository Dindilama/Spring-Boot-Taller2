package co.com.ias.springboot.repository.entity;

import com.example.Spring.Boot.repository.entity.Course;
import com.example.Spring.Boot.repository.entity.Student;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.io.Serializable;

@Entity
public class Score implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer notas;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "STUDENT-ID", nullable = false)
    private Student student;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "COURSE_ID", nullable = false)
    private Course course;

    public Score(){
    }

    public Score(Integer id, Integer notas, Student student, Course course) {
        this.id = id;
        this.notas = notas;
        this.student = student;
        this.course = course;
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

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}




