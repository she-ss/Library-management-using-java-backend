package com.example.mproject1.services;

import com.example.mproject1.models.Admin;
import com.example.mproject1.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    AdminRepository adminRepository;

    public void create(Admin admin){
        adminRepository.save(admin);
    }

    public Admin find(Integer adminId){
        return adminRepository.findById(adminId).orElse(null);
    }
}
