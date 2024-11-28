package com.example.employeecrud.Repository;

import com.example.employeecrud.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {// when we have extended the jpa repository that means we have already imported the usual methods

// here we are putting the methods that are not already defined
    List<Employee> findByLastname(String lastName);
    List<Employee> findByFirstname(String firstName);
    List<Employee> findByAge(int Age);
    List<Employee> findBySalary(double Salary);List<Employee> findByEmail(String Email);


}
