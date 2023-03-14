package com.example.Spring.Boot.service.implement;

import com.example.Spring.Boot.dto.StudentDTO;
import com.example.Spring.Boot.repository.ICourseRepository;
import com.example.Spring.Boot.service.IStudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImplement implements IStudentService {

    private final ICourseRepository repository;

    public CourseServiceImplement(ICourseRepository repository) { this.repository = repository; }
    @Override
    public void save(StudentDTO studentDTO) {

    }

    @Override
    public List<StudentDTO> getAll() {
        return null;
    }

    @Override
    public void update(StudentDTO studentDTO) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Optional<StudentDTO> findById(String id) {
        return null;
    }
}
