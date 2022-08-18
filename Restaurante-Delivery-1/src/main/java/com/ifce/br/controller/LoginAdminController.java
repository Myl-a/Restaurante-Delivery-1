package com.ifce.br.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ifce.br.model.Admin;
import com.ifce.br.service.AdminService;

@Controller
public class LoginAdminController {
	@Autowired
	private AdminService adminService;

	@GetMapping("loginadmin")
	public ModelAndView loginadmin() {
		ModelAndView mv = new ModelAndView("loginadmin");
		mv.addObject("admin", new Admin());
		return mv;
	}

}
