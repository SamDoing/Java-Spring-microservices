package br.com.sam.microservice.loja.dto;

public class ItemDaCompraDTO {
	private long id;
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	private int quantidade;
}
