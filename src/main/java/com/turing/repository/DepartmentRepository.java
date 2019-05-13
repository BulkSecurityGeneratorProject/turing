package com.turing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turing.domain.Departments;

public interface DepartmentRepository extends JpaRepository<Departments, Long>{

}
