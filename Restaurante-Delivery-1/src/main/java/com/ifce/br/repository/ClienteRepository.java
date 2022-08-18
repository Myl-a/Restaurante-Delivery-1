package com.ifce.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifce.br.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {

}
