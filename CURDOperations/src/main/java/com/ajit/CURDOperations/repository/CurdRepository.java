package com.ajit.CURDOperations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ajit.CURDOperations.model.Student;

@Repository
public interface CurdRepository extends JpaRepository<Student, Integer>{


}
