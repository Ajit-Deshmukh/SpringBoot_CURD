package com.ajit.CURDOperations.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajit.CURDOperations.model.Student;
import com.ajit.CURDOperations.repository.CurdRepository;

@Service
public class CurdService {
	
@Autowired
CurdRepository repo;

	public List<Student> displayAll() {
	return repo.findAll();
	}

	public void updateRecord(Student student) {
    repo.save(student);
	}

	public void insertRecord(Student student) {
	repo.save(student);	
	}

	public Optional<Student> displayOneRecord(int rollNo) {
		return repo.findById(rollNo);
	}

	public void deleteRecord(int rollNo) {
    repo.deleteById(rollNo);		
	}

	

}
