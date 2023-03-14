package com.example.Spring.Boot.service;

import com.example.Spring.Boot.dto.TeacherDTO;

import java.util.List;
import java.util.Optional;

public interface ITeacherService {

    void save(TeacherDTO teacherDTO); //Guardar

    List<TeacherDTO> getAll(); //Obtener lista de profesoresDTO

    void update(TeacherDTO teacherDTO); //Actualizar la lista

    void delete(String id); //Eliminar por ID

    Optional<TeacherDTO> findById(String id); // Buscar por el ID

}
