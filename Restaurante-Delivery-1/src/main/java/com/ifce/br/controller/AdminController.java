package com.ifce.br.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ifce.br.model.Admin;
import com.ifce.br.service.AdminService;

@Controller
public class AdminController {
	@Autowired
	
	private AdminService adminService;

	@GetMapping("login")
	public String loginAdmin() {
		return "/login";
	}
	
	@GetMapping("cadastroadmin")
	public ModelAndView adminFormulario () {
		ModelAndView mv = new ModelAndView ("cadastroAdmin");
		return mv;
	}
	
	@PostMapping("/salvar")
	public ModelAndView cadastrarGerente (@Validated Admin admin, BindingResult result) {
		ModelAndView mv = new ModelAndView ("login");
		if(result.hasErrors()) {
			return mv;
		}
		mv.addObject("mensagem", "Sucesso ao Cadastrar!");
		adminService.cadastrarAdmin(admin);
		return mv;
	}
}