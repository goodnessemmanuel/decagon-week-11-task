package com.ocheejeh.docker.employeemanagementsystem.services.serviceimpl;

import com.ocheejeh.docker.employeemanagementsystem.model.Admin;
import com.ocheejeh.docker.employeemanagementsystem.repository.AdminRepo;
import com.ocheejeh.docker.employeemanagementsystem.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService
{
    AdminRepo adminRepo;

    @Autowired
    public AdminServiceImpl(AdminRepo adminRepo)
    {
        this.adminRepo = adminRepo;
    }

    @Override
    public boolean valid(Admin admin)
    {
        return admin.getPassword().equalsIgnoreCase("admin")
                && admin.getUserName().equalsIgnoreCase("admin");
    }
}
