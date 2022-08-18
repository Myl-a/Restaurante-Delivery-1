package com.ifce.br.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifce.br.model.Admin;
import com.ifce.br.repository.AdminRepository;

@Service
public class AdminService {
	@Autowired
private AdminRepository adminRepo;
	
	public void cadastrarAdmin(Admin admin) {
	adminRepo.save(admin);
	}
	
}
