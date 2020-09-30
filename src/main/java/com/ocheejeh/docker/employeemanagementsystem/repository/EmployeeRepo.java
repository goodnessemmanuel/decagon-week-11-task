package com.ocheejeh.docker.employeemanagementsystem.repository;


import com.ocheejeh.docker.employeemanagementsystem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    Employee findByEmail(String emailAddress);
}
