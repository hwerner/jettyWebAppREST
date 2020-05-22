package com.hw.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hw.hibernate.dao.EmployeeDao;
import com.hw.hibernate.model.Employee;

@Service
public class EmployeeService {

	 @Autowired
	    private EmployeeDao edao;
	 
	    public List<Employee> getAllEmployees() {
	        return edao.getAllEmployees();
	    }
	 
	    @Transactional
	    public Employee getEmployee(int id) {
	        return edao.getEmployee(id);
	    } 
}
