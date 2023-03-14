package com.example.Spring.Boot.repository.entity;

import com.example.Spring.Boot.dto.TeacherDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
import java.util.stream.Collectors;

@Entity
public class Teacher {

    //Estas son las variables de la clase

    @Id
    private String id;
    @Column (name = "NAME-TEACHER", nullable = false)
    private String name;
    @Column (name = "LASTNAME-TEACHER", nullable = false)
    private String lastName;
    @Column (name = "AGE-TEACHER")
    private Integer age;
    @Column (name = "LASTNAME-TEACHER")
    private List<Course> course;

    //Estos son los constructores de la clase
    public Teacher(){
    }
    public Teacher(String name, String lastName, String id, Integer age, List<Course> course){
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
        this.course = course;
    }

    public Teacher(TeacherDTO teacherDTO){
        this.name = teacherDTO.getName();
        this.lastName = teacherDTO.getLastName();
        this.id = teacherDTO. getId();
        this.age = teacherDTO.getAge();
        this.course = teacherDTO.getCourseDTO()
                .stream()
                .map(p -> Course.CourseFromDTO(p))
                .collect(Collectors.toList());
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

    public String getId(){
        return this.id;
    }

    public void setId(String Id){
        this.id = id;
    }

    public Integer getAge(){
        return this.age;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public List<Course> getCourse(){
        return this.course;
    }

    public void setCourse(List<Course> course){
        this.course = course;
    }

    public static Teacher teacherFromDTO(TeacherDTO teacherDTO){
        Teacher profe = new Teacher();
        profe.setName(teacherDTO.getName());
        profe.setLastName(teacherDTO.getLastName());
        profe.setId(teacherDTO.getId());
        profe.setAge(teacherDTO.getAge());
        return profe;
    }
}

