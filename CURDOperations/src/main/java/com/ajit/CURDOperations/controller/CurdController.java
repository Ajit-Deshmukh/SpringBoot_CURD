package com.ajit.CURDOperations.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajit.CURDOperations.model.Student;
import com.ajit.CURDOperations.service.CurdService;

@RestController
@RequestMapping("/CURD")
public class CurdController {

	@Autowired
CurdService service;	

//To fetch all records from database	
@GetMapping("/displayAll")
public List<Student> displayAll(){
	return service.displayAll();
}

//To fetch all single records from database	
@GetMapping("/displayone/{rollNo}")
public Optional<Student> displayOne(@PathVariable int rollNo){
	return service.displayOneRecord(rollNo);
}

//To update record in database using roll number	
@PostMapping("/update/{rollNo}")
public void updateRecord(@PathVariable int rollNo,@RequestBody Student student) {
student.setRollNo(rollNo);
service.updateRecord(student);
}

//To insert new record in the database	
@PostMapping("/insert")
public void insertRecord(@RequestBody Student student) {
	service.insertRecord(student);
}

@DeleteMapping("/delete/{rollNo}")
public void deleteRecord(@PathVariable int rollNo) {
	service.deleteRecord(rollNo);
}
}
