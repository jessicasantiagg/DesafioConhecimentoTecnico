package com.example.demo.app.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.app.entesdeclaradosutilidadepublicaestadual.EntesDeclaradosUtilidadePublicaEstadualService;

@RestController
@RequestMapping("/desafio")
public class DesafioController {

	@Autowired
	private EntesDeclaradosUtilidadePublicaEstadualService entesService;

	@GetMapping(value = "/getEntesDeclaradosUtilidadePublicaEstadual")
	public ResponseEntity<String> getEntesDeclaradosUtilidadePublicaEstadual() {
		String response = entesService.getEntesDeclaradosUtilidadePublicaEstadual();
		return ResponseEntity.ok().body(response);
	}
}
