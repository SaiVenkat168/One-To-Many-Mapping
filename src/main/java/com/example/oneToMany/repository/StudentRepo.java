package com.example.oneToMany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.oneToMany.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>
{

}
