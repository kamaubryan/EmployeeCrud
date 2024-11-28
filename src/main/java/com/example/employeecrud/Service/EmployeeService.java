package com.example.employeecrud.Service;

import com.example.employeecrud.Entity.Employee;
import com.example.employeecrud.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    // here we are going to import the employee repository file and instantiate it using @Autowired
    @Autowired
    EmployeeRepository employeeRepository;

    // here is where we have to define the methods in user repository
    // saving an employee with all his/her details
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // getting all the employees in a batch
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // getting a single employee using their id
    public Employee getEmployeeById(long id) {
        return employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("not found"));
    }

    // Updating employee details
    public Employee updateEmployee(long id, Double salary, String firstName, String lastName, String email) {
        // Fetch the existing employee
        Employee existingEmployee = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with ID: " + id));

        // Update employee details
        existingEmployee.setSalary(salary);
        existingEmployee.setFirstName(firstName);
        existingEmployee.setLastName(lastName);
        existingEmployee.setEmail(email);
        // Save and return the updated employee
        return employeeRepository.save(existingEmployee);
    }

    // deleting the employee using the id
    public Employee deleteEmployee(long id) {
        Employee existingEmployee = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("not found"));
        employeeRepository.deleteById(id);
        return existingEmployee;
    }

    public List<Employee> getEmployeeByFirstName(String firstName) {
        return employeeRepository.findByFirstName(firstName);
    }

    public List<Employee> getEmployeeByLastName(String lastName) {
        return employeeRepository.findByLastName(lastName);
    }

    public List<Employee> getEmployeeByEmail(String email) {
        return employeeRepository.findByEmail(email);
    }

    public List<Employee> getEmployeeBySalary(Double Salary) {
        return employeeRepository.findBySalary(Salary);
    }

}

