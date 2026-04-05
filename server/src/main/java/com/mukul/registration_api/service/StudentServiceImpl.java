package com.mukul.registration_api.service;

import com.mukul.registration_api.model.Student;
import com.mukul.registration_api.repository.StudentRepository;
import com.mukul.registration_api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repository;

    @Override
    public Student registerStudent(Student student) {
        return repository.save(student);
    }
}