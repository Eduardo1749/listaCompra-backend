package com.eduardo.listaDeCompra.domain;

public class ItemCompra {
	
	private Integer id;
	private float preco;
	private String observacao;
	private Compra compra;
	private Produto produto;
	
	public ItemCompra(Integer id, float preco, String observacao, Compra compra, Produto produto) {
		super();
		this.id = id;
		this.preco = preco;
		this.observacao = observacao;
		this.compra = compra;
		this.produto = produto;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
