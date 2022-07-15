package br.com.sam.microservice.loja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sam.microservice.loja.client.FornecedorClient;
import br.com.sam.microservice.loja.dto.CompraDTO;

@Service
public class CompraService {
	
	@Autowired
	FornecedorClient cleint;
	
	public void realizaCompra(CompraDTO compraDTO) {
		
		var response = cleint.getInfoPorEstado(compraDTO.getEndereco().getEstado());
		
		System.out.print(response.getEndereco());	
	}

}
