package com.hw.hibernate.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.hw.hibernate.model.Employee;

@Repository
public class EmployeeDao {
	
	@Autowired
    private HibernateTemplate template;
 
    public HibernateTemplate getTemplate() {
        return template;
    }
 
    public void setTemplate(HibernateTemplate template) {
        this.template = template;
    }
 
    // Get all employees from the database  
    public List<Employee> getAllEmployees() {          
        List<Employee> employees = getTemplate().loadAll(Employee.class);
 
        for(Employee c : employees)
            System.out.println(c.toString());
 
        return employees;
    }
 
    // Get Employee by id from the database
    public Employee getEmployee(int id) {     
        Employee employee = (Employee) getTemplate().get(Employee.class, new Integer(id));
        System.out.println(employee.toString());
        return employee;
    }

}
