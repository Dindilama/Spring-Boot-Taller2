package com.example.Spring.Boot.service;

import com.example.Spring.Boot.dto.CourseDTO;
import com.example.Spring.Boot.dto.StudentDTO;
import com.example.Spring.Boot.repository.entity.Course;

import java.util.List;

public interface ICourseService {
    void save(CourseDTO courseDTO); //Guardar

    List<CourseDTO> getAll(); //Obtener lista

    void update(CourseDTO courseDTO); //Actualizar la lista

    void delete(Integer idCourse); //Eliminar por ID

    CourseDTO findById(Integer idCourse); // Buscar por el ID

}
