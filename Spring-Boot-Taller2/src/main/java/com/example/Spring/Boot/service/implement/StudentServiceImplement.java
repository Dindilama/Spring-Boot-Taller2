package com.example.Spring.Boot.service.implement;

import com.example.Spring.Boot.dto.StudentDTO;
import com.example.Spring.Boot.repository.IStudentRepository;
import com.example.Spring.Boot.repository.entity.Student;
import com.example.Spring.Boot.service.IStudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentServiceImplement implements IStudentService {
    private final IStudentRepository repository;

    public StudentServiceImplement(IStudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(StudentDTO studentDTO) {
        if (!repository.existsById(studentDTO.getId())){
            repository.save(new Student(studentDTO));
        }
    }

    @Override
    public List<StudentDTO> getAll() {
        List<Student> students = (List<Student>)repository.findAll();
        return students.stream()
                .map(student -> new StudentDTO(student))
                .collect(Collectors.toList());
    }

    @Override
    public void update(StudentDTO studentDTO) {
        Optional<Student> student = repository.findById(studentDTO.getId());
        if (student.isPresent()){
            repository.save(new Student((studentDTO)));
        }
    }

    @Override
    public void delete(String id) {
        Optional<Student> student = repository.findById((id));
        if (student.isPresent()){
            repository.save(new Student());
        }
    }

    @Override
    public Optional<StudentDTO> findById(String id) {
        Optional<Student> student = repository.findById(id);
        return student.map(tr -> new StudentDTO(tr));
    }
}
