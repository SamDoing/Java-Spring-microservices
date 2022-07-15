package br.com.sam.microservice.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sam.microservice.loja.dto.CompraDTO;
import br.com.sam.microservice.loja.service.CompraService;

@RestController
@RequestMapping("/compra")
public class CompraController {
	
	@Autowired
	CompraService compraService;
	
	@PostMapping
	public void relizaCompra(@RequestBody CompraDTO compraDTO) {
		compraService.realizaCompra(compraDTO);
	}
	@GetMapping
	public void test() {
		CompraDTO compraDTO = new CompraDTO();
		compraService.realizaCompra(compraDTO);
	}
}
