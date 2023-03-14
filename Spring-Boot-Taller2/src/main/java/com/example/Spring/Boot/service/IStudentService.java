package com.example.Spring.Boot.service;

import com.example.Spring.Boot.dto.StudentDTO;

import java.util.List;
import java.util.Optional;

public interface IStudentService {
    void save(StudentDTO studentDTO); //Guardar

    List<StudentDTO> getAll(); //Obtener lista

    void update(StudentDTO studentDTO); //Actualizar la lista

    void delete(String id); //Eliminar por ID

    Optional<StudentDTO> findById(String id); // Buscar por el ID

}
