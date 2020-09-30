package com.ocheejeh.docker.employeemanagementsystem.repository;

import com.ocheejeh.docker.employeemanagementsystem.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Long> {
}
