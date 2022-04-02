package com.eduardo.listaDeCompra.domain;

import java.util.Objects;

import com.eduardo.listaDeCompra.domain.enums.TipoProduto;

public class Produto {

	private Integer id;
	private String nome;
	private String marca;
	private TipoProduto tipo;
	
	public Produto() {
		super();
	}

	public Produto(Integer id, String nome, String marca, TipoProduto tipo) {
		super();
		this.id = id;
		this.nome = nome;
		this.marca = marca;
		this.tipo = tipo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public TipoProduto getTipo() {
		return tipo;
	}

	public void setTipo(TipoProduto tipo) {
		this.tipo = tipo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(id, other.id);
	}
}
