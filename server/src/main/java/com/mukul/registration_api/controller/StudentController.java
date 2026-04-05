package com.mukul.registration_api.controller;

import com.mukul.registration_api.model.Student;
import com.mukul.registration_api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//@CrossOrigin(origins = {
//        "http://localhost:5173"
//})
@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/students")
    public Student registerStudent(@RequestBody Student student) {
        return studentService.registerStudent(student);
    }
}
//import com.mukul.registration_api.service.StudentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class StudentController {
//    @Autowired
//    StudentService studentService;
//
//    @RequestMapping("/")
//    public String home() {
//        return studentService.home();
//    }
//
//    @RequestMapping(value = "/register", method = RequestMethod.POST)
//    public Student register(@RequestBody Student student) {
//        return studentService.register(student);
//    }
//}
