package com.ifce.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ifce.br.model.Admin;
@Repository
public interface AdminRepository extends JpaRepository<Admin,Long>{

}
