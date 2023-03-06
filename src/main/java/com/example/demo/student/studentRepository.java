package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepository extends JpaRepository<Student,Long> {

}
