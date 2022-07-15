package br.com.alura.microservice.fornecedor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.microservice.fornecedor.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}
