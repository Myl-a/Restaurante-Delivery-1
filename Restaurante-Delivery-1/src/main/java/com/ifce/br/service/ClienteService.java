package com.ifce.br.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ifce.br.model.Cliente;
import com.ifce.br.repository.ClienteRepository;
@Service

public class ClienteService {
	@Autowired
	private ClienteRepository clienteRepo;
	
	public void cadastrarCliente(Cliente cliente) {
		clienteRepo.save(cliente);
	}

}
