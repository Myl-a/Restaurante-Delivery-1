package com.ifce.br.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ifce.br.model.Cliente;
import com.ifce.br.service.ClienteService;
@Controller

public class ClienteController {
	@Autowired
	private ClienteService clienteService;

	
	@GetMapping("logincliente")
	public String loginCliente() {
		return "logincliente";
	}
	
	@GetMapping("cadastrocliente")
	public ModelAndView clienteFormulario () {
		ModelAndView mv = new ModelAndView ("cadastroCliente");
		return mv;
	}
	
	@PostMapping("salvarcliente")
	public ModelAndView cadastrarGerente (@Validated Cliente cliente, BindingResult result) {
		ModelAndView mv = new ModelAndView ("logincliente");
		if(result.hasErrors()) {
			return mv;
		}
		mv.addObject("mensagem", "Sucesso ao Cadastrar!");
		clienteService.cadastrarCliente(cliente);
		return mv;
	}

}
