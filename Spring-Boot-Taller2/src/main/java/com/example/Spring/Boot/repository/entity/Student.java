package com.example.Spring.Boot.repository.entity;

import com.example.Spring.Boot.dto.StudentDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
@Entity
public class Student {

    //Estas son las variables de la clase
    @Id
    private String id;
    @Column (name = "NAME-STUDENT", nullable = false)
    private String name;
    @Column (name = "LASTNAME-STUDENT", nullable = false)
    private String lastName;
    @Column (name = "BIRTH-DATE", nullable = false)
    private LocalDate birthDate;
    @Column (name = "AGE", nullable = false)
    private Integer age;
    @Column (name = "COURSE", nullable = false)
    private Course course;

    //Estos son los constructores de la clase
    public Student(){
    }

    public Student(String name, String lastName, LocalDate birthDate, String id, Integer age, Course course){
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.id = id;
        this.age = age;
        this.course = course;
    }

    public Student(StudentDTO studentDTO){
        this.name = studentDTO.getName();
        this.lastName = studentDTO.getLastName();
        this.birthDate = studentDTO.getBirthDate();
        this.id = studentDTO.getId();
        this.age = studentDTO.getAge();
        this.course = Course.CourseFromDTO(studentDTO.getCourseDTO());
    }

    //Estos son los métodos get y set, los que me sirven para obtener y guardar información en la clase.
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public LocalDate getBirthDate(){
        return this.birthDate;
    }

    public void setBirthDate(LocalDate birthDate){
        this.birthDate = birthDate;
    }

    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }

    public Integer getAge(){
        return this.age;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public Course getCourse(){
        return this.course;
    }

    public void setCourse(Course course){
        this.course = course;
    }

    public static Student studentFromDTO(StudentDTO studentDTO){
        Student value = new Student();
        value.setName(studentDTO.getName());
        value.setLastName(studentDTO.getLastName());
        value.setBirthDate(studentDTO.getBirthDate());
        value.setId(studentDTO.getId());
        value.setAge(studentDTO.getAge());
        return value;
    }

}


