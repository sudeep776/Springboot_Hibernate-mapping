package com.JPA.Mapping.repositories;

import com.JPA.Mapping.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
