package com.eduardo.listaDeCompra.domain;

import java.util.Objects;

public class Endereco {

	private Integer id;
	private Integer numero;
	private String bairro;
	private Integer rua;
	private String cep;
	private Cidade cidade;
	
	public Endereco(Integer id, Integer numero, String bairro, Integer rua, String cep, Cidade cidade) {
		super();
		this.id = id;
		this.numero = numero;
		this.bairro = bairro;
		this.rua = rua;
		this.cep = cep;
		this.cidade = cidade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Integer getRua() {
		return rua;
	}

	public void setRua(Integer rua) {
		this.rua = rua;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cep, id, numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		return Objects.equals(cep, other.cep) && Objects.equals(id, other.id) && Objects.equals(numero, other.numero);
	}
}
