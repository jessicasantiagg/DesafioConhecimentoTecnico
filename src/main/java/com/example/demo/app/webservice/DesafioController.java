package com.example.demo.app.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/desafio")
public class DesafioController {

	@Autowired
	private DesafioService authService;

	@GetMapping("/getEntesDeclaradosUtilidadePublicaEstadual")
	public String getEntesDeclaradosUtilidadePublicaEstadual() {
		return authService.getEntesDeclaradosUtilidadePublicaEstadual().toString();
	}
}
