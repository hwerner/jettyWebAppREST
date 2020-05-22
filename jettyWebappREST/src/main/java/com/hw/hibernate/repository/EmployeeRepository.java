package com.hw.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hw.hibernate.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
