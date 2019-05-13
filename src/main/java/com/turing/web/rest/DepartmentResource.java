package com.turing.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turing.domain.Departments;
import com.turing.repository.DepartmentRepository;

@RestController
@RequestMapping("/api")
public class DepartmentResource {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@GetMapping("/departments")
	public ResponseEntity<List<Departments>> getAll(){
		List<Departments> result =  departmentRepository.findAll();
		return new ResponseEntity<>(result, new HttpHeaders(), HttpStatus.OK);
	}
	
	@GetMapping("/departments/{department_id}")
	public ResponseEntity<Departments> getAll(@PathVariable Long department_id){
		Departments result =  departmentRepository.findById(department_id).get();
		return new ResponseEntity<>(result, new HttpHeaders(), HttpStatus.OK);
	}
}
