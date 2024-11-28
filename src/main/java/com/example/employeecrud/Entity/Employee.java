package com.example.employeecrud.Entity;

import jakarta.persistence.*;
import lombok.Getter;// the lombok dependency has been used here
import lombok.Setter;

import static jakarta.persistence.GenerationType.AUTO;
@Getter// here we have used lombok getter and setter to easen the code
@Setter
@Entity
@Table(name ="EmployeeData")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    @Column(name = "FName")
    private String Firstname;
    @Column(name = "lastName")
    private String Lastname;
    @Column(name = "Email")
    private String Email;
    @Column(name = "Age")
    private int Age;
    @Column(name = "Salary")
    private double salary;
}
