package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="students")
public class StudentController {
    private final StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(value={"","/"})
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

//    @GetMapping("/students")
//    List<Student> all(){
//        return studentService.getStudents();
//    }
    @PostMapping(value = "/add")
    public void registerNewStudent(@RequestBody Student student){
        studentService.addNewStudent(student);
    }
}
