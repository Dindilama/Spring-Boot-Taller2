package com.example.Spring.Boot.service.implement;

import com.example.Spring.Boot.dto.TeacherDTO;
import com.example.Spring.Boot.repository.ITeacherRepository;
import com.example.Spring.Boot.repository.entity.Teacher;
import com.example.Spring.Boot.service.ITeacherService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TeacherServiceImplement implements ITeacherService {
    private final ITeacherRepository repository;

    public TeacherServiceImplement(ITeacherRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(TeacherDTO teacherDTO) {
        if (!repository.existsById(teacherDTO.getId())){
            repository.save(new Teacher(teacherDTO));
        }
    }

    @Override
    public List<TeacherDTO> getAll() {
        List<Teacher> teachers = (List<Teacher>)repository.findAll();
        return teachers.stream()
                .map(teacher -> new TeacherDTO(teacher))
                .collect(Collectors.toList());
    }

    @Override
    public void update(TeacherDTO teacherDTO) {
        Optional<Teacher> teacher = repository.findById(teacherDTO.getId());
        if (teacher.isPresent()){
            repository.save(new Teacher((teacherDTO)));
        }
    }

    @Override
    public void delete(String id) {
        Optional<Teacher> teacher = repository.findById((id));
        if (teacher.isPresent()){
            repository.save(new Teacher());
        }
    }

    @Override
    public Optional<TeacherDTO> findById(String id) {
        Optional<Teacher> teacher = repository.findById(id);
        return teacher.map(tr -> new TeacherDTO(tr));
    }
}
