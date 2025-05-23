package com.alibou.example.service;

import com.alibou.example.dto.SchoolDto;
import com.alibou.example.SchoolMapper;
import com.alibou.example.repository.SchoolRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SchoolService {


    private final SchoolMapper schoolMapper;
    private final SchoolRepository schoolRepository;

    public SchoolService(SchoolMapper schoolMapper, SchoolRepository schoolRepository) {
        this.schoolMapper = schoolMapper;
        this.schoolRepository = schoolRepository;
    }
    public SchoolDto create(SchoolDto dto){
        var school= schoolMapper.toSchool(dto);
        var savedSchool= schoolRepository.save(school);
        return schoolMapper.toSchoolDto(savedSchool);
    }

    public List<SchoolDto> findAll(){
        return schoolRepository.findAll()
                .stream()
                .map(schoolMapper::toSchoolDto)
                .collect(Collectors.toList());

    }
}
