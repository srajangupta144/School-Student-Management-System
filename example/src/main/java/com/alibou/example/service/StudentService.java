package com.alibou.example.service;

import com.alibou.example.dto.StudentDto;
import com.alibou.example.StudentMapper;
import com.alibou.example.repository.StudentRepository;
import com.alibou.example.dto.StudentResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {
    private final StudentRepository repository;

    private final StudentMapper studentMapper;

    public StudentService(StudentRepository repository, StudentMapper studentMapper) {
        this.repository = repository;
        this.studentMapper = studentMapper;
    }

    public StudentResponseDto saveStudent(
            StudentDto dto
    ) {
        var student = studentMapper.toStudent(dto);
        var savedStudent = repository.save(student);
        return studentMapper.toStudentResponseDto(savedStudent);

    }

    public List<StudentResponseDto> findAllStudent(){

        return repository.findAll()
                .stream()
                .map(studentMapper::toStudentResponseDto)
                .collect(Collectors.toList());
    }

    public StudentResponseDto findStudentById(Integer id) {

        return repository.findById(id)
                .map(studentMapper::toStudentResponseDto)
                .orElse(null);

    }

    public List<StudentResponseDto> findStudentsByName(String name) {
        return repository.findAllByFirstnameContaining(name)
                .stream()
                .map(studentMapper::toStudentResponseDto)
                .collect(Collectors.toList());
    }

    public void delete(Integer id){
        repository.deleteById(id);
    }
}
