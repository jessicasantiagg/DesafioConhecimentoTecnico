package com.example.demo.app.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.app.entesdeclaradosutilidadepublicaestadual.EntesDeclaradosUtilidadePublicaEstadualService;

@RestController
@RequestMapping("/desafio")
public class DesafioController {

	@Autowired
	private EntesDeclaradosUtilidadePublicaEstadualService entesService;

	@GetMapping(value = "/getEntesDeclaradosUtilidadePublicaEstadual")
	public ResponseEntity<String> getEntesDeclaradosUtilidadePublicaEstadual() {
		String list = entesService.getEntesDeclaradosUtilidadePublicaEstadualJSON();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/getEntesDeclaradosUtilidadePublicaEstadual/filterByNomeEntidade")
	public ResponseEntity<String> getEntesDeclaradosUtilidadePublicaEstadualByNomeEntidade(
			@RequestParam("search") String search) {
		String response = entesService.filterByNomeEntidade(search);
		return ResponseEntity.ok().body(response);
	}

	@GetMapping(value = "/getEntesDeclaradosUtilidadePublicaEstadual/filterById")
	public ResponseEntity<String> getEntesDeclaradosUtilidadePublicaEstadualSearch(@RequestParam("id") Long id) {
		String response = entesService.filterById(id);
		return ResponseEntity.ok().body(response);
	}

	@GetMapping(value = "/getEntesDeclaradosUtilidadePublicaEstadualWithPagination")
	public ResponseEntity<String> getEntesDeclaradosUtilidadePublicaEstadualWithPagination(
			@RequestParam("offset") int offset, @RequestParam("limit") int limit) {
		String response = entesService.getWithPagination(offset, limit);
		return ResponseEntity.ok().body(response);
	}
}
