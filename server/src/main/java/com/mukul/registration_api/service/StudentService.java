package com.mukul.registration_api.service;

import com.mukul.registration_api.model.Student;

public interface StudentService {

    Student registerStudent(Student student);
}

//package com.mukul.registration_api.service;
//
//import com.mukul.registration_api.controller.Student;
//import com.mukul.registration_api.repository.StudentRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class StudentService {
//    @Autowired
//    StudentRepository studentRepository;
//
//    public String home() {
//        return "To register, visit http://localhost:8080/register";
//    }
//
//    public Student register(Student student) {
//        return studentRepository.save(student);
//    }
//}
