package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    @Autowired
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents(){

        return studentService.getStudents();

    }



    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
       studentService.addNewStudent(student);
    }
    
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }

    @PutMapping("/{id}")
    public void updateStudent(
       @PathVariable("id") Long id,
       @RequestParam(required = false) String name,
       @RequestParam(required = false) String email
    ){
       studentService.updateStudent(id, name, email) ;
    };


    
}
